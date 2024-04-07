import java.util.Scanner ;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the year : ") ;
		int year = sc.nextInt() ;
		if (year <1582)
		{
			System.out.println("The calender is not invented in that time " ) ;
		}
		else if (year%4==0&&year%100!=0 || year%400==0)
		{
			System.out.println("THe year is Leap year ") ;

		}
		else
		{
			System.out.println("The year is not Leap year ") ;
			
		}
	}
}
