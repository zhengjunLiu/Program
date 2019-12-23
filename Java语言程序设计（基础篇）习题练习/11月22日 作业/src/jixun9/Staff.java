package jixun9;

public class Staff extends Employee{
  private String title;
  public Staff(){
	  super();
	  title=new String("优秀教师");
	  
  }
  public Staff(Employee emp,String titl){
	  super(new Person(emp.getName(),emp.getAdree(),emp.getPhone(),emp.getEmail()),emp.getRoom(),emp.getWage(),emp.getDay());
	  title=new String(titl);
	  
  }
	public String toString(){
		 return "Staff"+"\n姓名："+getName()+"\n地址:"+getAdree()
				 +"\n电话："+getPhone()+"\nE-mail"+getEmail()
				 +"\n办公室："+getRoom()+"\n工资:"+getWage()
				 +"\n招聘日期："+ getDay().toString() +"\n称号:"+ title; 
	  }
}
