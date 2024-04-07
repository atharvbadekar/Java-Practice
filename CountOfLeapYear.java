import java.util.Scanner ;
class CountOfLeapYear 
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
			int count = 0 ;
			for (int year = start;year <= end ;year++ )
			{
				if (year%4==0&&year%100!=0 || year%400==0)
				{
					count += 1;
				}
			}
			System.out.println("The count of leap year is  - : " + count) ;

		}
		else 
		{
			System.out.println("The calenmder is not inventyed at that time ....." ) ;
		}

		
	}
}
