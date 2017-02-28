/**
 * 
 */
package chapter_4;

/**
 * @author Ashish
 *An alternative to standard for loop, the enhanced for loop is wildly used when dealing with Arrays.
 */
public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9,10} ;
		System.out.println("The numbers are: ");
		for(int i:arr) // Enhanced for loop
		{
			System.out.println(i);
		}
	}

}
