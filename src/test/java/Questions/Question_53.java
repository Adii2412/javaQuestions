//java program to remove white spaces in the given text
package Questions;

public class Question_53 
{
	public static void main(String[] args) 
	{
		String str = "str str1 str2 str3";
		String str2=str.replaceAll("\\s", "");
		System.out.println(str2);
	}
	
}
