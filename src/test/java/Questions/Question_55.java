//Java program to reverse each and every word in the given String text
package Questions;

public class Question_55 
{

	public static void main(String[] args) 
	{
		String str ="adinath sadanand mhetar";
		String[] str1 = str.split(" ");
		String reversedString="";
		for(String s:str1) 
		{
			String reversed="";
			for(int i=s.length()-1;i>=0;i--) 
			{
				reversed=reversed+s.charAt(i);
			}
			reversedString= reversedString+reversed+" ";
		}
		
		System.out.println(reversedString);
		


	}
}
