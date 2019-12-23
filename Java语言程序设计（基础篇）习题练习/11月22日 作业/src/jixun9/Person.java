package jixun9;

public class Person {
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdree() {
		return adree;
	}
	public void setAdree(String adree) {
		this.adree = adree;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	private String name;
	  private String adree;
	  private int phone;
	  private String Email;
	
		public Person(){
			  name="liu";
			  adree="beijin";
			  phone=123456;
			  Email="1234@qq.com";
		  }
		 public Person(String name1,String adree1,int phone1,String Email1){
			  name=name1;
			  adree=adree1;
			  phone=phone1;
			  Email=Email1;
		  }
		 public String toString(){
			 return "Person"+"\n姓名："+name+"\n地址: "+adree+"\n电话： "+phone+"\nE-mail:"+Email; 
		  } 
}
