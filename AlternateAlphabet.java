class AlternateAlphabet 
{
	public static void main(String[] args) 
	{
		int start = 65 ;
		int end  = 90 ;
		while (start <= end)
		{
			char ch = (char) start ;
			System.out.println(ch);
			start += 2 ;
		}
	}
}
