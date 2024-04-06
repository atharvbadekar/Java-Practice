class RecDigit 
{
	public static void main(String[] args) 
	{
		digit(1234) ;
	}
	public static void digit(int num)
	{
		if (num !=0)
		{
			System.out.println(num%10) ;
			digit(num/10) ;
		}
	}
}
