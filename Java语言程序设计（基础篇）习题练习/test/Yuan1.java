

import java.util.Scanner;

public class Yuan1
{
public static void main(String[] args)
{
System.out.print("��������");
Scanner input = new Scanner (System.in);
String name=input.next();
System.out.print("����ÿ�ܹ���ʱ��");
int time = input.nextInt();
System.out.print("����ÿСʱ�Ĺ���");
int money=input.nextInt();
System.out.print("������������˰˰��");
double shui1=input.nextDouble();
System.out.print("����������˰˰��");
double shui2=input.nextDouble();
double a1=time*money*shui1;
double a2=time*money*shui2;
double a3=a1+a2;
double a4=time*money-a3;
System.out.println("����"+name+"\nÿ�ܹ���Сʱ"+time+"\nÿСʱ����"+money+"\n��������˰"+a1+"\n������˰˰��"+a2+"\n������"+a3+"\nʵ������"+a4);

 



}
 }