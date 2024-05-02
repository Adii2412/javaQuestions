//java program to check whether the given number is even or odd
package Questions;

import java.util.Scanner;

public class Question_05 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num%2==0) {
			System.out.println(num +" is even number");
		}else {
			System.out.println(num +" is odd number");
		}
		
	}
}
