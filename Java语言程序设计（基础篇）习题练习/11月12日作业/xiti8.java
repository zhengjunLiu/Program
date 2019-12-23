import javax.swing.JOptionPane;


public class xiti8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String num1,num2,num3;
     num1=JOptionPane.showInputDialog("num1");
     num2=JOptionPane.showInputDialog("num2");
     num3=JOptionPane.showInputDialog("num3");
     double num4=Double.parseDouble(num1);
     double num5=Double.parseDouble(num2);
     double num6=Double.parseDouble(num3);
     double temp;
     if(num4<num5){
    	temp= num4;
    	num4=num5;
    	num5=temp;
    	
     }
     if(num4<num6){
     	temp= num4;
     	num4=num6;
     	num6=temp;
     	
      }
     if(num5<num6){
     	temp= num5;
     	num5=num6;
     	num6=temp;
     	
      }
     JOptionPane.showMessageDialog(null, num4+">"+num5+">"+num6);
     
	}

}
