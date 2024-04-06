class PrintBetweenCharacters
{
	public static void betweenchar(int a , int b)
	{
			
			for (int i = a+1;i< b ;i++ )
			{
				int line = 0 ;
				if (line < 20)
				{
					System.out.print((char)i + " " ) ;
					line ++ ;

				}
				else
				{
					System.out.println() ;
					System.out.print((char)i + " " ) ;
					line = 1 ;
				}
			}
			
	
		
	}
	public static void main(String[] args) 
	{

		betweenchar(1, 127) ;
	}
}
