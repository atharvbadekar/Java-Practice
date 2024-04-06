import java.util.Scanner ;
class Buzz
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enyter thye Number: ");
		int num = sc.nextInt() ;

		int last = num % 10 ;
		if (last==7 || num % 7 == 0)
		{
			System.out.println("This is BUzz NUmber .....") ;
		}
		else
		{
			System.out.println("It is NOt BUZZ") ;
		}
	}
}
