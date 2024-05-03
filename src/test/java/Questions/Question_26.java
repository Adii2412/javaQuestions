//reverse a String
package Questions;

import java.util.Scanner;

public class Question_26 {

	public static void main(String[] args) 
	{
		System.out.println("Enter any statement");
		Scanner s = new Scanner(System.in);
		String statement = s.nextLine();
		
		char[] ch = statement.toCharArray();
		int length= statement.length();
		
		for(int i=length-1;i>=0;i--) {
			System.out.print(statement.charAt(i));
		}
		

	}

}
