#include<stdio.h>
int main()
{
  float r,a;
  float arc;
  float pi=3.14;
  scanf("%f\n",&r);
  scanf("%f",&a);
  arc = ((a/360)*2*pi*r);
 printf("%0.2f",arc);
  return 0;
}