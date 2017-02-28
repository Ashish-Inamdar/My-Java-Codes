/**
 * 
 */
package chapter_3;

/**
 * @author Ashish
 * A simple Mydate program which takes the values at object creation and initializes with the help
 * of constructor and then displays them. 
 *
 */
public class MyDate {
	private int dd,mm,yy ;
	
	public MyDate() // Default Constructor.
	{
		dd=mm=yy=0 ;
	}
	public MyDate(int dd,int mm,int yy) //Parameterized constructor
	{
		this.dd=dd ;
		this.mm=mm ;
		this.yy=yy ;
	}
	public void disp() //Method to display the values.
	{
		System.out.println("The Date is: "+dd+"/"+mm+"/"+yy);
	}
	
	public static void main(String[] args) {
		MyDate obj=new MyDate(02,07,1994) ; // Object created.
		obj.disp(); // Display function called.
	}

}
