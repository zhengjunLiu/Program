package second;

public class IllegalaTrangleException extends Exception{
    public  IllegalaTrangleException(){
    	super("两边之和小于第三边") ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try{
		Triangle a=new  Triangle("blue",true,1,1,3);
	}catch(IllegalaTrangleException b){
		System.out.println(b.toString());
	}
	}

}
