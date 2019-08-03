#include<stdio.h>
int main()
{
  int a,first,third,sum;
  scanf("%d",&a);
  first=a/100;
  third=a%10;
  sum=first+third;
  printf("%d",sum);
  //Type your code here
  return 0;
}