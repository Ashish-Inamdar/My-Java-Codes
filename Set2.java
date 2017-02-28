/**
 * 
 */
package collections;

import java.util.LinkedHashSet;
/**
 * @author Ashish
 * 
 * The following program demonstrates the use of Linked Hash set.
 * 
 * Linked Hash Set is based on insertion order.
 *  
 * The set interface dosen't allow duplicate value.
 */
public class Set2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Double> obj=new LinkedHashSet<>(); // New Linked Hash set is created to store Double values.
		obj.add(1.0);
		obj.add(3.0);
		obj.add(7.0); // Values are being added into Linked Hash set
		obj.add(2.0);
		
		for(Double i:obj) // Enhanced for loop is used to iterate the values inside the Linked Hash set
		{
			System.out.println(i); // Values are being displayed.
		}
	}

}
