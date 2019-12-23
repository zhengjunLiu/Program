import java.util.Date;
public class xiti3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Date data=new Date();
    for(long i=10000l;i<1000000000000l;i=i*10l){
    	data.setTime(i);
    	 System.out.println(data.toString());
    }
    
	}

}
