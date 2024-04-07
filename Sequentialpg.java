import java.util.Scanner ;
class Sequentialpg 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in) ;
		System.out.print("Enter the first number : ");
		int a = sc.nextInt() ;
		System.out.print("Enter the last number : ");
		int l = sc.nextInt() ;

		int count  = 0 ;
		for (int i= a;i <=l ;i++ )
		{
			count += 1 ;
		}
		//System.out.println(count);
		int sum = ((l-a+1)*(a+l))/2;
		System.out.println("The sum of the series is : " + sum) ;


	}
}
