import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        boolean isprime = true ;

		if (num <=1)
		{
			isprime = false ;
		}
		else
		{
			for (int i = 2; i*i < num  ;i++ )
			{
				if (num % i == 0)
				{
					isprime = false ;
					break ;
				}
			}
		}

		if (isprime)
		{
			System.out.println("The number is prime ") ;
		}
		else
		{
			System.out.println("The number is not prime ") ;
		}
    }
}
