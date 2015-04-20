#include <stdio.h>
void main()
{
  execvl("/bin/sh","/bin/sh",NULL);
  exit(0);
}
