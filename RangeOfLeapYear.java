import java.util.Scanner ;
class RangeOfLeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the start year : ");
		int start = sc.nextInt() ;
		System.out.print("Enter the end year : ");
		int end = sc.nextInt() ;

		if (start > 1582)
		{
			for (int year = start;year <= end ;year++ )
			{
				if (year%4==0&&year%100!=0 || year%400==0)
				{
					System.out.println(year) ;
				}
			}

		}
		else 
		{
			System.out.println("The calenmder is not inventyed at that time ....." ) ;
		}

		
	}
}
