#include<iostream>
using namespace std;
#include"binaiylinktree.h"

BinaryLinkTree::BinaryLinkTree(){}//���캯��
 BinaryLinkTree::~BinaryLinkTree()//��������
	{
		for(int i=0;i<length;i++)
		{
			if(parentLinkArray[i])
				delete parentLinkArray[i];
		}
		delete[] parentLinkArray; 
	}
	void BinaryLinkTree::Init(void)//��ʼ������:����ȫ����������ʽ���룬�����ڵĽ�����롮������
		           //�û��Լ���֤�������ݵ���ȷ��
	{
		cout<<"������������Ľ�������";
		int num;
		cin>>num;
		
		cout<<"������������Ľ�����У�����ȫ����������ʽ��#�Ž�������";
		char ch=getchar();

		length=1;
		for(int i=1;i<=num;i++)
		{
			length=length*2;
		}
		parentLinkArray=new BNode*[length];//�����洢˫�׽��ָ��Ķ�̬����
		for(i=0;i<length;i++)
		{
			parentLinkArray[i]=NULL;  //��ʼ��Ϊ��
		}

		int pos=1;  //�����±�0�����ã����Դ�1��ʼ

		while(ch!='#') //����#������
		{
			if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))//�޶��������Ϊ�ַ�
			{
				BNode* temp=new BNode;   //�ڶ��Ϸ����ڴ�
				temp->data=ch;
				temp->LChild=temp->RChild=NULL;

				parentLinkArray[pos]=temp;  //���ָ�뱣����������
				if(1==pos)//��һ�����Ϊ�����
				{
					root=temp;
				}
				else
				{
					if(0==(pos%2)) //posΪż������Ϊ��˫�׽�������
					{
						(parentLinkArray[pos/2])->LChild=temp;
					}
					else//posΪ��������Ϊ��˫�׽����Һ���
					{
						(parentLinkArray[pos/2])->RChild=temp;
					}
				}
				pos++;
			}
			if(ch==',')//����Ϊ�����������账��
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
