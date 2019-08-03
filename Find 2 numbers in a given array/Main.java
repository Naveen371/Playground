#include<stdio.h>
int main()
{
  int a[50],s1,s2,i,n,e1=-1,e2=-1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d %d",&s1,&s2);
  for(i=0;i<n;i++){
    if(s1==a[i]&&e1==-1)
  
    {
      e1=i;
    }
    if(s2==a[i]&&e2==-1)
  
    {
      e2=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",e1,e2);
}