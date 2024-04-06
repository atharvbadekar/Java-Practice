import java.util.Scanner ;
class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the Number : ");
		int num  = sc.nextInt() ;
		int temp = num ;
		int sum = 0 ;

		while (num != 0)
		{
			int last = num % 10 ;
			int fact = 1 ;
			for (int i = last;i>0 ;i-- )
			{
				fact *= i ;
			}
			//System.out.println(fact) ;
			sum += fact ;
			num /= 10 ;
		}

		if (sum == temp)
		{
			System.out.println("It is a Strong Number "); 
		}
		else
		{
			System.out.println("it is NOT a Strong NUmber ") ;
		}
	}
}
