class Charprinting 
{
	public static void main(String[] args) 
	{
		int start = 1 ;
		int end = 127 ;
		do
		{
			char ch  = (char)start ;
			System.out.print(ch+ " " ) ;
			start++ ;

		}
		while (start <= end);
	}
}
