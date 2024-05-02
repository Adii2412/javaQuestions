//java program to print the multiplication table of given number
package Questions;

import java.util.Scanner;

public class Question_06 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter any number");
		int num = s.nextInt();
		for(int i=1;i<11;i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}
		
	}

}
