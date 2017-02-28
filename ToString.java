/**
 * 
 */
package chapter_3;

/**
 * @author Ashish
 *
 */
public class ToString {
	private int dd,mm,yy ;
	
	ToString(int dd,int mm, int yy)
	{
		this.dd=dd ;
		this.mm=mm ;
		this.yy=yy ;
	}
	
	public String toString()
	{
		return dd+"/"+mm+"/"+yy ;
	}

	public static void main(String[] args) {
		
		ToString obj=new ToString(2,7,1994) ; 
		System.out.println(obj.toString()) ;
	}
}
