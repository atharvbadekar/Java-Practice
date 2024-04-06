import java.util.Scanner ;
class PrimeMethod 
{
	public static void primeNumber(int num)
	{
		int i = 2;
		for (;i<num ;i++ )
		{
			if (num % i == 0)
			{
				break ;
			}
		}
		if (i == num)
		{
			System.out.println("It is a Prime Number ..... ") ;
		}
		else
		{
			System.out.println("It is NOT Prime Number ..... ") ;
			
		}

	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		for (; ; )
		{
			System.out.println("1 .Check number is prime or not ?? ") ;
			System.out.println("2. Exit ") ;
			System.out.print("Enter your choice : ") ;
			int choice = sc.nextInt() ;


			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter the Number : ") ;
					int number = sc.nextInt() ;
					primeNumber(number) ;
						
				}
				case 2:
				{
					break ;
				}
				break;

			}
					
		}
		
		
		
	}
}
