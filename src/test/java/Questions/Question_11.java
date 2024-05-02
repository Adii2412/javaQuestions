//Quotient and Remainder
package Questions;

import java.util.Scanner;

public class Question_11 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		
		
		int number= s.nextInt();
		
		System.out.println("enter divisor");
		int divisor= s.nextInt();
		
		System.out.println("Quotient is:" +number/divisor);
		System.out.println("remainder is:" +number%divisor);
	}
	

}
