package jixun9;

public class Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person a1=new Person("liuzhengjun","nanchang",1872099,"5020@qq.com");
        System.out.println(a1.toString());
        Student a2=new Student(a1,Student.daer);
        System.out.println(a2.toString());
        Employee a3=new Employee();
        System.out.println(a3.toString());
        Faculty a4=new Faculty();
        System.out.println(a4.toString());
        Staff a5=new Staff();
        System.out.println(a5.toString());
	}

}
