class Sum 
{
	public static void main(String[] args) 
	{
		int start = 1 ;
		int end = 10 ;
		int sum = 0 ;
		while (start <= end)
		{
			sum += start ;
			++start ;
		}
		
		System.out.println(" The sum is : " + sum) ;
	}
}
