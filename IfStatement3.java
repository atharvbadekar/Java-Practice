import java.util.Scanner ;
class IfStatement3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("What is your attendance ? ") ;
		float ans  = sc.nextFloat() ;
		if (ans < 75.00)
		{
			System.out.println("Complete the cource \nand then ") ;
		}



		System.out.println("Your eligible for the exam....." );
	}
}
