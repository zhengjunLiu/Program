#include<iostream>
using namespace std;
void test(double a,double b,double &c)
{
  c=a+b;
}
int main()
{
	double  x,y,z;
	cout<<"输入 2个数";
		cin>>x>>y;
   test (x,y,z);
   cout<<"和为"<<z<<endl;
   return 0;
} 