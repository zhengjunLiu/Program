
public class xiti14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=10;i<=100;i=i+10){
			double x=0;
			int flag=1;
			for(double j=1;j<=i;j++){
				x+=flag*1/(2*j-1);
				flag=flag*-1;
			}
		
		x=x*4;
		System.out.println("µ±i="+10+"m(i)="+x);
		}
			
	}

}
/*import java.util.Scanner;
 * Scanner input=new Scanner(System.in);
 
    System.out.println();*/