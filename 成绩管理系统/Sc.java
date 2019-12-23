
public class Sc {

	private int Sid;
	private int Cid;
	private int grade;
	public Sc(int id1,int id2,int grade1 ){
		Sid=id1;
		Cid=id2;
		grade=grade1;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public int getGrate() {
		return grade;
	}
	public void setGrate(int grate) {
		this.grade = grate;
	}
	
}
