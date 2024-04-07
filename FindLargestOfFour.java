class FindLargestOfFour 
{
	public static void main(String[] args) 
	{
		int num1 = 1321;
		int num2 = 1352;
		int num3 = 8732;
		int num4 = 5;
		int result;
		int result1;

		int ans  = (result1 = num1 > num2 ? num1 : num2) > (result = num3 > num4 ? num3 : num4) ? result1 : result ;
		System.out.println(ans);
	}
}
