import java.util.Scanner ;
class DuckNumberCheckMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number : ");
		int number = sc.nextInt() ;
		DuckCheck(number) ;
		
	}
	public static void DuckCheck(int num)
	{
		while (num != 0)
		{
			int last = num % 10 ;
			if (last == 0)
			{
				break ;
			}
			num /= 10 ;
		}
		if (num != 0)
		{
			System.out.println("The Number is Duck Number" ) ;
		}
		else
		{
			System.out.println("The Number is NOT Duck Number" ) ;
		}
	}
}
