class DecimalToOctal 
{
	public static void main(String[] args) 
	{
		System.out.println(decToOct(27));
	}
	public static String decToOct(int num)
	{
		String ans = " " ;
		while (num!=0)
		{
			int rem = num % 8 ;
			ans = rem + ans ;
			num /= 8 ;
		}
		return ans ;

	}
}
