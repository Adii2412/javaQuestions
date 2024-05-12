//java program for search for the given element in the array and print its index number in the console
package Questions;

public class Question_49 
{
	public static void main(String[] args) 
	{
		int[] a = {5,85,74,56,52,12,47,50,30};
		int searchno=66;
		boolean found=false;
		for(int i=0;i<a.length;i++) 
		{
			if(searchno==a[i]) 
			{
				System.out.println("given no is found at index no "+i);
				found=true;
				break;
			}
		
		}
		
		if(found==false) 
		{
			System.out.println("given number has not been found");
		}
		
	
	}

}
