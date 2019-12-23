package jixun9;

public class Student extends Person {
   public  static final double dayi=1;
   public  static final double daer=2;
   public  static final double dasan=3;
   public  static final double dasi=4;
   public double getNianji() {
	return nianji;
}
public void setNianji(double nianji) {
	this.nianji = nianji;
}
private double nianji;
   public Student(){
	   super();
	    nianji = Student.dayi;
   }
   public Student(Person per,double a){
	   super(per.getName(),per.getAdree(),per.getPhone(),per.getEmail());
	    nianji = a;
   }
   public String toString(){
		 return "Student"+"\n姓名： "+getName()+"\n地址: "+getAdree()+"\n电话：  "+getPhone()+"\nE-mail:"+getEmail()+"\n年级：  "+nianji; 
	  }
} 
