import java.util.Scanner; 
public class xiti2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.out.println("���� �뾶��");
    Scanner input=new Scanner(System.in);
    double radius;
    radius=input.nextDouble();
    System.out.println("���� �ߣ�");
    double high;
    high=input.nextDouble();
    double area=radius*radius*3.1415926;
    double volume=area*high;
    System.out.println("Բ�����Ϊ��"+volume);
	}

}
