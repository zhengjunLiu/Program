import javax.swing.JOptionPane;
public class Yuan
{
public static void main(String[] args)
{
String name=JOptionPane.showInputDialog(null,"姓名");
String time=JOptionPane.showInputDialog(null,"每周工作小时");
int t=Integer.parseInt(time);
String money =JOptionPane.showInputDialog(null,"每小时工资");
double m=Double.parseDouble(money);

String shui1 =JOptionPane.showInputDialog(null,"联邦所得税税率");
double s1=Double.parseDouble(shui1);
String shui2 =JOptionPane.showInputDialog(null,"州所得税税率");
double s2=Double.parseDouble(shui2);
double a1=t*m*s1;
double a2=t*m*s2;
double a3=a1+a2;
double a4=t*m-a3;
//JOptionPane.showMessageDialog(null,"姓名"+name+"\n每周工作小时"+time);
JOptionPane.showMessageDialog(null,"姓名"+name+"\n每周工作小时"+time+"\n每小时工资"+money+"\n联邦所得税"+a1+"\n州所得税税率"+a2+"\n总收入"+a3+"\n实际收入"+a4);


}
}