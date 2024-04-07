class TwinPrime 
{
	public static void main(String[] args) 
	{
		int start = 1 ;
		int end = 100 ;

		int prime1 = returnprime(start) ;
		int prime2 ;

		while (prime1<=end)
		{
			prime2 = returnprime(prime1+1) ;
			if (prime2-prime1 <= 2)
			{
				System.out.println(prime1 + " , " + prime2) ;
			}
			prime1 = prime2 ;
		}

	}


	public static int returnprime(int num)
	{
		for (int i = num; ;i++ )
		{
			int j ;
			for (j = 2;j<i ;j++ )
			{
				if (i%j == 0)
				{
					break ;
				}
			}
			if (j == i)
			{
				return i ;
			}
		}
	}
}
