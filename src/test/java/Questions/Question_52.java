//java program to remove special characters, spaces and other junk from the given String text
package Questions;

public class Question_52 {

	public static void main(String[] args) 
	{
		String str="&^%#$@#@#@@#$%13254dfdg()*&^!!!{}:'''''><";
		String str2=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str2);
		
	}
}
