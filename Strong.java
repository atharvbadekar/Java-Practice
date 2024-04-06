class Strong 
{
	public static void main(String[] args) 
	{
		int a=654;
		int sum=0;
		for(int i=a;i!=0;i/=10)
		{
			int s=extract(a);
			int fact=factorial(s);
			sum+=fact;
			
		}
		System.out.println(sum);
	}
	public static int extract(int num)
	{
		return num%10;
	}
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact *=i;
		}
		return fact;
	}
}
