import java.util.Scanner;
public class xiti1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double a,b=0,c=0,sum=0,average;
      System.out.print("��������0Ϊ������־����");
      Scanner input = new Scanner (System.in);
      a=input.nextInt();
      while(0!=a){
    	  if(a>0){
    		  b++;
    		  sum=sum+a;
    		  
    	  }
    	  if(a<0){
    		  c++;
    		  sum=sum+a;
    		  
    	  }
    	  a=input.nextInt();
      }
      average=sum/(b+c);
      System.out.print("��������Ϊ"+b+"\n��������Ϊ"+c+"\n��="+sum+"\nƽ��ֵ="+average); 
	}

}
