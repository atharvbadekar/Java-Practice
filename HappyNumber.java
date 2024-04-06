class HappyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(happy(10));
		System.out.println(happy(137));
		System.out.println(happy(19));
		System.out.println(happy(2));
		System.out.println(happy(6));
	}

	public static boolean happy(int num)
	{
		int np = sum(num) ;
		while (true)
		{
			if (np==1 || np==4)
			{
				break ;
			}
			np = sum(np) ;
		}
		
		return np==1 ;		
	}
	public static int sum(int num)
	{
		int sum = 0 ;
		while (num != 0)
		{
			sum = sum + (num%10)*(num%10) ;
			num/=10 ;
		}
		return sum ;
	}
}
