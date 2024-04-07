import java.util.Scanner ;
class EvenPalindromeCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the Number : ");
		int num = sc.nextInt() ;
		int orignalNum = num ;

		if (num%2 == 0)
		{
			int reverse  = 0 ;
			while(num>0)
			{
				int last  = num%10 ;
				reverse = reverse * 10 + last ;
				num/=10 ;
			}
			if (orignalNum == reverse)
			{
				if (reverse%2==0)
				{
					System.out.println("Both the orignal Number and the reverse numbers are Even") ;
				}
			}
			else
			{
				System.out.println("The number is Even but not Palindrome .");
			}

		}	
		else 
		{
			System.out.println("The number is not Even");
		}
	}
}
