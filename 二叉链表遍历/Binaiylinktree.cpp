#include<iostream>
using namespace std;
#include"binaiylinktree.h"

BinaryLinkTree::BinaryLinkTree(){}//构造函数
 BinaryLinkTree::~BinaryLinkTree()//析构函数
	{
		for(int i=0;i<length;i++)
		{
			if(parentLinkArray[i])
				delete parentLinkArray[i];
		}
		delete[] parentLinkArray; 
	}
	void BinaryLinkTree::Init(void)//初始化函数:已完全二叉树的形式输入，不存在的结点输入‘，’；
		           //用户自己保证输入数据的正确性
	{
		cout<<"请输入二叉树的结点个数：";
		int num;
		cin>>num;
		
		cout<<"请输入二叉树的结点序列（按完全二叉树的形式，#号结束）：";
		char ch=getchar();

		length=1;
		for(int i=1;i<=num;i++)
		{
			length=length*2;
		}
		parentLinkArray=new BNode*[length];//用来存储双亲结点指针的动态数组
		for(i=0;i<length;i++)
		{
			parentLinkArray[i]=NULL;  //初始化为空
		}

		int pos=1;  //数组下标0处不用，所以从1开始

		while(ch!='#') //输入#，结束
		{
			if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))//限定结点内容为字符
			{
				BNode* temp=new BNode;   //在堆上分配内存
				temp->data=ch;
				temp->LChild=temp->RChild=NULL;

				parentLinkArray[pos]=temp;  //结点指针保存在数组中
				if(1==pos)//第一个结点为根结点
				{
					root=temp;
				}
				else
				{
					if(0==(pos%2)) //pos为偶数，则为其双亲结点的左孩子
					{
						(parentLinkArray[pos/2])->LChild=temp;
					}
					else//pos为奇数，则为其双亲结点的右孩子
					{
						(parentLinkArray[pos/2])->RChild=temp;
					}
				}
				pos++;
			}
			if(ch==',')//输入为‘，’，则不予处理。
			{
				pos++;
			}
			
			ch=getchar();
		}
			
		

	}
	void 	BinaryLinkTree::PreOrder(BNode *t)
	{
		 if(t)
		 {
			 cout<<t->data;
			 PreOrder(t->LChild);
		     PreOrder(t->RChild);

		 }

	 
	}
	void 	BinaryLinkTree::InOrder(BNode *t)
	 {
		 if(t)
		 {
			 InOrder(t->LChild);
			 cout<<t->data;
			 
			 InOrder(t->RChild);

		 }

	 }

	void 	BinaryLinkTree::PostOrder(BNode *t)
	{

		 if(t)
		 {
			 
			 PostOrder(t->LChild);
		     PostOrder(t->RChild);
			 cout<<t->data;

		 }

	}
