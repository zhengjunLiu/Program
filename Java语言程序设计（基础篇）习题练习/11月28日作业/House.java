
public class House  implements Cloneable ,Comparable{
	public House(int id, double area) {
	    this.id = id;
	    this.area = area;
	    whenBuilt = new java.util.Date();
	  }
	public int getId() {
		return id;
	}
	public double getArea() {
		return area;
	}


	private int id;
	private double area;
	private java.util.Date whenBuilt;
 	public java.util.Date getWhenBuilt() {
		return whenBuilt;
	}
	public void setWhenBuilt(java.util.Date whenBuilt) {
		this.whenBuilt = whenBuilt;
	}
	public static void main(String[] args) {
 		try { House house1 = new House(1, 1750.50);
 		    House house2 = (House)house1.clone();
 		    System.out.println(house1.getWhenBuilt() == house2.getWhenBuilt());
 		} catch (CloneNotSupportedException ex) {
 			System.out.println("0");
 	    }
      
	}
 	public Object clone()throws CloneNotSupportedException{
 		  House house = (House)super.clone();
 	      house.setWhenBuilt(this.getWhenBuilt());
 	      return house;
		
 		
 	}

	@Override
	public int compateTo(Object o) {
		if(area>((House)o).area)return 1;
		else
			if(area<((House)o).area)
			return -1;
			else
				return 0;
	}

}
