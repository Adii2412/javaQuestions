//sum of all digits in given number
package Questions;

import java.util.Scanner;

public class Question_20 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter any number");
		int number = s.nextInt();
		
		int sum=0;
		while(number!=0) {
			
			int remainder=number%10;
			sum=sum+remainder;
			number=number/10;
		}
		
		System.out.println(sum);
		
		
		
		
		
	}

}
