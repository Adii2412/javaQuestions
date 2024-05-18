//Java program which intakes a number and prints whether the given number is even or odd
package Questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_63 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");	
		try {
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is even number");
		}else if(num%2!=0) {
			System.out.println(num+" is odd number");
		}
		}catch(InputMismatchException e) {
			System.out.println("invalid format");
		}

	}

}
