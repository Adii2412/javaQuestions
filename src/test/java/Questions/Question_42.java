//seperately print even and odd number in array
package Questions;

public class Question_42 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,9};
		for(int i:a) {
			if(i%2==0) {
				System.out.println(i+" is even number");
			}else {
				System.out.println(i+" is odd number");
			}
		}

	}

}
