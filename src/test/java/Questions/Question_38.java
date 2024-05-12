//counting digits of given number (sum of digits in number)
package Questions;

import java.util.Scanner;

public class Question_38 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num= s.nextInt();
		int fn=num;
		int remainder;
		int sum=0;
		while(fn!=0) 
		{
			remainder=fn%10;
			sum=sum+remainder;
			fn=fn/10;
			
		}
		
		System.out.println(sum);
		
	}

}
