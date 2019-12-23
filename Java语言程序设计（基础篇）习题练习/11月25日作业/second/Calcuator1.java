package second;

public class Calcuator1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		if(args.length!=3)
			System.out.println("Usage:java Calculator operandl operator operand2");
		
		if(Double.parseDouble(args[0])%1!=0)
			System.out.println("input string:"+args[0]);
		if(Double.parseDouble(args[2])%1!=0)
			System.out.println("input string:"+args[2]);
		int result=0;
		switch(args[1].charAt(0)){
	     case '+':result=Integer.parseInt(args[0])+Integer.parseInt(args[2]);break;
	     case '-':result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);break;
	     case '*':result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);break;
	     case '/':result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);break;
		}
	}

}
