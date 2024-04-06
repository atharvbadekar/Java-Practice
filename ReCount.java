class ReCount 
{
	static int ct = 0 ;
	public static void main(String[] args) 
	{
		System.out.println(count(1234));
	}
	public static int count(int num)
	{
		if (num!=0)
		{
			ct ++ ;
			count(num/10) ;
		}
		return ct ;
	}
}
