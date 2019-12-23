package ArrayList;
import java.util.*;

import javax.swing.JFrame;
public class ArrayL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList cityList=new ArrayList();
    Date date=new Date();
    cityList.add(date);
    cityList.add("hello");
    cityList.add(new JFrame());
    cityList.add(new Circle());
    cityList.add(new Loan());
    for(int i=0;i<cityList.size();i++){
    	System.out.println(cityList.get(i).toString());
    	
    }
    
    
    
	}
	
}
