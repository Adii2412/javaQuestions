//print the number of letters, digits, spaces and other things in the given statement
package Questions;

import java.util.Scanner;

public class Question_24 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any statement");
		int digit=0;
		int space=0;
		int letter=0;
		int other=0;
		String statement= s.nextLine();
		char [] ch = statement.toCharArray();
		for(Character c:ch) {
			if(c.isDigit(c)) {
				digit++;
			}
			else if(c.isLetter(c)) {
				letter++;
			}
			else if(c.isSpaceChar(c)) {
				space++;
			}
			else {
				other++;
			}
		
		}
		
		System.out.println("Digits :" +digit);
		System.out.println("space :" +space);
		System.out.println("letter :" +letter);
		System.out.println("other :" +other);
		
	}

}
