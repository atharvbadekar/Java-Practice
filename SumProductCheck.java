import java.util.Scanner ;
class SumProductCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Number : ");
		int num = sc.nextInt() ;

		int sum = 0 ;
		int product = 1 ;
		 while (num>0)
		 {
			 int last = num%10 ;
			 sum+=last ;
			 product*=last ;
			 num /= 10 ;
		 }
		 if (sum == product)
		 {
			 System.out.println("The sum of digits and the product of digits are same .");
		 }
		 else
		{
			System.out.println("The sum of digits and the product of digits are Not same .");
		}
	}
}
