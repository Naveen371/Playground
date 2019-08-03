#include<stdio.h>
int main()
{
  int n,s,i,a[100];
  scanf("%d",&n);
  
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&s);
  for(i=0;i<n;i++)
  {
    if(a[i]==s)
    {
      printf("%d",i+1);
    return 0;
  }
        
  }
  printf("%d isn't present in the array.",s);
  
  
  //Type your code here
  return 0;
}