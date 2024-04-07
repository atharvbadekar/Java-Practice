class AutomorphicNumberMethod 
{
	public static void main(String[] args) 
	{
		int num = 25 ;
		System.out.println(isAutomorphic(num)) ;
		
	}
	public static int power(int base, int raise) 
	{
		int pow = 1 ;
		for (int i= 0;i<raise ;i++ )
		{
			pow *= base ;
		}
		return pow ;
	}
	public static int count(int num)
	{
		int ct = 0 ;
		for (int i = num;i != 0 ;i/=10)
		{
			ct ++ ;
		}
		return ct ;
	}
	public static boolean isAutomorphic(int num)
	{
		int sq = num * num ;
		int last = sq % power(10,count(num)) ;
		if (last == num)
		{
			return true ;
		}
		else
		{
			return false ;
		}
	}
}
