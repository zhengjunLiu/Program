

import java.sql.*;

import java.util.*;

import java.text.SimpleDateFormat;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import com.microsoft.sqlserver.jdbc.*;
public class Query {
	int count=0;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	private Connection con;
	private PreparedStatement ps;
	public Query(){
		
		String url = "jdbc:sqlserver://localhost:1433;Database=Studentgrade";
		String user = "sa";
		String pwd = "076562";
		try { // ������������
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// ��������
			con = DriverManager.getConnection(url, user, pwd);
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "���������������!", "����",
					JOptionPane.WARNING_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "����",
					JOptionPane.WARNING_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "���ܽ������ӣ�", "����",
					JOptionPane.WARNING_MESSAGE);
		}
	}
	
	//ѧ��ע��
	public void zhuche(Student st){		
		String sql="insert into Student(ѧ��,����,רҵ,�Ա�,��������,��ϵ�绰,����)"
				+ " values('"+st.getId()+"','"+st.getName()+"','"+st.getZhuangye()+"','"+st.getSex()+"','"+st.getBirthday()+"','"+st.getPhone()+"','"+st.getMima()+"')";
		System.out.println(st.getName());
		try {
			
			con.createStatement().execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//ѧ����¼
	public Student denglu(Student st){	
		
		String sql="select * from Student where ѧ��='"+st.getId()+"' and ����='"+st.getMima()+"';";
		try {
			ResultSet rs=con.createStatement().executeQuery(sql);
			
			while(rs.next()){
				count=rs.getInt(1);	 
				if(count>0){
					int id=rs.getInt(1);
					String name=rs.getString(2);
					String zhuangye=rs.getString(3);
					String sex=rs.getString(4);
				    int birthday=rs.getInt(5);
					int phone=rs.getInt(6);
				    int mima=rs.getInt(7);
					Student s=new Student(id,name,zhuangye,sex,birthday,phone,mima );
					return s;
				}
				else {
					return null;
				}
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch blo
			e.printStackTrace();
		}
		return null;
	
	}
	public ArrayList<Sc> chaxun(int id){
		String sql="select * from Sc where ѧ��='"+id+"';";
		ArrayList<Sc> scs=new ArrayList<Sc>();
		try {
			//System.out.print(id);
			ResultSet rs=con.createStatement().executeQuery(sql);
			while(rs.next()){
			int Sid=rs.getInt(1);
			int Cid=rs.getInt(2);
			int grade=rs.getInt(3);
			
			Sc sc=new Sc(Sid,Cid,grade);
			 scs.add(sc);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scs;
	
		
	}
	//��ʦ��¼
	public Teacher   Tdenglu(Teacher te){	
		
		String sql="select * from Teacher where ��ʦ���='"+te.getId()+"' and ����='"+te.getMima()+"';";
		try {
			ResultSet rs=con.createStatement().executeQuery(sql);
			
			while(rs.next()){
				count=rs.getInt(1);	 
				if(count>0){
					int id=rs.getInt(1);
					String name=rs.getString(2);
					String sex=rs.getString(3);
		            int phone=rs.getInt(4);
				    int mima=rs.getInt(5);
					Teacher te2=new Teacher(id,name,sex,phone,mima );
					return te2;
				}
				else {
					return null;
				}
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch blo
			e.printStackTrace();
		}
		return null;
	
	}
	//��ʦע��
	public void zhuche(Teacher te){		
		String sql="insert into Teacher(��ʦ���,��ʦ����,�Ա�,��ϵ�绰,����)"
				+ " values('"+te.getId()+"','"+te.getName()+"','"+te.getSex()+"','"+te.getPhone()+"','"+te.getMima()+"')";
		System.out.println(te.getName());
		try {
			
			con.createStatement().execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//�������
	public boolean alterStudent(String sql,List<Object> param){
		boolean flag=false;
		try {
		
			ps=con.prepareStatement(sql);
			int index=1;
			if(param!=null&&!param.isEmpty()){
				for(int i=0;i<param.size();i++){
					ps.setObject(index++, param.get(i));
				}
			}
			int result=ps.executeUpdate();
			flag=result>0?true:false;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	//����ɼ�
	public boolean charu(int Sid,int Cid,int grade){
		boolean y=false;

	String sql="insert into Sc (ѧ��,�γ̱��,�ɼ�)values(?,?,?) ";
	List<Object> param=new ArrayList<Object>();
	 param.add(Sid);
	param.add(Cid);
	 param.add(grade);
	if( alterStudent(sql, param))y=true;
		return y;
	}
	//ɾ���ɼ�
	public boolean shanchu(int Sid,int Cid){
		boolean y=false;

	String sql="delete Sc where ѧ��= ? and �γ̱��= ?";
	List<Object> param=new ArrayList<Object>();
	param.add(Sid);
	param.add(Cid);
	if( alterStudent(sql, param))y=true;
		return y;
		}
	
	//�޸ĳɼ�
	public boolean xiugai(int Sid,int Cid,int grade){
		boolean y=false;

	String sql="update Sc set  �ɼ�=? where ѧ��=? and  �γ̱�� =?";
	List<Object> param=new ArrayList<Object>();
	param.add(grade);
	param.add(Sid);
	param.add(Cid);
	if( alterStudent(sql,param))y=true;
	  	return y;
	}
	//��ѯ�γ�
	public Course kec(int id){
		String sql="select * from Course where �γ̱��='"+id+"';";
		try {
			
			ResultSet rs=con.createStatement().executeQuery(sql);
			
			while(rs.next()){
				int Cid=rs.getInt(1);
			String cname=rs.getString(2);
			int xuef=rs.getInt(3);
			int xues=rs.getInt(4);
			Course c=new Course(Cid, cname, xuef, xues);
			return c;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

		
	
	/*public static void main(String[] args) {
		Query q =new Query();
		
		boolean y=q.xiugai(1, 85);
		
		if(y)System.out.print("��l");
		
	
	 
	}*/
}
	


	
