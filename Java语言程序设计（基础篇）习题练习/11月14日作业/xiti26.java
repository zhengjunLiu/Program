
public class xiti26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		int m=0;
		for(int i=2;i<100000;i++){
		    if(m==100) break; 
			if(shushu(i)&&huiwen(i)){	
					if(k%10==0){
						System.out.println(i);
						k++;
						m++	;
					}
					else
						{
						System.out.print(i+"  ");
						k++;
					m++	;
				}
			}
			
		}
	}

	public static boolean  shushu(int n){
		boolean y=true;
		for(int i=n-1;i>=2;i--)
		{
			if(n%i==0){
				y=false;
				break;
			}
		}
		return y;
		
	}
	public static boolean huiwen(int n){
		boolean y=false;
		int []a=new int[10];
		int i,k=n;
		for(i=0;k!=0;i++){
			a[i]=k%10;
			k=k/10;
		}
		for(int j=0,l=i-1;j<=i/2;j++,l--){
			if(a[j]==a[l]){
			y=true;	
			}
			else
			{
				y=false;
				break;
			}
		}
		return y;
	}
}
