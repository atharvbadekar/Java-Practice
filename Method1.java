import java.util.Scanner ;
class Method1 
{
	/*public static void sum()
	{
		int num1 = 20 ;
		int num2 = 30 ;
		int sum = num1 + num2 ;
		System.out.println(sum) ;
	}*/
	public static void show()
	{
		System.out.println("This is the show statement") ;
	}
	public static void sumin(int n1 ,int n2)
	{
		int sum = n1 + n2 ;
		System.out.println(sum) ;
	}

	public static void main(String[] args) 
	{

		//sum() ;
		show() ;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the num1 : ") ;
		int num1 = sc.nextInt() ;
		System.out.println("Enter the num2 : ") ;
		int num2 = sc.nextInt() ;
		System.out.print("The sum of the num1 and num2 is : ") ;
		sumin(num1,num 2) ;
	}
}
