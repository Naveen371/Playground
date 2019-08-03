#include<stdio.h>
int main()
{
  int a,b,i,l,g;
  scanf("%d\t%d",&a,&b);
  for(i=1;i<=a&&i<=b;i++)
  {
    if(a%i==0&&b%i==0)
      g=i;
  }
  l=(a*b)/g;
  printf("%d",l);
  //Type your code here
  return 0;
}