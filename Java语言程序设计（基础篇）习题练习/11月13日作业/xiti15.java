import java.util.Scanner;
public class xiti15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner input = new Scanner (System.in);
	     		 System.out.print("�����һ��������(����1)"); 
	     		 int a=input.nextInt();
	 	      System.out.print("����ڶ���������������1)");
	          int b=input.nextInt();
	    
	      if(a<b){
	    	  int temp=a;
	    	  a=b;
	    	  b=temp;
	        }
	        int c = b-1;
	        boolean y=true;
	      while(y){   
	    	  if(a%c==0&&b%c==0)
	    		    y=false;
	    		else
	    		     c--;
	    		  
	    		  
	       }
	     System.out.println(c+"��"+a+"��"+b+"�����Լ��");
	}

}
