//print the duplicated characters in the given string text along with number of times
package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_23 
{
	public static void main(String[] args) 
	{	System.out.println("Enter any statement");
		Scanner s = new Scanner(System.in);
		String statement = s.nextLine();
		char[] c =statement.toCharArray();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		 for(Character ch:c) 
		 {
			if(m.containsKey(ch)) {
				m.put(ch,m.get(ch)+1 );
			}else {
				m.put(ch, 1);
			}
			 
		 }
		
		for(Character ch:m.keySet()) {
			if(m.get(ch)>1) {
				System.out.println(ch+" : "+m.get(ch));
			}
		}
		
		
		
		
	}
}
