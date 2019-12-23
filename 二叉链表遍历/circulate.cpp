#include<iostream>
using  namespace std;
#include"circulate.h"
circulate::circulate(int newINIlength,int newIncrement):INIlength(newINIlength),Increment(newIncrement)
{
	front=0;
	real=0;
	length=0;
	CURRENT=INIlength;
   data=new BNode *[INIlength+1];

}
void circulate::display()
	{
		if(0==length)
			cout<<"队列为空！"<<endl;
		else
		{
			cout<<"队列长度为："<<length<<endl;
			cout<<"队列内容为：";
			for(int i=front+1;i<real+1;i=(i+1)%INIlength)
				cout<<data[i]<<" ";
			
		}
		cout<<endl;
	}
void circulate::EnteQueue(BNode* value)
{
	if(length==INIlength)
	{
		int pos=(front+1)%CURRENT;
		BNode **temp=new BNode *[CURRENT+Increment];
	   for(int j=1;j<=length;j++)
	   {
		   temp[j]=data[pos];
	       pos=(pos+1)%CURRENT;
	   }
	   delete [] data;
	   data=temp;
	   front=0;
	   real=length;
	   CURRENT=CURRENT+Increment;
	}
	data[(real+1)%CURRENT]=value;
	real++;
	length++;
}
void circulate::deleQueue(BNode * &value)
{
	if(0==length)
		cout<<"错误"<<endl;
	else
	   {
		 value=data[(front+1)%CURRENT];
         front++;
		 length--;
	}

}
bool circulate::Empty()
{
	if(0==length)
		return false;
	else
		return true;
}
