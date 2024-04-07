import java.util.Scanner ;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the number : ");
		int number = sc.nextInt() ;

		int orignalnumber = number ;
		int reversednumber = 0 ;

		while (number > 0)
		{
			reversednumber = (reversednumber * 10) + (number % 10) ;
			number /= 10 ;
		}
		if (orignalnumber == reversednumber)
		{
			System.out.println("The number is palindrome.") ;
		}
		else
		{
			System.out.println("The number is not palindrome.") ;
		}
	}
}
