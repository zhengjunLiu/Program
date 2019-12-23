package jixun8;


public class Tax {

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
		{0,1,2,3,4},
		{0,1,2,3,4},
		{0,1,2,3,4},
		{0,1,2,3,4},
		
		};
private double [] rates={0.15,0.275,0.305,0.355,0.391};
private int filingStatus=1;
private double taxableIncome=10000;
static final int SINGLE=0;
static final int married_1=1;
static final int MARRIDE_2=2;
static final int head=3;
public Tax(){

	 

	
}
public Tax(int a,int b[][],double c[],double d){
	filingStatus=a;
	breakets=b;
	rates=c;
	taxableIncome=d;
}
public double gettax(){
	if(filingStatus==0){
		
		if(taxableIncome>=297351){
			return (taxableIncome-27051)*rates[breakets[0][4]];
		}	
		else
			if(taxableIncome>=136751){
			return (taxableIncome-27051)*rates[breakets[0][3]];
		}
			else
				if(taxableIncome>=65551){
			return (taxableIncome-27051)*rates[breakets[0][2]];
		}
	
				else
					if(taxableIncome>=27051){
			return (taxableIncome-27051)*rates[breakets[0][1]];
		}
		
		else{
			return taxableIncome*rates[breakets[0][0]];
		}
		}
	else
		if(filingStatus==1){
			
		if(taxableIncome>=297351){
			return (taxableIncome-45201)*rates[breakets[0][4]];
		}
		else
			if(taxableIncome>=166501){
			return (taxableIncome-45201)*rates[breakets[0][3]];
		}
			else
				if(taxableIncome>=109251){
			return (taxableIncome-45201)*rates[breakets[0][2]];
		}
		
				else
					if(taxableIncome>=45201){
			return (taxableIncome-45201)*rates[breakets[0][1]];
		}
		
		else{
			return taxableIncome*rates[breakets[0][0]];
		}
		}
else
	if(filingStatus==2){
	     
		if(taxableIncome>=148676){
		return (taxableIncome-22601)*rates[breakets[0][4]];
		}
		else
			if(taxableIncome>=83251){
		return (taxableIncome-22601)*rates[breakets[0][3]];
	  }
			else
				if(taxableIncome>=54626){
		return (taxableIncome-22601)*rates[breakets[0][2]];
	}
	
				else
					if(taxableIncome>=22601){
		return (taxableIncome-22601)*rates[breakets[0][1]];
	}

	
	else{
		return taxableIncome*rates[breakets[0][0]];
	}
	
}
else
	if(filingStatus==3){
	
	if(taxableIncome>=297351){
		return (taxableIncome-36251)*rates[breakets[0][4]];
	}
	else
		if(taxableIncome>=151651){
		return (taxableIncome-36251)*rates[breakets[0][3]];
	}
		else
			if(taxableIncome>=93651){
		return (taxableIncome-36251)*rates[breakets[0][2]];
	}

			else
				if(taxableIncome>=36251){
		return (taxableIncome-36251)*rates[breakets[0][1]];
	}
	
	else{
		return taxableIncome*rates[breakets[0][0]];
	}
	
}
	else
       return 0;
}

}