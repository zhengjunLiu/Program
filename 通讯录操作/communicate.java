package src;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class communicate {
private ArrayList<people> list =new ArrayList<people>();


public ArrayList<people> getList() {
	return list;
}

public void add(String name1,long phone1){
	people p1=new people (name1,phone1);
	list.add(p1);
}
public people remove(String name1){
people p1= new people(name1);
	for(int i=0;i<list.size()-1;i++)
	{
		if(list.get(i).getName().equals(p1.getName())){
			list.remove(i);
			break;
			}
	}
	
	return p1;
}
public  void setName(String name1,long phone1){
	for(int i=0;i<list.size()-1;i++)
	{
		if(list.get(i).getPhone()==phone1)
			{
			list.get(i).setName(name1);
			break;
			}
	}
}
public  void setPhone(String name1,long phone1){
	for(int i=0;i<list.size()-1;i++)
	{
		if(list.get(i).getName().equals(name1))
			{
			list.get(i).setPhone(phone1);
			break;
			}
	}
}
public void display  ()     {
	for(int i=0;i<list.size();i++){
		System.out.println("������"+list.get(i).getName()+"    ����:"+list.get(i).getPhone());
	}
}
public static void main(String [] arg) throws Exception{
				communicate a=new communicate();
				String name;
				int phone;
				int number; 
				System.out.print("1�½���ϵ��"+"\n2:ɾ����ϵ��"+"\n3:�޸���ϵ��"+"\n4:�����ϵ��"+"\n0:�˳�\n ѡ��Ҫ���������к�");
						
				Scanner input=new Scanner (System.in);
						
						
				number =input.nextInt();
				File file=new File("D:/��ϵ��.txt");
              
					
                
               Scanner input0=new Scanner(file);
               while (input0.hasNext()){
            	   name=input0.next();
            	   phone=input0.nextInt();
            	   a.add(name, phone);
            	
               }
				input0.close();		
               
                      

				for(int k=0;number!=0;k++){ 
						if (number==1){
						
											System.out.print("'��������:");
											name=input.next();
											System.out.print("�������:");
											phone=input.nextInt();
											a.add(name, phone);
											System.out.println("�½����,�����.");
										  	System.out.println("1�½���ϵ��"+"\n2:ɾ����ϵ��"+"\n3:�޸���ϵ��"+"\n4:�����ϵ��"+"\n0:�˳�\nѡ��Ҫ���������к�");
										    number=input.nextInt();
										    continue;
						              }
						if(number==2){
							
											ArrayList list1=a.getList();
											System.out.print("����Ҫɾ����ϵ�˵�����:");
												name=input.next();
												a.remove(name);
												System.out.println("ɾ�����,�����.");
											  	System.out.println("1�½���ϵ��"+"\n2:ɾ����ϵ��"+"\n3:�޸���ϵ��"+"\n4:�����ϵ��"+"\n0:�˳�\nѡ��Ҫ���������к�");
											    number=input.nextInt();
							    continue;
					                 }
						if(number==3){
							
										System.out.print("1:��������"+"\n2:���ݺ���");
										number=input.nextInt();
									   	 if(number==1){
									   		 System.out.println("��������:");
									   		 name=input.next();
									   		 System.out.println("�����º���");
									   		 phone=input.nextInt();
									   		 a.setPhone(name, phone);
									   		System.out.println("�޸����,�����.");
										  	System.out.println("1�½���ϵ��"+"\n2:ɾ����ϵ��"+"\n3:�޸���ϵ��"+"\n4:�����ϵ��"+"\n0:�˳�\nѡ��Ҫ���������к�");
										    number=input.nextInt();
										    continue;
						   	              }
						   	             if(number==2){
										   		 System.out.println("�������:");
										   		 phone=input.nextInt();
										   		 System.out.print("����������");
										   		 name=input.next();
										   		 a.setName(name, phone);
										   		System.out.println("�޸����,�����.");
											  	System.out.println("1�½���ϵ��"+"\n2:ɾ����ϵ��"+"\n3:�޸���ϵ��"+"\n4:�����ϵ��"+"\n0:�˳�\nѡ��Ҫ���������к�");
											    number=input.nextInt();
											    continue;
						   	              }
                                   }
						   	 if(number==4){
						   		            a.display();
						   		            System.out.println("�����.");
										  	System.out.println("1�½���ϵ��"+"\n2:ɾ����ϵ��"+"\n3:�޸���ϵ��"+"\n4:�����ϵ��"+"\n0:�˳�\nѡ��Ҫ���������к�");
										    number=input.nextInt();
										    continue;
						   	           }
						}	 
				
				PrintWriter output=new PrintWriter(file);
				for(int i=0;i<a.getList().size();i++){
					output.print(a.getList().get(i).getName()+"  ");
					output.print(a.getList().get(i).getPhone()+"  ");
					if((i+1)%10==0)output.println();
				}
				output.close();		
			System.out.println("��лʹ��");
			 } 
               
}

			 








