class Facto12 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int sum = 0 ;
		while (num >0)
		{
			int last  = num % 10 ;
			int fact = 1 ;
			for (int i = last;i>0 ;i-- )
			{
				fact *= i ;
			}
			sum += fact ;
			num /= 10;
		}
		System.out.println(sum);
	}
}
