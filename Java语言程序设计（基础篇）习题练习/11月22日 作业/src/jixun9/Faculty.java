package jixun9;

public class Faculty extends Employee {
 public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
private double time;
 private String rank;
 public Faculty(){
	 super();
	 time =8.5;
	 rank=new String("��ʦ");
	 
 }
 public Faculty(Employee emp,double time1,String rank1){
	 super(new Person(emp.getName(),emp.getAdree(),emp.getPhone(),emp.getEmail()),emp.getRoom(),emp.getWage(),emp.getDay());
	 time =time1;
	 rank=new String(rank1);
	 
 }
	public String toString(){
		 return  "Faculty"+"\n������"+getName()+"\n��ַ:"+getAdree()+"\n�绰��"+getPhone()
				 +"\nE-mail"+getEmail()+"\n�칫�ң�"+getRoom()
				 +"\n����:"+getWage()+"\n��Ƹ���ڣ�"
				 + getDay().toString()+"\n�칫ʱ��"
				 +time+"\n����"+rank;   
	  }
}
