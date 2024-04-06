import java.util.Scanner ;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Number :");
		int num  = sc.nextInt() ;
		int sum = 0 ;

		for (int i =1;i<=num/2 ;i++ )
		{
			if (num % i == 0)
			{
				sum += i ;
			}
		}
		if (sum == num)
		{
			int reverse = 0 ;
			for (int i = num;i>0 ;i /= 10 )
			{
				int last = i % 10 ;
				reverse = reverse * 10 + last ;
			}
			
			if (reverse == num)
			{
				System.out.println("The number is a Perfect Number and also Palindrome ");
			}
			else
			{
				System.out.println("The number is Perfect but not palindrome ");
			}
		}
		else
		{
			System.out.println("The Number is NOT Perfect Number ");
		}
	}
}
