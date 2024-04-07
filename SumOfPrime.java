class SumOfPrime 
{
	public static void main(String[] args) 
	{
		int a=17553;
		int sum=0;
		while(a!=0)
		{
			int s=extract(a);
			if(isprime(s))
			{
				sum+=s;
			}
			a/=10;
		}
		System.out.println(sum);
		
	}
	public static int extract(int num)
	{
		return num%10;
	}
	public static boolean isprime(int num)
	{
		int i;
		for(i=2;i>0;i++)
		{
			if(num%i==0)
			{
				break;
			}
		}
		return i==num;
	}
}
