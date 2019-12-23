#include <iostream.h>
#include <stdlib.h>
#include <string.h>
#include <fstream.h>
#define N 100
struct Student
{//�ṹ��ĳ�Ա�ṹ
	char name[20];//����
	char  num[15];//ѧ��
	float mscore;//��ѧ�ɼ�
	float pscore;//����ɼ�
	float cscore;//c++�ɼ�
	float escore;//Ӣ��ɼ�
	float aver;//ƽ���ɼ�
};
#define LEN sizeof(struct Student)

int menu_select();                                        //�˵�����
void Readfromfile(struct Student head[N],char filename[40]);      //�ļ����뺯��
int Query(struct Student head[N],char s[15]);                     //��ѯ����
void Insert(struct Student head[N],struct Student a);         //���뺯��
void del(struct Student head[N],char s[15]);                   //ɾ������
void Input(struct Student head[N]);                           //�������
void SubjectAverage(struct Student head[N]);                 //���ſγ̵�ƽ���ɼ�
void StudentAverage(struct Student head[N]);                  //��ѧ����ƽ���ɼ�
void Change(struct Student head[N],char s[20]);         //�޸�ĳ��ѧ���ĳɼ�
void HeightestScore(struct Student head[N]);            //��������е���߷��˼���߷�

int menu_select()
{
	int i;
	do{
		system("cls");
		cout<<"1.������¼\n";
		cout<<"2.��ʾ���м�¼\n";
		cout<<"3.����һ����¼\n";
		cout<<"4.ɾ��һ����¼\n";
		cout<<"5.��ѯ\n";		
		cout<<"0.�˳�\n";
		cout<<"������ѡ�����(0-5):";
		cin>>i;		
	}while(i<0 || i>5);
	return (i);	
}

void main()
{
	struct Student head[N],a;
	char name[20],filename[40];
	int i;
	for(i=0;i<N;i++)
	{
		head[i].escore=head[i].cscore=head[i].mscore=head[i].pscore=0;
		head[i].aver=-1;//�����ж����鳤��
	}
	for(;;)
	{
		switch(menu_select())
		{
		case 1:
			cout<<"���ô�������\n";
			cout<<"please input a filename:";
			cin>>filename;
            Readfromfile(head,filename);
            system("pause");
				break;
		case 2:
				cout<<"�����������\n";
			    cout<<"ȫ���ļ�¼Ϊ:\n";
                Input(head);
			    system("pause");			
				break;
		case 3:
			   cout<<"���ò��뺯��,����ѧ������:\n";
				cin>>a.name>>a.num>>a.mscore>>a.pscore>>a.cscore>>a.escore;
				a.aver=(a.mscore+a.pscore+a.cscore+a.escore)/4;
				Insert(head,a); 
				system("pause"); 		
				break;
		case 4:
			   cout<<"������Ҫɾ���ļ�¼����,����ɾ������(ֻ��Ҫ��������) :\n";
				cin>>name;
                del(head,name);
                system("pause");
				break;
		case 5:			    
			    cout<<"������Ҫ��ѯ�����������ò�ѯ���� :\n";
                cin>>name;
				i=Query(head,name);//���ظ�ѧ���ڽṹ�������е����
				cout<<head[i].name<<head[i].num<<head[i].mscore<<head[i].pscore<<head[i].cscore<<head[i].escore<<head[i].aver<<endl;
                system("pause");
				break;			    
		case 0:
			    cout<<"ллʹ��~�ټ�O(��_��)O~\n";
			    system("pause");
				exit(0);

		}
	}
}

void Readfromfile(struct Student head[N],char filename[40])
{//���ݶ��뺯��
	int i=0;
	Student tem;
	fstream file(filename,ios::in|ios::binary);
	if(!file)
	{
		cout<<"Can not open file:"<<filename<<endl;
		exit(0);
	}
	while(file.read((char*)(head+i),LEN))
		       i++;
	head[i].aver=-1;
	file.close();
	for(int j=0;head[i+1].aver!=-1;j++) //ð�ݷ���ѧ����������
		for(int k=0;head[i+1-j].aver!=-1;k++)
			if(strcmp(head[k].num,head[k+1])==1)
			tem=head[k];
			head[k]=head[k+1];
}

int Query(struct Student head[N],char s[15])
{//��ѯ����
	int i;
	for(i=0;i<N;)
	{
		if(!strcmp(head[i].name,s))
			break;
		i++;
	}
	return i;
}
void Insert(struct Student head[N],struct Student a)
{//���뺯��
	int i,j;
	for(i=0;i<N;)
	{
		if(strcmp(head[i].num,a.num)==1||head[i].aver==-1)
			break;
		i++;
	}
	if(head[i].aver==-1)
		head[i]=a;
	else
	{
		for(j=N-2;j>=i;j--)
			head[j+1]=head[j];
		head[i]=a;
	}
}
void del(struct Student head[N],char s[15])
{//ɾ������
	int i,j;
	for(i=0;i<N;)
	{
		if(strcmp(head[i].num,s)==0)
	     	break;
		i++;
	}
	for(j=i;j<N-1;j++)
		head[j]=head[j+1];
}
void Input(struct Student head[N])
{//�������
	int i=0;
	cout<<"���� "<<"ѧ�� "<<"��ѧ�ɼ� "<<"����ɼ� "<<"C++�ɼ� "<<"Ӣ��ɼ� "<<"ƽ���ɼ� "<<endl;
	while(head[i].aver!=-1)
	{
		cout<<head[i].name<<head[i].num<<head[i].mscore<<head[i].pscore<<head[i].cscore<<head[i].escore<<head[i].aver<<endl;
		i++;
	}
}
void SubjectAverage(struct Student head[N])
{
	int i;float aver[4];
	for(i=0;head[i].aver!=-1;i++)
	{	
		aver[0]+=head[i].mscore;
		aver[1]+=head[i].pscore;
		aver[2]+=head[i].cscore;
		aver[3]+=head[i].escore;
	 }
	for(int j=0;j<4;j++)
		aver[j]/=i;
	cout<<"��ѧƽ����"<<aver[0]<<"����ƽ����"<<aver[1]<<"C++ƽ����"<<aver[2]<<"Ӣ��ƽ����"<<aver[3]<<endl;
}

void StudentAverage(struct Student head[N])
{//��ѧ����ƽ���ɼ�
	int i;
	for(i=0;head[i].aver!=-1;i++)
		head[i].aver=(head[i].mscore+head[i].pscore+head[i].cscore+head[i].escore)/4;
}
void Change(struct Student head[N],char s[20])
{         //�޸�ĳ��ѧ���ĳɼ�
	int i;
	struct Student a;
	cout<<"������ѧ����ȷ������:\n";
	cin>>a.name>>a.num>>a.mscore>>a.pscore>>a.cscore>>a.escore;
	a.aver=(a.mscore+a.pscore+a.cscore+a.escore)/4;
	i=Query(head,s);
	head[i]=a;
}
void HeightestScore(struct Student head[N])
{
	float a[5]={0,0,0,0,0};
	for(int i=0;head[i].aver!=-1;i++)
	{
		if(head[i].mscore >a[0]) a[0]=head[i].mscore;
		if(head[i].pscore >a[1]) a[1]=head[i].pscore;
		if(head[i].cscore >a[2]) a[2]=head[i].cscore;
		if(head[i].escore >a[3]) a[3]=head[i].escore;
	}
	cout<<"��ѧ����߷�����:";
	for(int i=0;head[i].aver!=-1;i++)
	{
		if(head[i].mscore==a[0]) 
			cout<<head[i].name<<" "<<a[0]<<endl;	
	}
	cout<<endl;
	cout<<"�������߷�����:";
	for(int i=0;head[i].aver!=-1;i++)
	{
		if(head[i].mscore==a[0]) 
			cout<<head[i].name<<" "<<a[1]<<endl;	
	}
	cout<<endl;
	cout<<"c++����߷�����:";
	for(int i=0;head[i].aver!=-1;i++)
	{
		if(head[i].mscore==a[0]) 
			cout<<head[i].name<<" "<<a[2]<<endl;
		
	}
	cout<<endl;
	cout<<"��ѧӢ�����߷�����:";
	for(int i=0;head[i].aver!=-1;i++)
	{
		if(head[i].mscore==a[0]) 
			cout<<head[i].name<<" "<<a[3]<<endl;
	}

}
		
