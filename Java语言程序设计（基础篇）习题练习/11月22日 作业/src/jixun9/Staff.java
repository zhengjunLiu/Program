package jixun9;

public class Staff extends Employee{
  private String title;
  public Staff(){
	  super();
	  title=new String("�����ʦ");
	  
  }
  public Staff(Employee emp,String titl){
	  super(new Person(emp.getName(),emp.getAdree(),emp.getPhone(),emp.getEmail()),emp.getRoom(),emp.getWage(),emp.getDay());
	  title=new String(titl);
	  
  }
	public String toString(){
		 return "Staff"+"\n������"+getName()+"\n��ַ:"+getAdree()
				 +"\n�绰��"+getPhone()+"\nE-mail"+getEmail()
				 +"\n�칫�ң�"+getRoom()+"\n����:"+getWage()
				 +"\n��Ƹ���ڣ�"+ getDay().toString() +"\n�ƺ�:"+ title; 
	  }
}
