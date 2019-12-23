import java.util.Scanner; 
public class xiti8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
			System.out.println("ÊäÈë£º");
    char a='A';
    int b=input.nextInt();
    a= (char) (a+(b-65));
    System.out.println("ASCIIÎª"+a);
	}

}
