import java.util.Scanner ;
class LeapyearMethod 
{
	public static void leapyear(int year) 
	{
		if (year < 1582 )
		{
			System.out.println("The calender is Not present at that time " ) ;
		}
		else if ((year%4==0 && year%100 != 0) || year % 400==0)
		{
			System.out.println("The year u entered is a leap year ") ;
		}
		else
		{
			System.out.println("Not a leap year") ;
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the year : ");
		int year  = sc.nextInt() ;

		leapyear(year) ;
	}
}
