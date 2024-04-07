import java.util.Scanner ;
class CountofEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number : ");
		int num = sc.nextInt() ;
		int countofEven = 0 ;
		int countofOdd = 0 ;

		while (num > 0)
		{
			int last  = num%10 ;
			if (last%2 == 0)
			{
				countofEven += 1 ;
			}
			else
			{
				countofOdd += 1;
			}
			num /= 10;
		}

		System.out.println("The count of Even number is : " + countofEven) ;
		System.out.println("The count of Odd number is : " + countofOdd) ;
	}
}
