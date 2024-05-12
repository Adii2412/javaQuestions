package Questions;

public class Question_46 
{

	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5,6,7};
		int [] b = {1,2,3,4,5,6,7};
		
		boolean equal=true;
		if(a.length==b.length) 
		{
			for(int i=0;i<a.length;i++){
				
					if(a[i]!=b[i]) {
						equal=false;
						break;
					}
					
				}
				
				
			}else{
			equal=false;
		 } 
		
		if(equal) {
			System.out.println("given arrays are equal");
		}else {
			System.out.println("given arrays are not equal");
		}
		
		
	}

}
