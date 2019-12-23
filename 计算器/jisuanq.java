import java.util.Scanner;
import java.util.Stack;


public class jisuanqi {

	
	private Stack<Integer> a1=new Stack<Integer>();//数字栈
	private Stack<Character>  a2=new Stack<Character>();//字符栈
	public jisuanqi(){
		
	}
	public static void main(String[] args) {
		jisuanqi a=new jisuanqi();
		System.out.print(a.jisuan());
	}
	public  int jisuan(){
		 
		Scanner input=new Scanner(System.in);
		System.out.print("输入表达式:");
		String x=input.nextLine();
		char [] num = x.toCharArray();
		a2.push('=');
		
		int i=0;
		char ch1,ch2;
		while(a2.size()!=0)
		{
			ch1=num[i];
			int sum=0;
			if('0'<=num[i]&&num[i]<='9')
			{
				int jj=Integer.parseInt(""+ch1);
				for(int j=i+1;'0'<=num[j]&&num[j]<='9';j++)
				{
					jj=jj*10+Integer.parseInt(""+num[j]);
					
					i++;
					//System.out.println(jj);
				}
				
				a1.push(jj);
				i++;
			}
			else
			{
				
				ch2=a2.peek();
				int compare = yunsuan(ch1,ch2);
				{
					switch(compare)
					{
					case 1:
						{
							//++会返回大于号 但是我们希望他不要压栈 所以大于1的时候我们不压栈
							i++;
							a2.push(ch1);
						}
						break;
					case -1:
						{
							
							char c = a2.pop();
							int j1,j2;
							j1=a1.pop();
							j2=a1.pop();
						    int j3=jisuan1(j2,j1,c);
						    //System.out.println(j3);
							a1.push(j3);
						}
						break;
					case 0:
						if(ch1=='='||ch1==')')
						{
							a2.pop();
							i++;
						}
						break;
					}
				}
			}
		}
		return a1.pop();
	}
public int yunsuan(char ch1 ,char ch2){
	
	if(ch1=='+')
	{
		if(ch2=='+') return 1;
		if(ch2=='-') return 1;
		if(ch2=='*') return -1;
		if(ch2=='/') return -1;
		if(ch2=='(') return -1;
		if(ch2==')') return 1;
		if(ch2=='=') return 1;
	}

	if(ch1=='-')
	{
		if(ch2=='+') return 1;
		if(ch2=='-') return 1;
		if(ch2=='*') return -1;
		if(ch2=='/') return -1;
		if(ch2=='(') return -1;
		if(ch2==')') return 1;
		if(ch2=='=') return 1;
	}

	if(ch1=='*')
	{
		if(ch2=='+') return 1;
		if(ch2=='-') return 1;
		if(ch2=='*') return 1;
		if(ch2=='/') return 1;
		if(ch2=='(') return -1;
		if(ch2==')') return 1;
		if(ch2=='=') return 1;
	}

	if(ch1=='/')
	{
		if(ch2=='+') return 1;
		if(ch2=='-') return 1;
		if(ch2=='*') return 1;
		if(ch2=='/') return 1;
		if(ch2=='(') return -1;
		if(ch2==')') return 1;
	    if(ch2=='=') return 1;
	}

	if(ch1=='(')
	{
		if(ch2=='+') return -1;
		if(ch2=='-') return -1;
		if(ch2=='*') return -1;
		if(ch2=='/') return -1;
		if(ch2=='(') return -1;
		if(ch2==')') return 0;
	}

	if(ch1==')')
	{
		if(ch2=='+') return 1;
		if(ch2=='-') return 1;
		if(ch2=='*') return 1;
		if(ch2=='/') return 1;
		if(ch2==')') return 1;
		if(ch2=='=') return 1;
	}

	if(ch1=='=')
	{
		if(ch2=='+') return -1;
		if(ch2=='-') return -1;
		if(ch2=='*') return -1;
		if(ch2=='/') return -1;
		if(ch2=='(') return -1;
		if(ch2=='=') return 0;
	}
	return 1;
}
public static int jisuan1(int x,int y,char c)
{
	//System.out.println(c);
	switch(c)
	{
	case '+':
		return  x+y;
	case '-':
		return x-y;
	case '*':
		return x*y;
	case '/':
	    return x/y;
	}
	return 1;
}
}
