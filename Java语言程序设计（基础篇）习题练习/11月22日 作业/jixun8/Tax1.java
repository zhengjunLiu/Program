package jixun8;


public class Tax1 {

public int[][] getBreakets() {
	return breakets;
}
public void setBreakets(int[][] breakets) {
	this.breakets = breakets;
}
public double[] getRates() {
	return rates;
}
public void setRates(double[] rates) {
	this.rates = rates;
}
public int getFilingStatus() {
	return filingStatus;
}
public void setFilingStatus(int filingStatus) {
	this.filingStatus = filingStatus;
}
public double getTaxableIncome() {
	return taxableIncome;
}
public void setTaxableIncome(double taxableIncome) {
	this.taxableIncome = taxableIncome;
}
private int [][]breakets={
		{0,1,2,3,4,5},
		{0,1,2,3,4,5},
		{0,1,2,3,4,5},
		{0,1,2,3,4,5},
		
		};
private double [] rates={0.10,0.15,0.25,0.28,0.33,0.35};
private int filingStatus=1;
private double taxableIncome=10000;
static final int SINGLE=0;
static final int married_1=1;
static final int MARRIDE_2=2;
static final int head=3;
public Tax1(){

	 

	
}
public Tax1(int a,int b[][],double c[],double d){
	filingStatus=a;
	breakets=b;
	rates=c;
	taxableIncome=d;
}
public double gettax(){
	if(filingStatus==0){
		
		if(taxableIncome>=372951){
			return (taxableIncome-8350)*rates[breakets[0][5]];
		}	
		else
			if(taxableIncome>=171551){
			return (taxableIncome-8350)*rates[breakets[0][4]];
		}
			else
				if(taxableIncome>=82251){
			return (taxableIncome-8350)*rates[breakets[0][3]];
		}
	
				else
					if(taxableIncome>=33951){
			return (taxableIncome-8350)*rates[breakets[0][2]];
		}
			else
				if(taxableIncome>=8351){
				return (taxableIncome-8350)*rates[breakets[0][1]];
			}
		else{
			return taxableIncome*rates[breakets[0][0]];
		}
		}
	else
		if(filingStatus==1){
			
			if(taxableIncome>=372951){
				return (taxableIncome-16700)*rates[breakets[0][5]];
			}	
			else
				if(taxableIncome>=208851){
				return (taxableIncome-16700)*rates[breakets[0][4]];
			}
				else
					if(taxableIncome>=137051){
				return (taxableIncome-16700)*rates[breakets[0][3]];
			}
		
					else
						if(taxableIncome>=67901){
				return (taxableIncome-16700)*rates[breakets[0][2]];
			}
				else
					if(taxableIncome>=16700){
					return (taxableIncome-16700)*rates[breakets[0][1]];
				}
			else{
				return taxableIncome*rates[breakets[0][0]];
			}
		}
else
	if(filingStatus==2){
	     
		if(taxableIncome>=186476){
			return (taxableIncome-8350)*rates[breakets[0][5]];
		}	
		else
			if(taxableIncome>=104426){
			return (taxableIncome-8350)*rates[breakets[0][4]];
		}
			else
				if(taxableIncome>=68525){
			return (taxableIncome-8350)*rates[breakets[0][3]];
		}
	
				else
					if(taxableIncome>=33951){
			return (taxableIncome-8350)*rates[breakets[0][2]];
		}
			else
				if(taxableIncome>=8351){
				return (taxableIncome-8350)*rates[breakets[0][1]];
			}
		else{
			return taxableIncome*rates[breakets[0][0]];
		}
	
}
else
	if(filingStatus==3){
	
		if(taxableIncome>=372951){
			return (taxableIncome-11950)*rates[breakets[0][5]];
		}	
		else
			if(taxableIncome>=190201){
			return (taxableIncome-11950)*rates[breakets[0][4]];
		}
			else
				if(taxableIncome>=117451){
			return (taxableIncome-11950)*rates[breakets[0][3]];
		}
	
				else
					if(taxableIncome>=45501){
			return (taxableIncome-11950)*rates[breakets[0][2]];
		}
			else
				if(taxableIncome>=11951){
				return (taxableIncome-11950)*rates[breakets[0][1]];
			}
		else{
			return taxableIncome*rates[breakets[0][0]];
		}
}
	else
       return 0;
}

}