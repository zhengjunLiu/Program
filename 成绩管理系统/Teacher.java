import java.util.ArrayList;



public class Teacher {
private int id;
private String name;
private String sex;
private int  phone;
private int  mima;
public Teacher (int id1,String name1,String sex1,int phone1,int mima1){
	id=id1;
	name=name1;
	sex=sex1;
	
	phone=phone1;
	mima=mima1;
	
	
   }
public Teacher (int id1,int mima1)
{
	id=id1;
	mima=mima1;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public int getMima() {
	return mima;
}
public void setMima(int mima) {
	this.mima = mima;
}


}

