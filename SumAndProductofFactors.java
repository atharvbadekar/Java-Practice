import java.util.Scanner ;
class SumAndProductofFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Number: ");
		int num = sc.nextInt() ;

		int sum = 0 ;
		int product = 1 ;


		for (int i = 1;i <= (num/2) ;i++ )
		{
			if (num % i == 0)
			{
				sum += i;
				product *= i;

			}

		}
		System.out.println("The sum of the factors is : " + sum);
		System.out.println("The product of the factors is : "+product);
		if (sum == product)
		{
			System.out.println("the sum and product of Factors of that number is Same ") ;
		}
		else
		{
			System.out.println("T99he sum and product of Factors of that number is Not Same ") ;
		}
	}
}
