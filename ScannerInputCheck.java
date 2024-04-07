import java.util.Scanner ; 
class ScannerInputCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte number: ");
		byte num1 = sc.nextByte();

		System.out.println("Enter the short number: ");
		short num2 = sc.nextShort();

		System.out.println("Enter the int number: ");
		int num3 = sc.nextInt();

		System.out.println("Enter the long number: ");
		long num4 = sc.nextLong();

		System.out.println("Enter the float number: ");
		Float num5 = sc.nextFloat();

		System.out.println("Enter the Double number: ");
		Double num6 = sc.nextDouble();

		System.out.println("Enter the Boolean value number: ");
		Boolean val = sc.nextBoolean();

		System.out.println("Enter the Char : ");
		char ch = sc.next().charAt(0);
		sc.nextLine();

		System.out.println("Enter the String : ");
		String s = sc.nextLine() ;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(val);
		System.out.println(ch);
		System.out.println(s);
	}
}
