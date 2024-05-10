//Remove duplicates from Array with HashSet
package Questions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question_33 
{

	public static void main(String[] args) 
	{
		int[] a = {1,1,2,5,1,5,4,7,8,4,5,9,6,1,1,10};
				
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i =0;i<a.length;i++) 
		{
			s.add(a[i]);
		}
		
		System.out.println(s.toString()) ;
		
	}
	
}
