import java.util.Scanner ;
class NthFibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term number : ");
		int num = sc.nextInt() ;

		int n1 = 0 , n2 = 1 , n3;
		for (int i = 1;i<num ;i++ )
		{
			n3 = n1 + n2 ;
			n1 = n2 ;
			n2 = n3 ;
		}
			System.out.println("The "+ num + " th Term is : " + n1 );
	}
}
