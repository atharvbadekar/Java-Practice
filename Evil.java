class Evil 
{
	public static void main(String[] args) 
	{
		int num = 9 ;
		String bin = decToBin(num) ;
		int ct = countOfOne(bin) ;
		System.out.println(isevil(ct)) ;
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
	
	public static int countOfOne(String ans)
	{
		int ct = 0 ;
		for (int i = 0 ;i<ans.length() ;i++ )
		{
			char result = ans.charAt(i);
			if (result == '1')
			{
				ct++ ;
			}
		}
		return ct ;
	}
	public static boolean isevil(int num)
	{
		return num%2==0 ;
	}
}
