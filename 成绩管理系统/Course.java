
public class Course {
  private  int Cid;
  private  String cname;
  private int xuef;
  private int  stime;
  public Course(int id1,String name1,int xuef1,int st){
	  Cid=id1;
	  cname=name1;
	 xuef=xuef1;
	 stime=st;
  }
public int getCid() {
	return Cid;
}
public void setCid(int cid) {
	Cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getXuef() {
	return xuef;
}
public void setXuef(int xuef) {
	this.xuef = xuef;
}
public int getStime() {
	return stime;
}
public void setStime(int stime) {
	this.stime = stime;
}
  
}
