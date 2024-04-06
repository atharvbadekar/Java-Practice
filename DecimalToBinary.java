class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		System.out.println(decToBin(27));
	}
	public static String decToBin(int num)
	{
		String ans = " " ;
		while (num!=0)
		{
			int rem = num % 2 ;
			ans = rem + ans ;
			num /= 2 ;
		}
		return ans ;

	}
}
