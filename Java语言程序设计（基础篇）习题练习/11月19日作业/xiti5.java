import java.util.GregorianCalendar;
public class xiti5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GregorianCalendar  gregorianCalendar=new  GregorianCalendar();
		int year= gregorianCalendar.get(GregorianCalendar.YEAR);
		int month=gregorianCalendar.get(GregorianCalendar.MONTH)+1;
		int day= gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
		 System.out.println("��            ��       ��" );
		 System.out.println(year+" "+ month+" "+day+"��ǰ");
		 gregorianCalendar.setTimeInMillis(1234567898765L);
         year= gregorianCalendar.get(GregorianCalendar.YEAR);
	     month=gregorianCalendar.get(GregorianCalendar.MONTH)+1;
		 day= gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
	     System.out.println(year+" "+ month+" "+day+"�ض�");
	}
	

}
