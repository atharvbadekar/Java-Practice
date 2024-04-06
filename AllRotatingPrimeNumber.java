import java.util.Scanner ;
class AllRotatingPrimeNumber 
{
	public static int count(int num)
	{
		int ct = 0 ;
		while (num != 0)
		{
			ct ++ ;
			num /=10 ;
		}
			return ct ;
	}

	public static int power(int base , int raise)
	{
		int pow  = 1;
		for (int i=0;i<raise ;i++ )
		{
			pow *= base ;
		}
		return pow ;
	}

	public static int rotate(int num)
	{
		return (num%10) * power(10,count(num)-1) + num/10 ;
	}
	public static  boolean isprime(int num)
	{
		boolean isprime = true ;
		for (int i =2 ;i<num ;i++ )
		{
			if (num % i == 0)
			{
				isprime = false ;
				break ;
			}
		}
		return isprime ;
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Start : ") ;
		int start = sc.nextInt() ;
		System.out.println("Enter the end : ") ;
		int end = sc.nextInt() ;

		int temp = start ;
		while (temp != start)
		{
			if (isprime())
			{
			}
		}

		
		
	}
}
