class BellNumber 
{
	public static void main(String[] args) 
	{
		
		

		for (int i = 0;i<5 ;i++ )
		{
			
			for (int j = 0;j<=i ;j++ )
			{
				int n1 = 1 ;
				int n2 = 1 ;
				int n3 = n1+n2 ;
				System.out.println(n1);
				n1 = n2 ;
				n2 = n3 ;
			}
			System.out.println() ;
		}
	}

}
