class HarshadMethod
{
	public static void main(String[] args) 
	{
		int a = 1 ;
		while (a<=100)
		{
			if (isHarshad(a))
			{
				System.out.println(a) ;
			}
			a++ ;
		}
	}
	public static boolean isHarshad(int num)
	{
		boolean isharshad = false ;
		int sum = 0 ;
		for (int i =num;i!=0 ;i/=10 )
		{
			sum = sum + i%10 ;
		}
		if (num%sum==0)
		{
			isharshad = true;	
		}
		return isharshad ;
	}
}
