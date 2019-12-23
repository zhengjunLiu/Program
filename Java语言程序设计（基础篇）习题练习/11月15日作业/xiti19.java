import java.util.Scanner;
public class xiti19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n;
     Scanner input=new Scanner(System.in);
     System.out.print("输入学生个数");
     n=input.nextInt();
     System.out.print("输入学生信息 如 张三  95");
      String []a=new String[n];
      double []b=new double[n];
      int i;
      for( i=0;i<n;i++){
    	  a[i]=input.next();
    	  b[i]=input.nextDouble();
      }
      for(int k=0;k<n;k++){
      	for(int l=k+1;l<n;l++){
      		if(b[k]>b[l]){
      			double temp=b[k];
      			String data=a[k];
      			 b[k]=b[l];
      			 a[k]=a[l];
      		     b[l]=temp;
      			 a[l]=data;
      			
      		}
      	}
      } 
     for( i=n-1;i>=0;i--)
    	 System.out.println("姓名"+a[i]+"成绩"+b[i]);
	}

}
