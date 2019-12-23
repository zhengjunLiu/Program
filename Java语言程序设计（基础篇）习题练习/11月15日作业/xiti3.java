
import java.util.Scanner;
public class xiti3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner (System.in);
    System.out.println("计算数出现的次数，输入数（以0为结束标志符）");
    int[][] a=new int[100][2];   
    int i=0,j=0;
    for(i=0;i<100;i++)a[i][1]=0;
    int b=input.nextInt();
    i=0;
    while (b!=0){
    	if(i==0){
    		a[i][0]=b;
    		a[i][1]++;
    		i++;
    	}
    	else
    		{
    		boolean y=true;
    		for( j=0;j<i;j++){
    		      if(a[j][0]==b){
    				a[j][1]++;
    				y=false;
    				break;
    				
    			}
    		}
    		   if(y) {
    				a[i][0]=b;
    				a[i][1]++;
    				i++;
    		      }
    			
    		
    		}
    	b=input.nextInt();
    }
    for(int k=0;k<i;k++){
    	for(int l=k+1;l<i;l++){
    		if(a[k][0]>a[l][0]){
    			int temp=a[k][0],data=a[k][1];
    			 a[k][0]=a[l][0];
    			 a[k][1]=a[l][1];
    			 a[l][0]=temp;
    			 a[l][1]=data;
    		}
    	}
    }
    for(j=0;j<i;j++){
    	System.out.println(a[j][0]+"出现了"+a[j][1]+"次");
    }
    }
}