#include<iostream>
using namespace std;
void test(double a,double b,double &c)
{
  c=a+b;
}
int main()
{
	double  x,y,z;
	cout<<"���� 2����";
		cin>>x>>y;
   test (x,y,z);
   cout<<"��Ϊ"<<z<<endl;
   return 0;
} 