//Fibonacci series
package Questions;

public class Question_25 
{

	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b);
		
		
		for(int i=0;i<=50;i++)
		{
		
			c=a+b;
			if(c>50)
				break;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}

}
