import java.util.Scanner ;
class factorialCheckMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt() ;

		//Calling the factorial check method 
		factorialOfNum(number) ;
	}
	public static void factorialOfNum(int num)
	{
		int factorial = 1 ;
		for (int i=1;i<=num ;i++ )
		{
			factorial *= i ;
		}
		System.out.println("Factorial of the " + num + " is :  " + factorial) ;
	}
}
