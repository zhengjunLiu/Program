import java.util.Scanner;
public class xiti21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double [][] a=new double[4][3];
    
    Scanner input=new Scanner(System.in);
     System.out.println("输入 点1：");
     a[1][1]=input.nextDouble();
     a[1][2]=input.nextDouble();
     System.out.println("输入 点2：");
     a[2][1]=input.nextDouble();
     a[2][2]=input.nextDouble();
     System.out.println("输入 点3：");
     a[3][1]=input.nextDouble();
     a[3][2]=input.nextDouble();
     double side1=Math.sqrt((a[1][2]-a[2][2])*(a[1][2]-a[2][2])+(a[1][1]-a[2][1])*(a[1][1]-a[2][1]));
     double side2=Math.sqrt((a[1][2]-a[3][2])*(a[1][2]-a[3][2])+(a[1][1]-a[3][1])*(a[1][1]-a[3][1]));
     double side3=Math.sqrt((a[2][2]-a[3][2])*(a[2][2]-a[3][2])+(a[2][1]-a[3][1])*(a[2][1]-a[3][1]));
     double s=(side1+side2+side3)/2;
     double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
     System.out.println("面积为："+area);
     
     
     
    
    
	}

}
