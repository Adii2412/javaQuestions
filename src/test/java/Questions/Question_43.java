//reverse the given number
package Questions;

import java.util.Scanner;

public class Question_43 {

	public static void main(String[] args) 
	{
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int reversednum = 0;
		while(num!=0) 
		{
			int remainder=num%10;
			reversednum=reversednum*10+remainder;
			num=num/10;
		}
		
		System.out.println(reversednum);
		s.close();
		
	}
}
