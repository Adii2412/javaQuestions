//Average of 6 inputed numbers
package Questions;

import java.util.Scanner;

public class Question_15 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=s.nextInt();
		System.out.println("Enter second number");
		int num2=s.nextInt();
		System.out.println("Enter third number");
		int num3=s.nextInt();
		System.out.println("Enter fourth number");
		int num4=s.nextInt();
		System.out.println("Enter fifth number");
		int num5=s.nextInt();
		System.out.println("Enter sixth number");
		int num6=s.nextInt();
		
		int average = (num1+num2+num3+num4+num5+num6)/6;
		
		System.out.println(average);
		

	}

}
