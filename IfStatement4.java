import java.util.Scanner ; 
class IfStatement4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Do u have knowledge of java ? true/ false ");
		boolean ans = sc.nextBoolean() ;
		if (!ans)
		{
			System.out.println("First Study\nand then  ") ;
		}
		System.out.println("Appear for interview .");
	}
}
