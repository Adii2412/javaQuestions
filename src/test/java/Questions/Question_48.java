//java program to find maximum and minimum in the given array
package Questions;

public class Question_48 
{
	public static void main(String[] args) 
	{
		int [] a = {28,45,25,69,85,25,39,98,74,21};
		
		int max =a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) 
		{
			if(max<a[i]) {
				max=a[i];
			}
			
			if(min>a[i]) {
				min=a[i];
			}
		}
		
		System.out.println("maximum number in the given array is: "+ max);
		System.out.println("minimum number in the given array is: "+min);
	}

}
