#include<iostream>
using namespace std;
int main()
{
	double x,y,z,i,j;
	for(x=0;x<20;x++)
	{
		for(y=0;y<34;y++)
		{
			for(z=0;z<300;z++)
			{
				if(x+y+z==100)
				{
					if(5*x+3*y+z/3==100)
					{
						cout<<"����"<<x<<"ֻ   ";
					    cout<<"ĸ��"<<y<<"ֻ   ";
					     cout<<"С��"<<z<<"ֻ  "<<endl;  
					}
				}
				
			}
		}
	}
   return 0;
}