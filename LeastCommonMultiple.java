import java.util.Scanner ;
class LeastCommonMultiple 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the First Number : ");
		int num1 = sc.nextInt() ;
		System.out.println("Enter the Second Number : ");
		int num2 = sc.nextInt() ;

		int big  = num1>num2 ? num1:num2 ;
		int i = 1;
		while (true)
		{
			if ((big*i)%num1==0 && (big*i)%num2==0)
			{
				System.out.println("The least common multiple is :"+ (big*i) );
				break ;
			}
			i++;
		}

		//System.out.println(num1);
		//System.out.println(num2);
	}
}
