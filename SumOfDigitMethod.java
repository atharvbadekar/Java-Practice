import java.util.Scanner ;
class SumOfDigitMethod
{
	public static void sumOfDigit(int num) 
	{
		int sum = 0 ;
		while (num != 0)
		{
			int last = num % 10 ;
			sum += last ;
			num /= 10 ;
		}

		System.out.println("The sum is : " + sum) ;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Number : ") ;
		int number = sc.nextInt() ;

		sumOfDigit(number) ;
	}
}
