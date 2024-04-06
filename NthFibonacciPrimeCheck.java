import java.util.Scanner ;
class NthFibonacciPrimeCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term number : ");
		int num = sc.nextInt() ;

		int n1 = 0 , n2 = 1 , n3;
		for (int i = 1;i<num ;i++ )
		{
			n3 = n1 + n2 ;
			n1 = n2 ;
			n2 = n3 ;
		}
		boolean isprime = true ;
		for (int i =2 ;i<n1 ; i++)
		{
			if (n1 % i == 0)
			{
				isprime = false ;
				break ;
			}
		}
		if (isprime)
		{
			System.out.println("The "+ num + " th Term is : " + n1+ " and it is Prime" );
		}
		else
		{
			System.out.println("The "+ num + " th Term is : " + n1+ " and it is NOT Prime" );
		}

	}
}
