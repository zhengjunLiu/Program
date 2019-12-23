package second;

public class Calcuator {

	public static void main(String[] args) {
	int result=0;	// TODO Auto-generated method stub
	if(args.length!=3)
		System.out.println("Usage:java Calculator operandl operator operand2");
	boolean y=true;
     try{   
     switch(args[1].charAt(0)){
     case '+':result=Integer.parseInt(args[0])+Integer.parseInt(args[2]);break;
     case '-':result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);break;
     case '*':result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);break;
     case '/':result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);break;
     }
    
    	 
		} catch (NumberFormatException a){
			System.out.println(a.toString());
			y=false;
			
    }
      if(y)  System.out.println(args[0]+" "+args[1]+" "+args[2]+"="+result );
   
	}

}
