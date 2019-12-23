
public class xiti26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int  j=10000; j<=100000;j=j+10000){
	    	  double x=1;
	    	  for( double i=1.0;i<=j;i=i+1.0){
	    		   x=x+1/jiecheng(i);
	    		  
	    	   }
	    	 System.out.println("µ±i="+j+"Ê±"+"e="+x);
	       }
   
	}
   static double jiecheng(double n){
	   double i=n;
	   double j=1;
	   while (i>0){
		 j=j*i;
		 i--;
	   }
	   return j;
   }
}
