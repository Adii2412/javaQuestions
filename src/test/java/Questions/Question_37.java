//finding no. of digits in given number
package Questions;

import java.util.Scanner;

public class Question_37 {
	public static void main(String[] args) 
	{
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		int count=0;
		
		while(a!=0) 
		{
			count++;
			a=a/10;	
		}
		
		System.out.println(count);
		
	}

}
