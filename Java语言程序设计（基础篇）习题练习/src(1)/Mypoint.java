
public class Mypoint {

	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	private double x;
    private double y;
    public Mypoint(){
    	x=0;
    	y=0;
    }
    public Mypoint(double a,double b){
    	x=a;
    	y=b;
    }
	public double distance(Mypoint M1){
		double sum;
		sum=Math.sqrt(((M1.getY()-y))*(M1.getY()-y)+(M1.getX()-x)*(M1.getX()-x));
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypoint a=new Mypoint(1,1);
		System.out.println(a.distance(new Mypoint(2,2)));
	}

}
