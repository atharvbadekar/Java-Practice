class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int number  = 1234 ;
		int reversed = 0 ;
		while (number > 0)
		{
			reversed = (reversed * 10) + (number % 10) ;
			number /= 10 ;
		}
		System.out.print(reversed) ;
	}
}
