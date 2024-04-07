import java.util.Scanner ;
class RotatingNumber 
{
	public static int count(int num)
	{
		int ct = 0 ;
		while (num != 0)
		{
			ct ++ ;
			num /=10 ;
		}
			return ct ;
	}

	public static int power(int base , int raise)
	{
		int pow  = 1;
		for (int i=0;i<raise ;i++ )
		{
			pow *= base ;
		}
		return pow ;
	}

	public static int rotate(int num)
	{
		return (num%10) * power(10,count(num)-1) + num/10 ;
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Numnber : ") ;
		int num = sc.nextInt() ;

		int temp = num ;
		num = rotate(num) ;
		while (num != temp)
		{
			System.out.println(num) ;
			num = rotate(num) ;
		}

	}
}
