#include <pthread.h>
#include <stdlib.h>
#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <string.h>
#include <unistd.h>
#include <errno.h>
#include <sched.h>
#include <copyfile.h>
#include <sys/time.h>


/* External Declarations	*/
#define DEBUG 0
#define DEBUG_W 1
#define DEBUG_W_OUT 0
#define DEBUG_R 1
#define BSIZE 256
#define HIGH  30
#define MID   20
#define LOW   10

struct timeval tv;
int MAXLINE;
int fp;
int r_line;
pthread_mutex_t  lock;
pthread_mutex_t lock_r;
pthread_cond_t WriteAvailable, ReadAvailable;
mode_t mode = S_IRUSR | S_IWUSR | S_IRGRP | S_IROTH;

/*
  Writer Thread
 */
void * writer_thread( void *arg ) { // WRITER
  int tmp = r_line;
  gettimeofday(&tv,NULL);  
  if(DEBUG_W){ printf("%d\t Writer %d\twaiting-for-lock\n",tv.tv_usec, (int)arg);}
  
  
  pthread_mutex_lock ( &lock);  /* Enter critical section  */ 


  gettimeofday(&tv,NULL);  
  if(DEBUG_W){      printf("%d\t Writer %d\tlock-acquired\n",tv.tv_usec, (int)arg);}
  int id = (int)arg;
  int i;
  char buf[BSIZE];
  for(i = 1; i<6; i++) {
    r_line++;
    sprintf(buf,"<W %d, %d> \n",id,i);
    write(fp,buf,strlen(buf));
    if(DEBUG_W_OUT){
      printf( "<W %d, %d>\n",id, i );
    }
  }
  
  pthread_mutex_unlock ( &lock);  /* Enter critical section  */
/*   pthread_cond_signal(&ReadAvailable); */
  gettimeofday(&tv,NULL);   
  if(DEBUG_W){printf("%d\t Writer %d\tlock-released\n",tv.tv_usec, (int)arg);}
  return( 0 );
  
}
/*
  Reader
 */

void * reader_thread( void *arg ) { // READER
  int tmp = r_line;
  gettimeofday(&tv,NULL); 
  fprintf(stderr,"%d\t Reader %d\twaiting-for-lock\n",tv.tv_usec, (int)arg);

    while(tmp != MAXLINE){
    pthread_mutex_lock ( &lock);    /* Enter critical section  */
    
    gettimeofday(&tv,NULL); 
    fprintf(stderr,"%d\t Reader %d\tlock-acquired\n",tv.tv_usec, (int)arg);
    
    int fd_r = open("writer_out_file", O_RDONLY|O_SYNC);
    char buf[BSIZE];
    int temp=0;int cnt=0;
    while ( (temp =  read(fd_r, buf, BSIZE)) > 0) ++cnt;close(fd_r);
    if(DEBUG){
      printf("\n%d\n", r_line);
    }
    char buf2[BSIZE];
    sprintf(buf2,"reader-%d_out_file.t",(int)arg);


    char  buffer[BSIZE];
    ssize_t  count;
    mode_t   perms;
    int	fdin,  fdout;
    perms   = 0740;
    
    if  ( (fdin = open ("writer_out_file",  O_RDONLY))  == -1) {
        perror ( "Error in opening the input file:");
        exit (2);
    }

    /*    printf( "Input file opened with descriptor %d \n", fdin);  */
 
    if  ( (fdout = open (buf2, (O_WRONLY | O_CREAT),  perms)) == -1 ) {
        perror ( "Error in creating the output file:");
        exit (2);
    }
    /*    printf( "Output file opened with descriptor %d \n", fdout);  */
   
    while ( (count=read(fdin, buffer, BSIZE)) > 0 ) {
      if ( write (fdout, buffer, count) != count ) 
             perror ("Error in writing" );
    } 

    if ( count == -1 ) {
       perror ( "Error while reading the input file: ");
    }

    close(fdin);
    close(fdout);

    
     
    pthread_mutex_unlock ( &lock);   /* exit critical seciton  */
    
    gettimeofday(&tv,NULL);
    if(DEBUG_R){
      fprintf(stderr,"%d\t Reader %d\tlock-released\n",tv.tv_usec, (int)arg);
    }  
    
      }
  return( 0 );
  
  
}  


/* main - start here.					*/

int main( int argc, char **argv ) {
  int n;
  pthread_t htid, wtid;

  pthread_t * writer_id;

  pthread_t * reader_id;

  pthread_mutex_init( &lock, NULL);
  pthread_mutex_init( &lock_r, NULL);
  pthread_cond_init( &WriteAvailable, NULL);
  pthread_cond_init( &ReadAvailable, NULL);

  if(argc != 3) { 
    fprintf(stderr, "Please type the number of Reader and Wirter\n");
    return 0;
  }  
  if(DEBUG){
    printf("R : %c, W : %c",*argv[1], *argv[2]);
  }
  char * reader_no_t = argv[1];
  char * writer_no_t = argv[2];
  int reader_no = atoi(reader_no_t);
  int writer_no = atoi(writer_no_t);
 
  MAXLINE = writer_no * 5 * 20;

  printf("reader : %d writer : %d\n", reader_no, writer_no);
    /**************************************/
  writer_id = (pthread_t *) malloc (( sizeof(pthread_t))* writer_no);

  reader_id = (pthread_t *) malloc (( sizeof(pthread_t))* reader_no);


 //  fd = open(filename, O_WRONLY | O_CREAT | O_TRUNC, mode);
  if( ( fp = open("writer_out_file" ,O_WRONLY |O_SYNC| O_CREAT | O_TRUNC, mode)) == NULL ) {
    fprintf(stderr, "Error ");
    exit(1);
  }
 




  /*Writer */
  int i; int i2;
  for (i2 = 0; i2 < 20; i2++){for(i =1; i< writer_no+1 ; i++){ 
      if ( n = pthread_create( &writer_id[i-1], NULL, writer_thread, (int) i ) ) {
       fprintf( stderr, "pthread_create: %s\n", strerror( n ) );
       exit( 1 );
      }
    }
  }
  int i3;

  
  for (i3 = 0 ; i3 < reader_no ; i3++){
    if ( n = pthread_create( &reader_id[i], NULL, reader_thread, (int) i3+1) ) {
      fprintf( stderr, "pthread_create: %s\n", strerror( n ) );
      exit( 1 );
    }
  }
  //sleep(1);  
  char buf[BSIZE];

  int temp=0;int cnt=0;
  while ( (temp =  read(fp, buf, BSIZE)) > 0) ++cnt;
  

  
  int j;


/*   if(r_line == MAXLINE){ */
  for (j=0;j<writer_no;j++){
    if ( n = pthread_join( writer_id[j], NULL ) ) {
     fprintf( stderr, "pthread_join: %s\n", strerror( n ) );
     exit( 1 );
    }
  }
/*   } */
  printf( "\n" );
  sleep(1);
  close(fp);
  return( 0 );
}
