class Pattern8
{
	public static void main(String[] args) 
	{
		int n = 4 ;
		int count = 65 ;
		for (int i = 1;i<=n ;i++ )
		{
			
			for (int j=1;j<=n ;j++ )
			{
				char ch = (char)count ;
				System.out.print(ch+" ") ;
				count++ ;
			}
			System.out.println() ;
		}
	}
}
