import java.util.Scanner ;
class Factorialpg 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the num ") ;
		int num = sc.nextInt() ;
		if (num < 0)
		{
			System.out.println("Factorial is not defined for negative numbers.") ;
		}
		else
		{
			int factorial  = 1;
			for (int i=1;i<=num ;i++ )
			{
				factorial *= i ;
				System.out.println(factorial) ;
				
			}
			System.out.println("The factorial of " + num + " is : " + factorial);
		}
		
	}
}
