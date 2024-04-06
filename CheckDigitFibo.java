import java.util.Scanner ;
class CheckDigitFibo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number : ");
		int num = sc.nextInt() ;

		while (num!=0)
		{
			int last = num % 10 ;
			if (last!=0 && last!=1 && last!=2 && last!=3 && last!=5 && last!=8)
			{
				break ;
			}
			num /= 10 ;
		}
		if (num == 0)
		{
			System.out.println("The number contains all the digits are fibonacci");
		}
		else
		{
			System.out.println("The number contains all the digits are NOT Fibonacci");
		}
	}
}
