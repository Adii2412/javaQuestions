//Power of Number
package Questions;

import java.util.Scanner;

public class Question_13 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter any number");
		int num= s.nextInt();
		System.out.println("enter power");
		int power= s.nextInt();
		int initialNumber = num;
		int ans=0;
		for(int i=0;i<power-1;i++) 
		{
			initialNumber=num*initialNumber;
			
			
		}
		
		System.out.println(initialNumber);
	}

}
