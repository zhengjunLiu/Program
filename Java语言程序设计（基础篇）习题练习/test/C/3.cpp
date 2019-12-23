#include<iostream>
using namespace std;
int main()
{
	int a[5][5],i=0,j=2,n=1,x,y;
   for(x=0;x<5;x++)
   {
	  for(y=0;y<5;y++)
	  {
		  a[x][y]=0;
	  }
   }
   a[i][j]=n;
   do{
	   n=n+1;
	   i=i-1;
	   j=j-1;
	   if(i<0)i=i+5;
	   if(j<0)j=j+5;
	   //if(i>4)i=i+5;
	   //if(j>4)j=j+5;
      if(a[i][j]!=0)
	   {
		   i=i+2;
		   j=j+1;
		   if(i>4)i=i-5;
	       if(j>4)j=j-5;
		   a[i][j]=n;
	   }
	   else
		   a[i][j]=n;
   }while(n<25);
  for(x=0;x<5;x++)
  {
	  for(y=0;y<5;y++)
	  {
		  cout<<a[x][y]<<'\t';
  		  }
	  cout<<endl;
  }
  cout<<endl;
  return 0;
}