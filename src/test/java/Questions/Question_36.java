//find duplicate elements in array using hashset
package Questions;

import java.util.HashSet;
import java.util.Set;

public class Question_36 {

	public static void main(String[] args) 
	{
		int [] a = {1,1,2,23,3,3,4,4,5,5,6,6,7,78,8,9,99,99};
		HashSet<Integer> hash =new HashSet<Integer>();
		for(int i=0;i<a.length;i++) 
		{
			 if(hash.add(a[i])==false) {
				 System.out.println(a[i]+" is duplicated");
			 }
		}
		
	
		
		
	}

}
