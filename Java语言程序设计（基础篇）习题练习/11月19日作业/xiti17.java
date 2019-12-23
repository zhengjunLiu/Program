
import java.io.*;
import java.util.Scanner;
public class xiti17 {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file=new File("danci.txt");
	    PrintWriter output=new PrintWriter(file);
        output.println("abc def ghi");
        output.println("abc def ghi");
        output.println("abc def ghi");
        output.close();
        Scanner input=new Scanner(file);
        int i=0,j=0,k=0;
        String a=new String();
        while (input.hasNext()){
        	 a=input.nextLine();
        	i++;
        	 
        }
        input.close();
        input=new Scanner(file);
        while (input.hasNext()){
        	a=input.next();
        	k=k+a.length()+1;
        	j++;
        }
        input.close();
        k=k-i;
   System.out.println("有"+k+"个字符"+"有"+j+"个单词"+"有"+i+"行");
	}

}
