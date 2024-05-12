//Counting Number of Even & Odd digits in given number
package Questions;

import java.util.Scanner;

public class Question_39 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num=s.nextInt();
		int EvenCount=0;
		int OddCount=0;
		int fn=num;
		while(fn!=0) 
		{
			int remainder=fn%10;
			if(remainder%2==0) {
				EvenCount++;
			}else {
				OddCount++;
			}
			
			fn=fn/10;
			
		}
		
		System.out.println("Even numbers:"+EvenCount);
		System.out.println("Odd number:"+OddCount);
		
	}

}
