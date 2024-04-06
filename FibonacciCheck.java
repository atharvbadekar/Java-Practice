import java.util.Scanner ; 
class FibonacciCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Number : ");
		int num = sc.nextInt() ;
		 int fb = 0 ;
		 int n2 = 1 ;
		 int n3 ;
		 boolean isfibo = false ;
		 for (int i=0;fb <= num ;i++ )
		 {
			 if (fb == num)
			 {
				 isfibo = true ;
				 break ;
				 
			 }
			 n3 = fb + n2 ;
			 fb = n2 ;
			 n2 = n3 ;
		 }
		 if (isfibo)
		 {
			 System.out.println("FB");
		 }
		 else
		{
			System.out.println("Not fibo");
		}
	}
}
