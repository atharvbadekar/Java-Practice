class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		System.out.println(binToDec(11011));
	}
	public static int binToDec(int num)
	{
		int sum = 0;
		for (int i = 0;num!=0 ;i++ ,num/=10 )
		{
			int last = num % 10 ;
			sum = sum + (last*power(2,i)) ;
		}
		return sum ;
		


	}
	public static int count(int num)
	{
		int ct = 0;
		for (int i = num;i!=0 ;i/=10 )
		{
			ct++ ;
		}
		return ct ;
	}
	public static int power(int base,int raise)
	{
		int pow = 1 ;
		for (int i=0;i<raise ;i++ )
		{
			pow*=base ;
		}
		return pow ;
	}
}
