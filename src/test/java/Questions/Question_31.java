//Armstrong number
package Questions;

import java.util.Scanner;

public class Question_31 
{
	public static void main(String[] args) 
	{
		if(isArmstrong(154)) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
		
		
	}

	public static boolean isArmstrong(int num) {
		
		
		int fN=num;
		int digit=0;
		while(fN!=0) 
		{
			digit++;
			fN=fN/10;
		}
		int last;
		int sum=0;
		fN=num;
		while(fN!=0) 
		{
			last=fN%10;
			sum+=(Math.pow(last, digit));
			fN=fN/10;
		}
		

		if(sum==num) {
			return true;
		}else {
			return false;
		}
	}
	
}
