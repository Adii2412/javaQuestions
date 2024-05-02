//Area of circle
package Questions;

import java.util.Scanner;

public class Question_10 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter radius");
		Scanner s = new Scanner(System.in);
		int radius = s.nextInt();
		System.out.println("Area of circle is : "+Math.PI*radius*radius);
		
	}

}
