import java.util.Scanner ;
class AmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Number : ");
		int num  = sc.nextInt() ;
		int count = 0 ;
		int sum = 0 ;
		for (int i =num;i != 0 ;i/=10 )
		{
			count ++ ;

		}
		//System.out.println(count) ;

		for (int i = num;i!=0 ;i/=10 )
		{
			int last = i % 10 ;
			int power = 1 ;
			for (int j = 1;j<=count ;j++ )
			{
				power *= last ;

			}
			//System.out.println(power) ;
			sum += power ;
		
		}

		if (sum == num)
		{
			System.out.println("Amstrong Number") ;
		}
		else
		{
			System.out.println("Not Amstrong") ;
		}

	}
}
