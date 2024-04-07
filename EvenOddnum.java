import java.util.Scanner ;
class EvenOddnum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the number : ");
		int num = sc.nextInt() ;
		if (num == ((num/2)*2))
		{
			System.out.println("The number is Even.....");
		}
		else 
		{
			System.out.println("The number is odd .....");
		}
		
	}
}
