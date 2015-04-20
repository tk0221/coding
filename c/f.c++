#include <unistd.h>
#include <stdio.h>
int main()
{
  int a = 0;
  while(1)
    {
      fork();
      printf("%d\n",a++);
    }
}
