class RangePrime 
{
	public static void main(String[] args) 
	{
		int n1 = 10 ;
		int n2 = 20 ;
		while (n1<=n2)
		{
			int den = 2 ;
			while (den < n1)
			{
				if (n1%den==0)
				{
					break ;
				}
				den++ ;
			}
			if (den == n1)
			{
				System.out.println(n1);
			}
			n1++ ;

		}
	}
}
