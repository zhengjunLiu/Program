

import java.util.Scanner;

public class Yuan1
{
public static void main(String[] args)
{
System.out.print("输入姓名");
Scanner input = new Scanner (System.in);
String name=input.next();
System.out.print("输入每周工作时间");
int time = input.nextInt();
System.out.print("输入每小时的工资");
int money=input.nextInt();
System.out.print("输入联邦所得税税率");
double shui1=input.nextDouble();
System.out.print("输入州所得税税率");
double shui2=input.nextDouble();
double a1=time*money*shui1;
double a2=time*money*shui2;
double a3=a1+a2;
double a4=time*money-a3;
System.out.println("姓名"+name+"\n每周工作小时"+time+"\n每小时工资"+money+"\n联邦所得税"+a1+"\n州所得税税率"+a2+"\n总收入"+a3+"\n实际收入"+a4);

 



}
 }