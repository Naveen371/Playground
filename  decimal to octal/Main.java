#include<stdio.h>
int main()
{
  int i,j,b[100],n;
scanf("%d",&n);
  while(n!=0)
  {
    b[i]=n%8;
    n=n/8;
    i++;
  }
  for(j=i-1;j>=0;j--)
  {
    printf("%d",b[j]);
  }
  //type your code here
  return 0;
}