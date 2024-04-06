class HarshadNumber 
{
	public static void main(String[] args) 
	{
		int num = 378 ;
		int sum = 0;
		for (int i = num ;i!=0 ;i/=10 )
		{
			int last = i % 10 ;
			sum += last ;
		}
		if (num % sum==0)
		{
			System.out.println("It is Harshad Number");
		}
		else
		{
			
			System.out.println("NOT Harshad  NUmber");
		}
	}
}
