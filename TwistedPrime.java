import java.util.Scanner ;
class TwistedPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the numnber : ");
		int num = sc.nextInt() ;
		boolean isprime = true;
		for (int i = 2;i<num;i++ )
		{
			if (num % i == 0)
			{
				isprime = false ;
				break;
			}
		}
		if (isprime)
		{
			int reverse = 0 ;
				for (int i = num;i != 0 ;i /= 10 )
				{
					reverse  = reverse * 10  + (i %10) ;
					
				}


				for (int i =2 ; i< num ; i++)
				{
					if (reverse %i == 0)
					{
						isprime = false ;
						break ;
					}
				}
				if (isprime)
				{
					System.out.println("Twisted Prime ");
				}
				else
				{
					System.out.println("the number is prime but reverse number is not prime ");
				
				}
		}
		else
		{
			System.out.println("Number is not prime ");
		}
	}
}
