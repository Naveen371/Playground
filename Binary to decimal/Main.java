#include<stdio.h>
int main()
{
  int n,i=0,r,d;
  scanf("%d",&n);
  while(n>0)
  {
    r=n%10;
  n=n/10;
  d+=r*pow(2,i);
    
  i++;
}
  printf("%d",d);
  //Type your code here
  return 0;
}