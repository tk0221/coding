#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

//goal : fork 1->2->3->4 and wait 4->3->2->1 exit

int main (int argc, char *argv[]) {
  pid_t childpid = 0;
  int i, n;


  if(argc != 2){
    fprintf(stderr, "Usage: %s processes\n", argv[0]);
    return 1;
  }

  n = atoi(argv[1]);
  for(i = 1; i < n ; i++)
    if((childpid = fork()) <=0)
      break;


  //  wait(childpid);
  while(wait(NULL) > 0);
  fprintf(stderr, "i:%d process ID:%ld parent ID:%ld child ID:%ld\n",
	  i, (long)getpid(), (long)getppid(), (long)childpid);
  return 0;
}
