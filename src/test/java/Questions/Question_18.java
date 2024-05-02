//Swapping 2 numbers
package Questions;

import java.util.Scanner;

public class Question_18 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number");
		int firstN= s.nextInt();
		
		System.out.println("enter second number");
		int secondN= s.nextInt();
		
		int thirdN;
		
		thirdN=firstN;
		firstN= secondN;
		secondN=thirdN;
		
		System.out.println("after swapping first number is: "+firstN );
		System.out.println("after swapping second number is: "+secondN );
		
		
		System.out.println("**************************************************************************************");
		
		System.out.println("without using third variable");
		System.out.println("-----------------------------");
		System.out.println("enter first number");
		int first= s.nextInt();
		
		System.out.println("enter second number");
		int second= s.nextInt();
		
		first=first+second;
		second=first-second;
		first=first-second;
		
		System.out.println("after swapping first number is: "+first );
		System.out.println("after swapping second number is: "+second );
		
		
		
		
		
	}

}
