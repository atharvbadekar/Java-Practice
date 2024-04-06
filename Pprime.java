import java.util.Scanner ;
class Pprime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the 1 st Number : ");
		int start = sc.nextInt() ;
		System.out.print("Enter the 2 nd Number : ");
		int end = sc.nextInt() ;

		for (int i = start;i<=end ;i++ )
		{
			int den = 2;
			for (;den<start ; den++)
			{
				if (i % den == 0)
				{
					break ;
				}

			}
			if (den == start)
			{
				System.out.println(start);
			}

		}
		


	}
}
