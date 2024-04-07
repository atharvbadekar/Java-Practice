import java.util.Scanner ;
class PinVerification 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		int savedPin = 1234 ;
		int attempt = 0 ;

		do
		{
			System.out.print("Enter your pin : ");
			int pin = sc.nextInt() ;
			if (pin == savedPin)
			{
				System.out.println("Login Success! ");
				break ;
			}
			attempt++ ;
			if (attempt < 3)
			{
				System.out.println("Incorrect pin retry ") ;
				System.out.println("attempt reaming : " + (3 - attempt) ) ;
			}
				
		}
		while (attempt < 3);
		if (attempt == 3)
		{
			System.out.println("You have reached the maximum Attempt !!! ") ;
		}
	}
}
