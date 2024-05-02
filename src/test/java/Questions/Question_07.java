//leap year
package Questions;

import java.util.Scanner;

public class Question_07 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter any year");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		boolean isleap = false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					isleap=true;
				}else {
					isleap=false;
				}
			}else {
				isleap=true;
			}
		}else {
			isleap=false;
		}
		
		if(isleap) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+ " is not leap year");
		}
		
		
	}

}
