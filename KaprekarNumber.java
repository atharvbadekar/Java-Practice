class KaprekarNumber 
{
	public static void main(String[] args) 
	{
		int start = 1 ;
		int end = 10000;
		while (start<=end)
		{
			if (isKaprekar(start))
			{
				System.out.println(start) ;
				
			}
			start ++ ;
		}
	}
	public static boolean isKaprekar(int num)
	{
		int sq = num * num ;
		int sqCount = count(sq) ;

		for (int i=0;i<sqCount ;i++ )
		{
			int eqpart = power(10,i) ;
			
			if (eqpart == num)
			{
				continue ;
			}

			int sum = sq /eqpart + sq%eqpart ;
			if (sum == num)
			{
				return true ;
			}

		}
		return false ;
		
	}
	public static int count(int num)
	{
		int ct = 0;
		while (num!=0)
		{
			ct++;
			num /= 10 ;
		}
		return ct ;
	}

	public static int power(int base,int raise)
	{
		int pow = 1 ;
		for (int i= 0;i<raise ;i++ )
		{
			pow *= base ;
		}
		return pow ;
	}
}
