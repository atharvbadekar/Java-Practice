import java.util.Scanner ;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number : ");
		int num  = sc.nextInt() ;
		boolean isDuck = false ;

		while (num>0)
		{
			int last  = num % 10 ;
			if (last == 0)
			{
				isDuck = true ;
				break ;
			}
			num /= 10 ;
		}
		if (isDuck)
		{
			System.out.println("The number is Duck Number ") ;
		}
		else
		{
			System.out.println("The number is not Duck Number ") ;
		}

	}
}
