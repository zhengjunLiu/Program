package second;

import java.util.Scanner;

public class HextoDecimalConverstion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);  
       System.out.print("输入：");
       String  hex=new String();
	  try{
		   hex=input.nextLine();
		   System.out.println("转化为10进制为"+HextoDecimal(hex.toUpperCase()));
	    }catch(HexFormatException a){
		  System.out.println(a.toString());
		  
	  }
	  
	}

	private static int HextoDecimal(String hex) throws HexFormatException{
		
		int decimalvalue=0;
		for(int i=0;i<hex.length();i++){
			char hexchar=hex.charAt(i);
			if(hexchar<'0'||hexchar>'9'||hexchar>'F'||hexchar<'A')
				            throw new HexFormatException();
			decimalvalue=decimalvalue*16+hexcahrtoDecimal(hexchar);
		}
		return decimalvalue;
	}

	private static int hexcahrtoDecimal(char ch) {
		// TODO Auto-generated method stub
		
	if(ch>='A'&&ch<'F')
			return 10+ch-'A';
		else
			return ch-'0';
	}

}
