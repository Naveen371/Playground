#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%4==0)
  {
    if(n%100==0)
    {
      if(n%400==0)        
printf("LEAP YEAR");     
  else
    printf("NOT LEAP YEAR");
    }
  else
    printf("LEAP YEAR");
  }
    else
    printf("NOT LEAP YEAR");

  
  //Type your code here
  return 0;
}