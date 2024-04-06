class PowerofNumber 
{
	public static void main(String[] args) 
	{
		int base = 2 ;
		int raise = 5 ;
		int power = 1 ;
		for (int i = 1;i<=raise ;i++ )
		{
			power *= base ;
		}
		System.out.println(base +" Raised to "+ raise + " is = " + power);
	}
}
