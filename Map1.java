/**
 * 
 */
package collections;

import java.util.Map;
import java.util.HashMap;
/**
 * @author Ashish
 * 
 * The following program demonstrates the use of Hash Map.
 * 
 * The Hash Map allows single null key with multiple null values.
 * 
 * Map interface associates key with values and do not allow duplicate.
 * 
 *Entry is the sub-interface of Map interface.
 */
public class Map1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> obj=new HashMap<>(); // New Hash Map is created to store String values with 
													// with associated keys.
		obj.put(1, "A");
		obj.put(2, "B");
		obj.put(3, "C"); // Values are added into Hash Map along with linked keys
		obj.put(4, "D");
		obj.put(5, "E");
		
		for(Map.Entry<Integer,String> mp: obj.entrySet()) // Values are accessed in Hash Map through the keys
		{												 //assocaited with the values.
			System.out.println(mp.getKey()+"\t"+mp.getValue());  //mp.getKey()prints the keys and mp.getValue
		}														//prints the values.

	}

}
