import java.util.Scanner;
public class xiti10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num1=(int)(Math.random()*100);
    int num2=(int)(Math.random()*100);
    int num3=num1+num2;
    System.out.println(num1+"+"+num2+"=£¿");
    System.out.println("ÊäÈë  ´ğ°¸");
    Scanner input=new Scanner(System.in);
    int answer=input.nextInt();
    if(num3==answer)
    
    	System.out.println("Right");
    else
    	System.out.println("Worry");
    	
	}

}
