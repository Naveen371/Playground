#include<stdio.h>
int main()
{
  int n,i,j,b[100];
  scanf("%d",&n);
  while(n!=0)
  {
    b[i]=n%2;
    n=n/2;
    i++;
  }
  for(j=i;j>=0;j--)
  {
    printf("%d",b[j]);
  }
  
  //Type your code here
  return 0;
}