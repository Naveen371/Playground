#include<stdio.h>
#include<math.h>
int main()
{
  int d;
  float pi=3.14;
  float area,r;
  scanf("%d",&d);
  r=(float)d/2;
  area=(pi*r*r);
  printf("%0.2f",area);
  //Type your code here
  return 0;
}