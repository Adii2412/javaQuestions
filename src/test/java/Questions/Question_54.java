//Java program to find the number of occurances of a character in the given String text
package Questions;

public class Question_54 
{
	public static void main(String[] args) 
	{
		String str = "abcdefghijklmnopa";
		String str2=str.replaceAll("a", "");
		System.out.println("a is occured "+(str.length()-str2.length())+" times in this string");
		
	}

}
