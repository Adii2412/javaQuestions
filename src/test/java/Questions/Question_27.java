//Palindrome String text
package Questions;

import java.util.Scanner;

public class Question_27 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any statement/String name");
		String statement = s.nextLine();
		int length= statement.length();
		char[] ch =statement.toCharArray();
		String reversed = "";
		for(int i=length-1;i>=0;i--) {
			reversed=reversed+(statement.charAt(i));
//			System.out.println(statement.charAt(i));
		}
		System.out.println(reversed);
		if(reversed.equals(statement)) {
			System.out.println("entered text is palindrome");
		}
		else {
			System.out.println("entered text is not palindrome");
		}
		
	}

}
