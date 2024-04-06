class TwistedPrimeMethod 
{
	public static void main(String[] args) 
	{
		int a=20;
		if(isprime(a))
		{
			int rev  = reverse(a) ;
			
			if(isprime(rev))
			{
				System.out.println("It is twisted prime Number");
			}
			else
			{
				System.out.println("It is a prime number");
			}
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}

	public static boolean isprime(int num)
	{
		int i ;
		for (i = 2;i<num ;i++ )
		{
			if(num%i==0)
			{
				break;
			}
			

		}
		return i==num;
	}
	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev *=10+(num%10);
			num/=10;
		}
		return rev;
	}

}
