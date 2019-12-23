import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

public class Location {

	private int row;
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public double getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}
	private int column;
	private double maxValue;
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Location a2=new Location();
    	int n,m;
    	Scanner input=new Scanner(System.in);
	     System.out.print("输入数组的行  列：");
	     n=input.nextInt();
	     m=input.nextInt();
    	double [][]a=new double [n][m];
    	 System.out.println("输入数：");
    	 for(int i=0;i<n;i++){
    		 for(int j=0;j<m;j++)
    			 a[i][j]=input.nextDouble();
    	 }
    	a2=locateLargest(a); 
    	 System.out.println("最大的数="+a2.getMaxValue()+"下标=（"+a2.row+","+a2.getColumn()+")");
    	
	}
 public static Location locateLargest(double [][]a){
	 Location a1 = new Location();
	 int i=0,j=0;
	 a1.setMaxValue(a[i][j]);
	 a1.row=0;
	 a1.column=0;
	for( i=0;i<a.length;i++){
		for( j=1;j<a[i].length;j++){
			if(a[i][j]>a1.getMaxValue()){
				 a1.setMaxValue(a[i][j]);
				a1.setRow(i);
				a1.setColumn(j);
			}
		}
	}
	return a1;
	 }

}
