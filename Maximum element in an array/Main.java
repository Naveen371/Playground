#include<stdio.h>
int main()
{
  int a[10],n,i,l,h;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  l=a[0];
  for(i=0;i<n;i++)
  {
  if(a[i]>l)
    l=a[i];
    
  }
  printf("%d",l);
  	//type your code here
}