class Fermat 
{
	public static void main(String[] args) 
	{
		int n = 5 ;
		for (int i=0;i<n ;i++ )
		{
			System.out.println(power(2,power(2,i)) + 1) ;
		}
	}
	public static int power(int base ,int raise)
	{
		int pow = 1 ;
		for (int i = 0;i<raise ;i++ )
		{
			pow *= base ;
		}
		return pow ;
	}
}
