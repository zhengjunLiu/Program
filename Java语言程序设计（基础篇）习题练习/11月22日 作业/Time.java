
public class Time {
    public long getHour() {
		return hour;
	}

	

	public long getMinute() {
		return minute;
	}

	

	public long getSecond() {
		return second;
	}

	
	private long hour;
    private long minute;
    private long second;
    public Time(){
    	long totalMilliseconts=System.currentTimeMillis();
    	long totalSecomd=totalMilliseconts/1000;
    	second=totalSecomd%60;
    	long totalMiniter=totalSecomd/60;
    	minute=totalMiniter%60;
    	long totalhour=totalMiniter/60;
    	hour=totalhour%24;
    	}
    public Time(long hour1,long minute1,long second1){
    	second=second1;
    	minute=minute1;
    	hour=hour1;
    }
    public void setTime(long elapseTime){
    	
    	long totalSecomd=elapseTime;
    	second=totalSecomd%60-1;
    	long totalMiniter=totalSecomd/60;
    	minute=totalMiniter%60;
    	long totalhour=totalMiniter/60;
    	hour=totalhour%24;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Time a = new Time();
    a.setTime(555550); 
    System.out.println(a.getHour()+":"+a.getMinute()+":"+a.getSecond());
    Time b=new Time();
    System.out.println(b.getHour()+":"+b.getMinute()+":"+b.getSecond());
	}

}
