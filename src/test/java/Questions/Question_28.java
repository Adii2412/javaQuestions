//palindrome number
package Questions;

import java.util.Scanner;

public class Question_28 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int number= s.nextInt();
		int fn=number;
		int remainder;
		int reversed=0;
		while(fn!=0)
		{
			int reminder=fn%10;
		reversed=(reversed*10)+reminder;
			fn=fn/10;
		}
		
		if(number==reversed) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
