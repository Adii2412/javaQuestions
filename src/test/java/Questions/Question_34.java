//java program to delete duplicates from sorted array using index
package Questions;

public class Question_34 
{
	public static void main(String[] args) 
	{
		int [] a = {1,1,2,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10};
		int j=0;
		for(int i=0;i<a.length-1;i++) 
		{
			if(a[i]!=a[i+1]) 
			{
				
				a[j]=a[i];
				j++;
			}
			
		}
		
		a[j]=a[a.length-1];
		
		for(int k=0;k<=j;k++) {
			System.out.print(" "+a[k]);
		}
		
	}
}