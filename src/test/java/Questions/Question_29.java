//Square of a number
package Questions;

import java.util.Scanner;

public class Question_29 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int number=s.nextInt();
		int square;
		square=number*number;
		System.out.println("square of "+number+" is "+square);
	}

}
