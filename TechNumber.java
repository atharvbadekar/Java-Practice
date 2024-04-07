class TechNumber 
{

	public static int returnhalf(int num )
	{
		return num % power(10,count(num)/2) ;
		
		
	}
	public static int power(int base, int raise) 
	{
		int pow = 1 ;
		for (int i= 0;i<raise ;i++ )
		{
			pow *= base ;
		}
		return pow ;
	}
	public static int count(int num)
	{
		int ct = 0 ;
		for (int i = num;i != 0 ;i/=10)
		{
			ct ++ ;
		}
		return ct ;
	}
	public static void main(String[] args) 
	{
		int num = 2025 ;
		int temp = num ;
		int rem = returnhalf(num) ;
		num /= power(10,count(num)/2) ;

		int ans = rem + num ;
		if (temp == ans*ans)
		{
			System.out.println("It is a Tech Number ....");

		}
		
	}
}
