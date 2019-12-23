

public class  Student{
    private int id;
    private String name;
    private String zhuangye;
    private String sex;
    private int birthday;
    private int phone;
    private int mima;
   public Student(int id1,String name1,String zhuangye1,String sex1,int birthday1,int phone1,int mima1){
	id=id1;
	name=name1;
	sex=sex1;
	zhuangye=zhuangye1;
	birthday=birthday1;
	phone=phone1;
	mima=mima1;
	
	
   }
   public Student(int id1,int mima1){
	  this.id=id1;
	  this.mima=mima1;
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
public String getZhuangye() {
	return zhuangye;
}
public void setZhuangye(String zhuangye) {
	this.zhuangye = zhuangye;
}
public int getBirthday() {
	return birthday;
}
public void setBirthday(int birthday) {
	this.birthday = birthday;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public void display(){
	
	System.out.println("学号"+id+"/n姓名"+name+"/n性别"+sex+"/n专业"+zhuangye+"/n生日"+birthday+"/n电话");
}
public int getMima() {
	return mima;
}
public void setMima(int mima) {
	this.mima = mima;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
/*public static void main(String[] args) {
	Query q =new Query();
	//Student st=new Student(001,"liu","OK","B",1994,722654,500);
   Student st=new Student(1,500);
    if(q.denglu(st)==null)System.out.println("错误");
    else {
    	Sc cs=q.chaxun(st.getId());
		System.out.println("好了");
	

}
}*/
}
