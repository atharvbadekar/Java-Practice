import java.util.Scanner ;
class Seriesfb 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;

		System.out.print("Enter the number till u wnat series : ");
		int num  = sc.nextInt() ;

		int firstnum = 0 ;
		int secondnum = 1;

		System.out.print(firstnum + " " + secondnum) ;
		for (int i = 2;i<num ;i++ )
		{
			int nextterm = firstnum + secondnum ;
			System.out.print(" " + nextterm) ;
			firstnum = secondnum ;
			secondnum = nextterm ;
		}
	}
}
