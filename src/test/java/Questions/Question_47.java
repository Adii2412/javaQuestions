//Find missing element in the array
package Questions;

public class Question_47 
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,6};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++) 
		{
			sum1=sum1+a[i];
		}
		
		for(int i=1;i<=a[a.length-1];i++) 
		{
			sum2=sum2+i;
		}
		
		if(sum1==sum2) 
		{
			System.out.println("No any missing element has been found");
		}else 
		{
			System.out.println("missing element is: "+(sum2-sum1));
		}
	}

}
