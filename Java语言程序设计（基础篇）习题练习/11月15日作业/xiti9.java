import java.util.Scanner;
public class xiti9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double []a=new double[10];
     Scanner input=new Scanner(System.in);
     System.out.print("输入10个数");
     for(int i=0;i<10;i++)a[i]=input.nextDouble();
     double min=min(a);
     System.out.println("最小的数="+min);
     
	}
	public static double min(double [] array){
		double min=array[0];
		for(int i=1;i<10;i++){
			if(min>array[i])min=array[i];
		}
		return min;
	}

}
