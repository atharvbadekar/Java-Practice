class Diamond 
{
	public static void main(String[] args) 
	{
		int n = 11 ,star = 1 , space = n/2 ;
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<space;j++)
			{
				System.out.print("  " ) ;
			}
			for (int j = 0; j<star;j++ )
			{
				System.out.print("* " ) ;
			}

			

			if (i<n/2)
			{
				space -- ;
				star += 2 ;
			}
			else
			{
				space ++ ;
				star -= 2 ;
			}
			System.out.println() ;
		}
	}
}
