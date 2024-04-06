import java.util.Scanner ;
class RangeofPrime2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the 1 st Number : ");
		int start = sc.nextInt() ;
		System.out.print("Enter the 2 nd Number : ");
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
