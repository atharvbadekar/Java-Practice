class UglyNumber 
{
	public static void main(String[] args) 
	{
		int start =1 ;
		int end = 100 ;
		while (start<=end)
		{
			if (ugly(start))
			{
				System.out.print(start+" ") ;
			}
			start++ ;
			
		}
	}
	public static boolean ugly(int num)
	{
		while (num %2 ==0)
		{
			num/=2 ;
		}
		while (num %3 ==0)
		{
			num/=3 ;
		}
		while (num %5 ==0)
		{
			num/=5 ;
		}
		return num==1 ;
	}
	
}
