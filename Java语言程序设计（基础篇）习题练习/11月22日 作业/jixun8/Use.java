package jixun8;

public class Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax a=new Tax();
		System.out.print("2001年");
        for(int j=0;j<4;j++){
        a.setFilingStatus(j);
        System.out.println("");
        System.out.println("纳税人"+j);
        int k=0;
		for(int i=50000;i<=60000;i=i+1000){
			a.setTaxableIncome(i);
			k++;
			System.out.printf("%10.2f",a.gettax());
			if(k%10==0)System.out.println("");
			
		}
		  }
        System.out.println("");
        Tax1 b=new Tax1();
        System.out.print("2009年");
        for(int j=0;j<4;j++){
            b.setFilingStatus(j);
            System.out.println("");
            System.out.println("纳税人"+j);
            int k=0;
    		for(int i=50000;i<=60000;i=i+1000){
    			b.setTaxableIncome(i);
    			k++;
    			System.out.printf("%10.2f",b.gettax());
    			if(k%10==0)System.out.println("");
    			
    		}
    		  }
        
		}

}
