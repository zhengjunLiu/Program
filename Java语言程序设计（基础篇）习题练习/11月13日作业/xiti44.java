
public class xiti44 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=0,b=0,c=0,d=0;
		for(int i=1;i<=1000000;i++	){
		
			double x=(Math.random())*10;
            double y=(Math.random())*10;
           if(x<5) a++;
           
           else
        	   if(x>5){
		        	    if(y<5)b++;
		        	   else
		        		   {
		        		   if(y-5>x-5)c++;
		        		   else
		        			   d++;
		        		   }
        	   
                }
		}
		double date1=a/1000000;
		double date2=d/1000000;
		double date3=c/1000000;
		double date4=b/1000000;
		 System.out.print("�ڵ�һ��ͼ�ڸ���Ϊ"+date1+"\n�ڵڶ���ͼ�ڸ���Ϊ"+date2
				 +"\n�ڵ�����ͼ�ڸ���Ϊ"+date3+"\n�ڵ��ĸ�ͼ�ڸ���Ϊ"+date4); 
		
		
   
	}

}
