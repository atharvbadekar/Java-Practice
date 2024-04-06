class StringExtract 
{
	public static void main(String[] args) 
	{
		String a = "Atharv" ;
		int length  = a.length() ;
		
		System.out.println(length);
		if (length % 2==0)
		{
			for (int i = 1;i<length ;i+=2 )
			{
				char last = a.charAt(a.length() - i) ;
				System.out.println(last);

			}
		}
		else
		{
			for (int i = 2;i<length ;i+=2 )
			{
				char last = a.charAt(a.length() -i) ;
				System.out.println(last);

			}
			
		}
	}
}
