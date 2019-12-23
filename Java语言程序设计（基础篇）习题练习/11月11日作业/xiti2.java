import java.util.Scanner; 
public class xiti2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.out.println("输入 半径：");
    Scanner input=new Scanner(System.in);
    double radius;
    radius=input.nextDouble();
    System.out.println("输入 高：");
    double high;
    high=input.nextDouble();
    double area=radius*radius*3.1415926;
    double volume=area*high;
    System.out.println("圆的体积为："+volume);
	}

}
