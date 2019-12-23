#include <iostream.h>
#include <stdlib.h>
#include <string.h>
#include <fstream.h>
#define N 100
struct Student
{//结构体的成员结构
	char name[20];//姓名
	char  num[15];//学号
	float mscore;//数学成绩
	float pscore;//物理成绩
	float cscore;//c++成绩
	float escore;//英语成绩
	float aver;//平均成绩
};
#define LEN sizeof(struct Student)

int menu_select();                                        //菜单函数
void Readfromfile(struct Student head[N],char filename[40]);      //文件读入函数
int Query(struct Student head[N],char s[15]);                     //查询函数
void Insert(struct Student head[N],struct Student a);         //插入函数
void del(struct Student head[N],char s[15]);                   //删除函数
void Input(struct Student head[N]);                           //输出函数
void SubjectAverage(struct Student head[N]);                 //各门课程的平均成绩
void StudentAverage(struct Student head[N]);                  //各学生的平均成绩
void Change(struct Student head[N],char s[20]);         //修改某个学生的成绩
void HeightestScore(struct Student head[N]);            //求各科所有的最高分人及最高分

int menu_select()
{
	int i;
	do{
		system("cls");
		cout<<"1.创建纪录\n";
		cout<<"2.显示所有记录\n";
		cout<<"3.插入一条记录\n";
		cout<<"4.删除一条记录\n";
		cout<<"5.查询\n";		
		cout<<"0.退出\n";
		cout<<"请输入选择序号(0-5):";
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
		head[i].aver=-1;//用于判断数组长度
	}
	for(;;)
	{
		switch(menu_select())
		{
		case 1:
			cout<<"调用创建函数\n";
			cout<<"please input a filename:";
			cin>>filename;
            Readfromfile(head,filename);
            system("pause");
				break;
		case 2:
				cout<<"调用输出函数\n";
			    cout<<"全部的记录为:\n";
                Input(head);
			    system("pause");			
				break;
		case 3:
			   cout<<"调用插入函数,输入学生数据:\n";
				cin>>a.name>>a.num>>a.mscore>>a.pscore>>a.cscore>>a.escore;
				a.aver=(a.mscore+a.pscore+a.cscore+a.escore)/4;
				Insert(head,a); 
				system("pause"); 		
				break;
		case 4:
			   cout<<"请输入要删除的记录姓名,调用删除函数(只需要输入姓名) :\n";
				cin>>name;
                del(head,name);
                system("pause");
				break;
		case 5:			    
			    cout<<"请输入要查询的姓名，调用查询函数 :\n";
                cin>>name;
				i=Query(head,name);//返回该学生在结构体数组中的序号
				cout<<head[i].name<<head[i].num<<head[i].mscore<<head[i].pscore<<head[i].cscore<<head[i].escore<<head[i].aver<<endl;
                system("pause");
				break;			    
		case 0:
			    cout<<"谢谢使用~再见O(∩_∩)O~\n";
			    system("pause");
				exit(0);

		}
	}
}

void Readfromfile(struct Student head[N],char filename[40])
{//数据读入函数
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
	for(int j=0;head[i+1].aver!=-1;j++) //冒泡法按学号升序排列
		for(int k=0;head[i+1-j].aver!=-1;k++)
			if(strcmp(head[k].num,head[k+1])==1)
			tem=head[k];
			head[k]=head[k+1];
}

int Query(struct Student head[N],char s[15])
{//查询函数
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
{//插入函数
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
{//删除函数
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
{//输出函数
	int i=0;
	cout<<"姓名 "<<"学号 "<<"数学成绩 "<<"物理成绩 "<<"C++成绩 "<<"英语成绩 "<<"平均成绩 "<<endl;
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
	cout<<"数学平均分"<<aver[0]<<"物理平均分"<<aver[1]<<"C++平均分"<<aver[2]<<"英语平均分"<<aver[3]<<endl;
}

void StudentAverage(struct Student head[N])
{//各学生的平均成绩
	int i;
	for(i=0;head[i].aver!=-1;i++)
		head[i].aver=(head[i].mscore+head[i].pscore+head[i].cscore+head[i].escore)/4;
}
void Change(struct Student head[N],char s[20])
{         //修改某个学生的成绩
	int i;
	struct Student a;
	cout<<"请输入学生正确的数据:\n";
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
	cout<<"数学的最高分人是:";
	for(int i=0;head[i].aver!=-1;i++)
	{
		if(head[i].mscore==a[0]) 
			cout<<head[i].name<<" "<<a[0]<<endl;	
	}
	cout<<endl;
	cout<<"物理的最高分人是:";
	for(int i=0;head[i].aver!=-1;i++)
	{
		if(head[i].mscore==a[0]) 
			cout<<head[i].name<<" "<<a[1]<<endl;	
	}
	cout<<endl;
	cout<<"c++的最高分人是:";
	for(int i=0;head[i].aver!=-1;i++)
	{
		if(head[i].mscore==a[0]) 
			cout<<head[i].name<<" "<<a[2]<<endl;
		
	}
	cout<<endl;
	cout<<"数学英语的最高分人是:";
	for(int i=0;head[i].aver!=-1;i++)
	{
		if(head[i].mscore==a[0]) 
			cout<<head[i].name<<" "<<a[3]<<endl;
	}

}
		
