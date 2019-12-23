
public class xiti25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
      for(int  j=10000; j<=100000;j=j+10000){
    	  double x=0;
    	  int flag=1;
    	   for( double i=1.0;i<=j;i=i+1.0){
    		   x+=flag*(1.0/(2.0*i-1.0));
    		   flag*=-1;
    	   }
    	   x=4.0*x;
    	   System.out.println("µ±i="+j+"Ê±"+"¦Ð="+x);
       }
	}

}
