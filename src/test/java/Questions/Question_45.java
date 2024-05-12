//Compare two arrays
package Questions;

import java.util.Arrays;

public class Question_45 {

	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6,7};
		int [] b= {1,2,3,4,5,6};
		if(Arrays.equals(a, b)) {
			System.out.println("Given arrays are equal");
		}else {
			System.out.println("Given arrays are not equal");
		}
		
		
		
	}

}
