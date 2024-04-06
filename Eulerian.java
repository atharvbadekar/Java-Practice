class Eulerian 
{
	public static void main(String[] args) 
	{
		System.out.println(isEulerian(132));
	}
	public static int count(int num)
	{
		int ct = 0; 
		for (int i=num;i!=0 ;i/=10 )
		{
			ct++ ;
		}
		return ct ;
	}
	public static int isEulerian(int num)
	{
		int ecount = 0 ;
		while (count(num)>1)
		{
			int last = num% 10 ;
			num/=10 ;
			int secondlast = num%10 ;
			if (last>secondlast)
			{
				ecount++ ;
			}


		}
		return ecount ;
		
	}
}
