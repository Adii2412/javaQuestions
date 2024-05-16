//Java program to compare two given numbers
package Questions;

import java.util.Scanner;

public class Question_57 {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		} else if(num1<num2){
			System.out.println(num1+" is smaller than "+num2);
		}else if(num1==num2) {
			System.out.println("Both numbers are equal");
		}
		
		

	}

}
