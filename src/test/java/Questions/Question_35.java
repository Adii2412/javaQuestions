//Find duplicate elements in the array using index
package Questions;

public class Question_35 {

	public static void main(String[] args) 
	{
		 int [] a = {3,4,5,3,6,4};
		 
		 for(int i=0;i<a.length;i++) {
			 
			 for(int h=i+1;h<a.length;h++) {
				 
				 if(a[i]==a[h]) {
					 System.out.println(a[i]+" is duplicated");
				 }
			 }
		 }
		
	}

}
