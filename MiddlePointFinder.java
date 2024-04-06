class MiddlePointFinder 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		isMiddle(2,8,5) ;
	}
	public static void isMiddle(int num1, int num2, int num3)
	{
		int small = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
		int big = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		if ((small+big)/2 == num1 || (small+big)/2 == num2 || (small+big)/2 == num3)
		{
			System.out.println("It has a middle Number") ;
		}
		else
		{
			System.out.println("It does not have Middle Number " ) ;
		}


	}
}
