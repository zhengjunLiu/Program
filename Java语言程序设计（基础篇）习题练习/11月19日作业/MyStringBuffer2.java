
public class MyStringBuffer2 {
     
	 public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	private String string;
	
	
	public MyStringBuffer2(){
		 string =new String();
	 }
	 public MyStringBuffer2(char []a){
		 string=new String(a);
	 }
	 public MyStringBuffer2(String s){
		 string=new String(s);
	 }
	 public  MyStringBuffer2 insert(int offset,MyStringBuffer2 s2){
		
		 String string1 = string.substring(0,offset);
		 String string2 = string.substring(offset,string.length());
		 string1=string1.concat(s2.getString());
		 setString(string1.concat(string2));
		return s2;
		 
	 }
	 public  MyStringBuffer2 reverse(){
		 char [] a=new char[string.length()];
		for(int i=0,j=string.length();i<string.length();i++,j--){
			a[i]=string.charAt(j-1);
			
		}
		String b=new String(a);
		setString(b);
		return null;
	 }
	 public MyStringBuffer2 sbustring(int begin){
		 String b=new String();
		 b=string.substring(begin);
		 setString(b);
		 return null;
		 
	 }
	 public MyStringBuffer2 toUpperCase(){
		 char [] a=new char[string.length()];
		 int i;
		 for( i=0;i<string.length();i++)a[i]=string.charAt(i);
		 for( i=0;i<string.length();i++){
			 if(a[i]>'a'&&a[i]<'z'){
				 a[i]=(char)(a[i]-32);
			 }
		 }
		 String b=new String (a);
		 setString(b);
		return null;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringBuffer2 a=new MyStringBuffer2("Abc");
		MyStringBuffer2 b=new MyStringBuffer2("d");
		a.insert(1, b);
	
		System.out.println("插入后："+a.getString());
		a.reverse();
		System.out.println("倒叙后"+a.getString());
		a.sbustring(1);
		System.out.println("新子串"+a.getString());
		a.toUpperCase();
		System.out.println("转换大写后："+a.getString());
		
	}

}
