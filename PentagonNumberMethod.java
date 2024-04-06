class PentagonNumberMethod 
{
	public static void pentagonNumber(int num)
	{
			int line = 0 ;
			int i = 4 ;
			int j = 1 ;
			for (int a = 0;a<num ;a++ )
			{
				int ans = j+i ;
				if (line < 10)
				{
					System.out.print(j + " " ) ;
					line ++ ;

				}
				else
				{
					System.out.println() ;
					System.out.print(j + " " ) ;
					line = 1 ;
				}
				
				
				j = ans ;
				i += 3;
			}
			
	
		
	}
	public static void main(String[] args) 
	{

		pentagonNumber(50) ;
	}
}
