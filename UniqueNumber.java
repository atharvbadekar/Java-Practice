class UniqueNumber 
{
	public static void main(String[] args) 
	{
		int num = 12534 ;
		
		if (isunique(num))
		{
			System.out.println("The number is unique.. ") ;
		}
		else
		{
			System.out.println("The Number is NOT unique") ;
		}
		
	}
	public static int lastDigit(int num)
	{
		return num % 10 ;
	}

	public static boolean isunique(int num)
	{
		
		while (num != 0)
		{
			int urlela = num/10 ;
			while(urlela != 0) 
			{
				if (lastDigit(urlela) == lastDigit(num))
				{
					return false ;
				}
				urlela /= 10 ;
			}
			num/=10 ;
		}
		return true ;
		
	}
	
}
