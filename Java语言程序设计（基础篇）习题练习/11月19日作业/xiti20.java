import java.io.*;
import java.util.Scanner;
public class xiti20 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("new.txt");
	    PrintWriter output=new PrintWriter(file);
	    output.println("java Exercise9_20 file oidString newString");
	    output.close();
	    Scanner input=new Scanner(file);
	    String a=new String();
	    int i=0;
	    while (input.hasNext()){
	    a=input.nextLine();
	    a=a.replace("oidString" ,"newString");
	    
	    }
	    input.close();
	    output=new PrintWriter(file);
	    output.println(a);
	    output.close();
	}

}
