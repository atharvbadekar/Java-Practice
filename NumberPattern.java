class NumberPattern 

{
	public static void show()
	{
		System.out.println("This is Show Function") ;
	}
	public static void main(String[] args) 
	{
		int n = 5 ;
		int num = 1 ;
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<i ;j++ )
			{
				System.out.print(num++ + " ") ;
			}
			System.out.println();
			
		}
		show() ;
		
	}
}
