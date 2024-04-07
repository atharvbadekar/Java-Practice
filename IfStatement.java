import java.util.Scanner ; 
class IfStatement1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Do u have an account ? ") ;
		boolean account = sc.nextBoolean();
		if (!account)
		{
			System.out.println("Create an Account " ) ;

		}
		System.out.println("Login..." );
	}
}
