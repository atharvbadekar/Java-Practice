class Pascal 
{
	public static void main(String[] args) 
	{
		int n = 6 ;
		for (int i = 0;i<=n ;i++ )
		{
			for (int j = 0;j<n-i ;j++ )
			{
				System.out.print("  ") ;
			}
			for (int j = 0;j<=i ;j++ )
			{
				System.out.print(pascal(i,j)+"   " ) ;
			}
			System.out.println() ;
		}
	}
	public static int factorial(int  num)
	{
		int fact = 1 ;
		for (int i =1;i<=num;i++ )
		{
			fact *=i;
		}
		return fact ;
	}
	public static int pascal(int n, int r) 
	{
        return factorial(n) / (factorial(n-r) *factorial(r)) ;
        
    }
}
