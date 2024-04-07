import java.util.Scanner ;
class SumofDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in) ;
		System.out.print("Enter the numebr : ");
		int num = sc.nextInt() ;

		System.out.println("The sum of the number from 1 to " + num + " is : " +(num*(num+1)/2)) ;
	}
}
