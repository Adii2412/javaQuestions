//vowel program
package Questions;

import java.util.Scanner;

public class Question_09 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter any statement");
		String statement= s.next();
		char firstchar=statement.charAt(0);
		switch(firstchar) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		System.out.println(firstchar +" is vowel");
		break;
		default: System.out.println(firstchar+" is consonent");
		}
		
		
	}

}
