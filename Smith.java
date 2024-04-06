class Smith 
{
	public static void main(String[] args) 
	{
		int n = 85 ;
		System.out.println(sum(n)==psum(n)) ;
		
	}
	public static int extract(int num)
	{
		return num%10 ;
	}
	public static int sum(int num)
	{
		int sum = 0 ;
		while (num!=0)
		{
			int last = extract(num) ;
			sum += last ;
			num /= 10 ;

		}
		return sum ;
	}
	public static int psum(int num)
	{
		int psum = 0 ;
		for (int i =2;num>1 ;i++ )
		{
			while (num % i == 0)
			{
				psum += sum(i) ;
				num/=i ;
			}
		}
		
		return psum ;
	}
	
}
