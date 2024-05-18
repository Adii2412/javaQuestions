//Java program which intakes number of seconds and converts into hours, minutes and seconds
package Questions;

import java.util.Scanner;

public class Question_65 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seconds");
		int totalseconds=scan.nextInt();
		
		int allMinutes = totalseconds/60;
		int remainingSeconds =totalseconds%60;
		int totalHours=allMinutes/60;
		int totalMinutes=allMinutes%60;
		
		System.out.println(totalHours+" hours "+totalMinutes+" minutes & "+remainingSeconds+" seconds");
		
		
	}

}
