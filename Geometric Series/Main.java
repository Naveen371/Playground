#include<stdio.h>
#include<math.h>
int main()
{
  int o,e,n,i,k=0,l=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++){
    if(i%2==1)
    {
      o=pow(2,k);
      k++;
    }
    
    else 
    {
      e=pow(3,l);
      l++;
    }
  }
  if(n%2==1)
    printf("%d",o);
  else
    printf("%d",e);
  //type your code here
  return 0;
}