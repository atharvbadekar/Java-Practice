class Asccii 
{
	public static void main(String[] args) 
	{
		int start = 1 ;
		int end = 127 ;
		while (start <= end )
		{
			char ch = (char)start ;
			System.out.println("Ascci value " + start + "Character is : " + ch);
			start++ ;
		}
	}
}
