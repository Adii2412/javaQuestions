//Java program to find the factors of the number and the count number of factors
package Questions;

import java.util.Scanner;

public class Question_66 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num= scan.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				System.out.println(i);
			}
			
		}
		
		System.out.println("total number of factors are : "+count);
		
		
	}
	
}
