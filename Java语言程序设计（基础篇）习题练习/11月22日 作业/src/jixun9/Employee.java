package jixun9;

public class Employee extends Person{

	private int room;
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public MyDate getDay() {
		return day;
	}
	public void setDay(MyDate day) {
		this.day = day;
	}
	private double wage;
	private MyDate day ;
	public Employee(){
		super();
		room=2012;
		wage=5000;
		day=new MyDate();
	}
	public Employee(Person per,int room1,double wage1 ,MyDate day1){
		super(per.getName(),per.getAdree(),per.getPhone(),per.getEmail());
		room=room1;
		wage=wage1;
		day=new MyDate(day1.getYear(),day1.getMonth(),day1.getDay());
	}
	public String toString(){
		 return  "Employee"+"\n姓名："+getName()+"\n地址:"+getAdree()
				 +"\n电话："+getPhone()+"\n E-mail:"
				 +getEmail()+"\n办公室："+getRoom()
				 +"\n工资:"+getWage()+"\n招聘日期："+ day.toString()  ; 
	  }
}
