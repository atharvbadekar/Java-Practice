class ReverseAlphabet 
{
	public static void main(String[] args) 
	{
		int start = 90 ;
		int end  = 65 ;
		while (start >= end)
		{
			char ch = (char) start ;
			System.out.println(ch);
			start-- ;
		}
	}
}
