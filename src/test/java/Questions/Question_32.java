//Factorial of a number
package Questions;

import java.util.Scanner;

public class Question_32 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = s.nextInt();
		int fact=1;
//		for(int i =num;i>0;i--) 
//		{
//			fact=fact*i;
//		}
//		
//		System.out.println(fact);
//		 
//		System.out.println("_________________________________________");
		
//		while(num!=0) {
//			fact=num*fact;
//			num--;
//			
//		}
//		System.out.println(fact);
//		
//		System.out.println("_________________________________________");
		
		
		for(int i =1;i<=num;i++) 
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
		
	}

}
