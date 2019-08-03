#include<stdio.h>

int main()
{
  char str[100];
  int l,i,w=0;
  gets(str);
  l=strlen(str);
  for(i=0;i<l;i++){
    if(str[i]==' ')
    {
      w++;
    }
  }
    
    printf("%d",w+1);
    
  
  //Type your code here
  
}