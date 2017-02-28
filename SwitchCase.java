package chapter_3;

import java.util.Scanner ; // To import Scanner Class
public class SwitchCase {

	Scanner sc=new Scanner(System.in) ; // Scanner Class object created.
	private int a,b ;
	private int ch ;
	
	public void getNum() // Function to get two numbers.
	{
		System.out.println("Enter the First Number");
		a=sc.nextInt() ;
		System.out.println("Enter the Second Numer");
		b=sc.nextInt() ;
	}
	
	public void calc() // Function containing the Switch Case.
	{
		do
		{
			System.out.println(" Main Menu ");
			System.out.println("1. Addition ");
			System.out.println("2. Substraction ");
			System.out.println("3. Divison ");
			System.out.println("4. Multiply ");
			System.out.println("5. Exit ");
			System.out.println("\nEnter your choice\n");
			ch=sc.nextInt() ;
			switch(ch)
			{
			case 1:
				System.out.println("You chose Addition");
				System.out.println(" Result is :"+ (a+b));
				break ;
			case 2:
				System.out.println("You chose Substraction");
				System.out.println(" Result is :"+(a-b));
				break ;
			case 3:
				System.out.println("You chose Division");
				if(b==0)
					System.out.println("Cannot divide by Zero");
				else
					System.out.println(" Result is :"+ (a/b));
				break ;
			case 4:
				System.out.println("You chose Multiplication");
				System.out.println(" Result is :"+ (a*b));
				break ;
			case 5:
				System.out.println("You chose to Exit");
				break ;
			}
			
		}while(ch!=5) ; // do-while loop will run until the the exit choice i.e 5 is no chosen.
	}
	
	public static void main(String[] args) {
		SwitchCase obj =new SwitchCase() ; //Object of the class is created.
		obj.getNum();
		obj.calc();
	}
}
