import javax.swing.JOptionPane;
public class Yuan
{
public static void main(String[] args)
{
String name=JOptionPane.showInputDialog(null,"����");
String time=JOptionPane.showInputDialog(null,"ÿ�ܹ���Сʱ");
int t=Integer.parseInt(time);
String money =JOptionPane.showInputDialog(null,"ÿСʱ����");
double m=Double.parseDouble(money);

String shui1 =JOptionPane.showInputDialog(null,"��������˰˰��");
double s1=Double.parseDouble(shui1);
String shui2 =JOptionPane.showInputDialog(null,"������˰˰��");
double s2=Double.parseDouble(shui2);
double a1=t*m*s1;
double a2=t*m*s2;
double a3=a1+a2;
double a4=t*m-a3;
//JOptionPane.showMessageDialog(null,"����"+name+"\nÿ�ܹ���Сʱ"+time);
JOptionPane.showMessageDialog(null,"����"+name+"\nÿ�ܹ���Сʱ"+time+"\nÿСʱ����"+money+"\n��������˰"+a1+"\n������˰˰��"+a2+"\n������"+a3+"\nʵ������"+a4);


}
}