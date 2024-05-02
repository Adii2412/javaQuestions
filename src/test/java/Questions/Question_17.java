//Area of the Rectangle
package Questions;

import java.util.Scanner;

public class Question_17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter length of rectangle");
		int length= s.nextInt();
		System.out.println("enter Breadth of rectangle");
		int breadth= s.nextInt();
		
		int area = length*breadth;
		
		System.out.println(area);

	}

}
