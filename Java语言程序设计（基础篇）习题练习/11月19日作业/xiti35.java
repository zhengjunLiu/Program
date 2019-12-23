
import java.util.Scanner;
public class xiti35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner (System.in);
		  System.out.println("输入");
      String a=input.next();
      String []b=new String[a.length()/3];
      b=jiyin(a);
      for(int i=1;i<b.length;i++){
    	  if(b[i]!=null)System.out.println( b[i]);
      }
	}
public static String []jiyin(String s){
	String a=new String(s);
	 String []b=new String[a.length()/3];
	 int i=0;
	 for( i=0;i<a.length()/3;i++)b[i]=null;
	 i=0;
	if(a.indexOf("ATG")<0)System.out.println("无基因"); 
	   else
	   
	{
	  b[0]=a.substring(a.indexOf("ATG")+3);
	    
	    for(int k=0;k<a.length()/3;k++){
	    	if(b[0].indexOf("TAG")>0&&b[0].indexOf("TAA")>0&&b[0].indexOf("TGA")>0){
	    		i++;
		    	b[i]=b[0].substring(0, min(b[0].indexOf("TAG"),b[0].indexOf("TAA"),b[0].indexOf("TGA")));
		    	if(b[0].indexOf("ATG")>0)b[0]=b[0].substring(b[0].indexOf("ATG")+3);
		    	else
		    		break;
	    	}
	    	else
	    		if(b[0].indexOf("TAG")>0&&b[0].indexOf("TAA")>0){
	    		i++;
		    	b[i]=b[0].substring(0, min1(b[0].indexOf("TAG"),b[0].indexOf("TAA")));
		    	if(b[0].indexOf("ATG")>0)b[0]=b[0].substring(b[0].indexOf("ATG")+3);
		    	else
		    		break;
	    	}
	    		else
	    			if(b[0].indexOf("TGA")>0&&b[0].indexOf("TAA")>0){
	    		i++;
		    	b[i]=b[0].substring(0, min1(b[0].indexOf("TGA"),b[0].indexOf("TAA")));
		    	if(b[0].indexOf("ATG")>0)b[0]=b[0].substring(b[0].indexOf("ATG")+3);
		    	else
		    		break;
	    	}
	    		else
	    				if(b[0].indexOf("TAG")>0&&b[0].indexOf("TGA")>0){
	    		i++;
		    	b[i]=b[0].substring(0, min1(b[0].indexOf("TAG"),b[0].indexOf("TGA")));
		    	if(b[0].indexOf("ATG")>0)b[0]=b[0].substring(b[0].indexOf("ATG")+3);
		    	else
		    		break;
	    	}
	    	else
	    	 if(b[0].indexOf("TAG")>0){
	    		i++;
		    	b[i]=b[0].substring(0, b[0].indexOf("TAG"));
		    	if(b[0].indexOf("ATG")>0)b[0]=b[0].substring(b[0].indexOf("ATG")+3);
		    	else
		    		break;
	    	}
	    	 else
	    		 if(b[0].indexOf("TGA")>0){
	 	    		i++;
	 		    	b[i]=b[0].substring(0, b[0].indexOf("TGA"));
	 		    	if(b[0].indexOf("ATG")>0)b[0]=b[0].substring(b[0].indexOf("ATG")+3);
	 		    	else
	 		    		break;
	 	    	}
	    		 else
	    			 if(b[0].indexOf("TAA")>0){
	    		    		i++;
	    			    	b[i]=b[0].substring(0, b[0].indexOf("TAA"));
	    			    	if(b[0].indexOf("ATG")>0)b[0]=b[0].substring(b[0].indexOf("ATG")+3);
	    			    	else
	    			    		break;
	    		    	}
	    		 
	    			 else
	    			 {
	    				 i++;
	    				 b[i]=b[0].substring(0);
	    				 break;
	    				 
	    			 }
	    			    
	  }
	   
	}
	/*for(int j=0;j<a.length()/3;j++){
		if(b[j]==null)continue;
		else
			if(b[j].length()%3!=0)b[j]=null;
		}*/
	
	return b;
}
public static int min(int a,int b,int c){
	int min;
	min=a;
	if(min>b)min=b;
	if(min>c)min=c;
	return min;
}
public static int min1(int a,int b){
	int min;
	min=a;
	if(min>b)min=b;
	return min;
	
}
}
