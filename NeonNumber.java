import java.util.Scanner ;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the NUmber : ") ;
		int num = sc.nextInt() ;
		int square = num*num ;
		int sum = 0 ;
		for (int i = square ;i != 0 ;i /=10 )
		{
			int last = i % 10 ;
			sum += last ;
		}
		System.out.println(sum);
		System.out.println(square);
		if (sum == num)
		{
			System.out.println("The Number is Neon NUmber .....");
		}
		else
		{
			System.out.println("It is Not Neon") ;
		}
	}
}
