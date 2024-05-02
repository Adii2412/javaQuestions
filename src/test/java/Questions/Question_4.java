//java program for intaking two numbers from user and there by printing their sum in output
package Questions;

import java.util.Scanner;

public class Question_4
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number");
		int num1= s.nextInt();
		System.out.println("enter second number");
		int num2 = s.nextInt();
		
		int sum=num1+num2;
		System.out.println("sum of "+num1+" & "+num2+" is "+sum);
		
	}
}
