import java.util.Scanner ;
class CharConversion
{
	public static void convert(char ch)
	{
		if (ch>='A' && ch<= 'Z')
		{
			char ans = (char)(ch+32) ;
			System.out.println(ans) ;
		}
		else if (ch>='a' && ch<='z')
		{
			char ans = (char)(ch-32) ;
			System.out.println(ans);
		}
		else
		{
			System.out.println("It is not a Character ") ;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Character: ") ;
		char ch = sc.next().charAt(0) ;
		convert(ch) ;
	}
}
