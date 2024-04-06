import java.util.Scanner ;
class RangeofPrime2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the 1 st Number of players : ");
		int start = sc.nextInt() ;
		System.out.println("Enter the 2 nd Number of players : ");
		int end = sc.nextInt() ;

		while (start<=end)
		{
			int den = 2 ;
			for (;den<start ;den++ )
			{
				if (start%den == 0)
				{
					System.out.println(start) ;
				}
			}
			start++ ;
		}
		


	}
}
