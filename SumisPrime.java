import java.util.Scanner ;
class SumisPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = sc.nextInt() ;
		int sum = 0 ;
		//boolean isprime = true ;

		while(num > 0)
		{
			int last = num % 10 ;
			sum += last ;
			num /= 10 ;

		}
		int i ;
		for (i=2;i<sum ;i++ )
		{
			if (sum % i == 0)
			{
				//isprime = false ;
				break ;

			}
		}
		if (i == sum)
		{
			System.out.println("The sum is "+ sum+" and it is prime..") ;
		}
		else
		{
			System.out.println("the Number is not prime " + sum);
		}

	}
}
