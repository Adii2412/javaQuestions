//Java program to print the Date and Time in a different format
package Questions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question_61 
{
	public static void main(String[] args) 
	{	
		//dd=date, MM=month yy=year HH=hour, mm=minutes, ss=seconds, SSS=mili-seconds
		SimpleDateFormat dates = new SimpleDateFormat("dd/MM/yy\n\tHH:mm:ss:SSS");
		Date date = new Date();
		String format = dates.format(date);
		System.out.println(format);
		
	}	
		
}
