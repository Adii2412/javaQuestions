//sum of all elements in array
package Questions;

public class Question_41 {

	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6};
		int sum=0;
		
		for(int i:a) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
