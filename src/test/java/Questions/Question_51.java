//java program to sorting the elements in the array using built in functions
package Questions;

import java.util.Arrays;

public class Question_51 
{

	public static void main(String[] args) 
	{
		int []a = {1,5,4,2,3,6,8,9,10,12,13};
		
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}

}
