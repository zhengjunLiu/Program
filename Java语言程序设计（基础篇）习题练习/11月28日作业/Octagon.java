
public class Octagon extends GeometricObject  implements Cloneable ,Comparable{

     private double side;
     public Octagon(double a)
     {
    	 super();
    	 side=a;
    	 
     }
	 public double getarea(){
		return side*side*(2+4/(Math.sqrt(2)));
	}
     public double getpreim(){
    	 return 8*side;
     }
	 public int compateTo(Object o) {

	    if(((Octagon)o).side>side)return 1;
	    else
	    	if(((Octagon)o).side<side)return -1;
	    	else return 0;
	}
 	public Object clone()throws CloneNotSupportedException{
		 return  super.clone();
	    
	}
 	public static void main(String[] args) {
 			Octagon a=new Octagon(5);
 			
 			try {
				Octagon b=(Octagon)a.clone();
				System.out.println("a=b  is "+(a.compateTo(b)==0));
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				System.out.println("´íÎó");
			}
 			
 	}
 
 	
}
