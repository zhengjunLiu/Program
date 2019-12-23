package src;

public class people {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	private long phone;
	public people(){
		name = null;
		phone = 0;
	}
	public people(String name1,long phone1){

		name=name1;
		phone=phone1;
		
	}
public people(String name1){
	name=name1;
	phone=0;
}
}

