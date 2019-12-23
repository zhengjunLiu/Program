

public class xiti29 {
	
	public static void main(String[] args) {
		String a=new String("ab#12#453");
		String b=new String("#");
       String []c=new String[a.length()] ;
       c=split(a,b);
       for(int i=0;i<c.length;i++){
    	   System.out.println("c["+i+"]="+c[i]);
    	   if(c[i+1]==null)break;
       }
	}

public static String[]split(String s,String regex){
	String []b=new String[s.length()];  
	String s1=new String(s);
	if(regex.length()==1){
		   char []a=new char[1];
            int i=0,j,k=0;
			a[i]=regex.charAt(i);
			  
	        k=s1.indexOf(a[0]); 
	    for( i=0;s1.length()>0;i++){
	
	      b[i]=s1.substring(0, k);
	      i++;
	      b[i]=s1.substring(k, k+1);
	      s1=s1.substring(k+1);
	      k=s1.indexOf(a[0]); 
	
				if(k<0){
					b[i+1]=s1;
					break;
				}	
	 
		
	  

	
	
	}
	}
	else
		b=s1.split(regex);
	return b;
}
}