import java.util.Scanner ;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter the Number : ");
		int num = sc.nextInt() ;
		int numlast = num % 10 ;
		int sqlast = (num*num) % 10 ;
		if (numlast == sqlast)
		{
			System.out.println("It is Automorphic Number ");
		}
		else
		{
			System.out.println("NOT Automorphic Number ");
		}


	}
}
