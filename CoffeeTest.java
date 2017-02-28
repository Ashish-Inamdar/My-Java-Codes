/**
 * 
 */
package chapter_4;

/**
 * @author Ashish
 *
 */
public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee drink=new Coffee();
		drink.size=CoffeeSize.SMALL;
		System.out.println(drink.size);
		System.out.println("Coffee is"+" "+drink.size);
		drink.size=CoffeeSize.MEDIUM;
		System.out.println(drink.size);
		System.out.println("Coffee is"+" "+drink.size);
		drink.size=CoffeeSize.LARGE;
		System.out.println(drink.size);
		System.out.println("Coffee is"+" "+drink.size);
	} 
}
