#include <stdio.h>
#include<math.h>
int main()
{
  int b,e,o;
  scanf("%d",&b);
  scanf("%d",&e);
  if(e>=0)
  {
  o=pow(b,e);
    printf("%d",o);
  }
  else
  {
    printf("Wrong input");
  }
  	//Your code here       
    return 0;
}