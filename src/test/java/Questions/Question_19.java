//Perimeter of rectangle
package Questions;

import java.util.Scanner;

public class Question_19 {

	public static void main(String[] args) 
	{
		System.out.println("Enter length");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		System.out.println("Enter Breadth");
		int breadth= s.nextInt();
		
		System.out.println("Perimeter of rectangle is: "+ (2*(length+breadth)));
		

	}

}
