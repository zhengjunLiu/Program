package jixun4;

import java.util.Scanner;
public class xiti34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter year: ");
		  int year = input.nextInt();
		  System.out.println("Enter month(1-12): ");
		  int month = input.nextInt();
		 
		
		   printMouth(year,month);
		  
		 }
	private static void printMouth(int year, int month) {
		// TODO Auto-generated method stub
		printMonthTitle(year,month);
		printMonthBody(year,month);
		
	}
	private static void printMonthBody(int year, int month) {
		// TODO Auto-generated method stub
		 
		int StartDay=getstartDay(year,month);
		int numberOfDaysInmonth=getnumberOfDaysInmonth(year,month);
		int i=0;
		for( i=0;i<StartDay;i++)
			  System.out.print("    ");
		for(i=1;i<numberOfDaysInmonth;i++){
			  System.out.printf("%4d",i);
			 if((StartDay+i)%7==0)
				 System.out.println();
				 
		}
			
	}
	private static int getnumberOfDaysInmonth(int year, int month) {
		// TODO Auto-generated method stub
		if(month==1||month==3||month==5|month==7||month==8||month==10|month==12)
			return 31;
		if(month==4||month==6||month==9||month==11)
			return 30;
		if(month==2)return isLeapYear( year)?29:28;
		
		return 0;
	}
	private static boolean isLeapYear(int year){
		return year%400==0||(year%4==0&&year%100!=0);
	}
	private static void printMonthTitle(int year, int month) {
		// TODO Auto-generated method stub
		System.out.println("       "+getMonthName(month)+"   "+year);
		System.out.println("--------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}
	private static String getMonthName(int month) {
		// TODO Auto-generated method stub
		String monthName=" ";
		switch(month){
		case 1:monthName="January";break;
		case 2:monthName="February";break;
		case 3:monthName="March";break;
		case 4:monthName="April";break;
		case 5:monthName="May";break;
		case 6:monthName="June";break;
		case 7:monthName="July";break;
		case 8:monthName="August";break;
		case 9:monthName="September";break;
		case 10:monthName="October";break;
		case 11:monthName="November";break;
		case 12:monthName="December";break;
		
		}
		return monthName;
	}
	public static int getstartDay(int year,int mouth) {
		
		int m = mouth;
	
	  if (mouth == 1 ||mouth == 2){
	   m += 12;
	      year = year--;
	  }
	  int j = year / 100;
	  int k = year % 100;
	  int h = (1 + (int)(26 * (m + 1) / 10) + k + (int)(k / 4) + (int)(j / 4) + 5 * j) % 7;
	  String day = "";
	  switch(h){
	  case 0: day = "Saturday";break;
	  case 1: day = "Sunday";break;
	  case 2: day = "Monday";break;
	  case 3: day = "Tuesday";break;
	  case 4: day = "Wednesday";break;
	  case 5: day = "Thursday";break;
	  case 6: day = "Friday";
	  default: System.exit(0);
	  }
	  if(h<2)
		  return (h+6)%8;
	  else 
	     return h-1;
	}
	
	}

