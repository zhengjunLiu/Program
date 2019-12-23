

import java.util.Scanner;

public class Complex {

  public double getrealpart() {
	return a;
}
public void setA(double a) {
	this.a = a;
}
public double getImaginarypart() {
	return b;
}
public void setB(double b) {
	this.b = b;
}
private double a;
private double b; 
public Complex(){
	  a=0;
	  b=0;
  }
 public Complex(double c){
	  a=c;
	  b=0;
  }
 public Complex(double c,double d){
	  a=c;
	  b=d;
  }
public Complex add(Complex B){
		Complex c = new Complex() ;
		c.setA(a+B.getrealpart());
		c.setB(b+B.getImaginarypart());
		return c ;
		
	}
  public Complex substract(Complex B){
	  Complex c = new Complex() ;
		c.setA(a-B.getrealpart());
		c.setB(b-B.getImaginarypart());
		return c ;
  }
public Complex multiply(Complex B){
		Complex c = new Complex() ;
		c.setA(a*B.getrealpart()-b*B.getImaginarypart());
		c.setB(b*B.getrealpart()+a*B.getImaginarypart());
		return c ;
		 
	}
 public Complex divide(Complex B ){
	    Complex c = new Complex() ;
		c.setA((a*B.getrealpart()+b*B.getImaginarypart())/(B.getrealpart()*B.getrealpart()+B.getImaginarypart()*B.getImaginarypart()));
		c.setB((b*B.getrealpart()-a*B.getImaginarypart())/(B.getrealpart()*B.getrealpart()+B.getImaginarypart()*B.getImaginarypart()));
		return c ;
}
public double abs(){
	return Math.sqrt(a*a+b*b);
}
public String toString(){
	return a+"+"+b+"i";
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print("输入第一个复数的a，b:");
       double a,b;
       Scanner input=new Scanner(System.in);
       a=input.nextDouble();
       b=input.nextDouble();
       Complex A=new Complex(a,b);
       System.out.print("输入第二个复数的a，b:");
       a=input.nextDouble();
       b=input.nextDouble();
       Complex B=new Complex(a,b);
       Complex C=A.add(B);
       System.out.println(A.toString()+"+"+B.toString()+"="+C.toString());
       Complex D=A.substract(B);
       System.out.println(A.toString()+"-"+B.toString()+"="+D.toString());
       Complex E=A.multiply(B);
       System.out.println(A.toString()+"*"+B.toString()+"="+E.toString());
       Complex F=A.divide(B);
       System.out.println(A.toString()+"/"+B.toString()+"="+F.toString());
       System.out.println("|"+A.toString()+"| ="+A.abs());
	}

}
