
public class xiti27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean y=true;
		int k=0;
     for(int year=2001;year<2100;year++){
	    if(year%4==0){
	    	 if(year%100==0){
	    		 if(year%400==0)
	    			 y=true;
	    		 else
	    			 y=false;
	    		 
	    		 
	    	 }
	    	 else
	    		 y=true;
	    	
	     }
	     else
	    	 y=false;
	    if(y){
	          System.out.print(year+"  " );	
	          k++;
	    	if(k%10==0)
	    		System.out.println("");
	    	}
	    	
	    }
	}

}
