#include<iostream>
using namespace std;
#include"binaiylinktree.h"
#include"circulate.h"
void chenxu(BNode *t)
{
	circulate c1;
    c1.EnteQueue(t);
    BNode *p;
	while(c1.Empty())
	{
		c1.deleQueue(p);
		cout<<p->data;
		if(p->LChild)
				c1.EnteQueue(p->LChild);
		if(p->RChild)
				c1.EnteQueue(p->RChild);


	}

}
void main(void)
{

	BinaryLinkTree temp;
	temp.Init();
	cout<<"����";
	temp.PreOrder(temp.getroot());
	cout<<endl;
	cout<<"����";
	temp.InOrder(temp.getroot());
	cout<<endl;
	cout<<"����";
	temp.PostOrder(temp.getroot());
	cout<<endl;
	cout<<"����";
	chenxu(temp.getroot());
	cout<<endl;
	



}
