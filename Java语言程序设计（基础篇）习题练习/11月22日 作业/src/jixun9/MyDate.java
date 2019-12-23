package jixun9;

public class MyDate {
   public int getYear() {
		return year;
   }
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
private int year;
   private int month;
   private int day;
   public MyDate(){
	   year=2013;
	   month=11;
	   day=21;
   }
   public MyDate(int a,int b,int c){
	   year=a;
	   month=b;
	   day=c;
   }
   public String toString(){
	   return "Äê£º"+year+"ÔÂ"+month+"ÈÕ"+day;
   }
}
