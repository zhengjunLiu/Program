
import java.util.Scanner;

public class Yuan2
{
public static void main(String[] args)
{
Scanner input  = null;
System.out.print("��������");
input = new Scanner (System.in);
String name=input.next();

System.out.print("����ÿ�ܹ���ʱ��");
input = new Scanner (System.in);
int time = input.nextInt();

System.out.print("����ÿСʱ�Ĺ���");
input = new Scanner (System.in);
int money=input.nextInt();

System.out.print("������������˰˰��");
input = new Scanner (System.in);
double shui1=input.nextDouble();

System.out.print("����������˰˰��");
input = new Scanner (System.in);
double shui2=input.nextDouble();

double a1=time*money*shui1;
double a2=time*money*shui2;
double a3=a1+a2;
double a4=time*money-a3;
System.out.println("����"+name+"\nÿ�ܹ���Сʱ"+time+"\nÿСʱ����"+money+"\n��������˰"+a1+"\n������˰˰��"+a2+"\n������"+a3+"\nʵ������"+a4);

 



}
 }