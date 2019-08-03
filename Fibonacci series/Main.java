#include<stdio.h>
int main()
{
 int a=0,b=1,c,n,i;
  scanf("%d",&n);
  printf("%d ",a);
  printf("%d ",b);
for(i=3;i<=n;i++)
{
  
  c=a+b;
  a=b;
  b=c;
 
   printf("%d ",c);
}
  
 

  return 0;
}