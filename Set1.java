/**
 * 
 */
package collections;

import java.util.HashSet;
/**
 * @author Ashish
 * 
 * The following program demonstrates the use of Hash set.
 * 
 *  Hash set is faster than Tree set.Hash Set is not based on insertion order.
 *  
 *  The set interface dosen't allow duplicate value.
 *
 */
public class Set1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> obj=new HashSet<>(); // New Hash set is created to store Integer values.
		obj.add(5);
		obj.add(4);
		obj.add(3); // Values are added into the Hash set
		obj.add(2);
		obj.add(1);
		
		for(int i: obj) // Enhanced for loop is used to iterate the set
		{
			System.out.println(i); // Values within the Hash set are displayed.
		}
		

	}

}
