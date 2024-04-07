class FindLargestOfThree 
{
	public static void main(String[] args) 
	{
		int num1 = 1321;
		int num2 = 1352;
		int num3 = 8732;
		int result;

		int ans  = num1 > (result = num2 > num3 ? num2 : num3) ? num1 : result ;
		System.out.println(ans);
	}
}
