import java.util.Scanner ;

class switch1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("*****Calculator*****");

        System.out.println("1.Addition(+)");

		System.out.println("2.Subtraction(-)");

		System.out.println("3.MUltipilcation(*)");
		
		System.out.println("4.Division(/)");

		System.out.print("Enter the no to perfom calculaton");

		int i = sc.nextInt();

		switch(i)
		{
			case 1 :
			{
			   System.out.println("Enter the num1:");
			   int num1 = sc.nextInt();
			   System.out.println("Enter the num2:");
               int num2 = sc.nextInt();
			   int ans = num1+num2;
			   System.out.println("The addition of" + num1 + "and " + num2 + " is :" + ans);

			   break;

			}
            case 2 :
            {
			   System.out.println("Enter the num1:");
			   float a = sc.nextFloat();
			   System.out.println("Enter the num2:");
               float b = sc.nextFloat();
			   float c = a-b;
			   System.out.println("The Subtraction of" + a + "and " + b + " is :" + c);

			   break;

            }
			 case 3 :
            {
			   System.out.println("Enter the num1:");
			   double x = sc.nextDouble();
			   System.out.println("Enter the num2:");
               double y = sc.nextDouble();
			   double z = x*y;
			   System.out.println("The multipilication of" + x + "and " + y + " is: " + z );

			   break;

            }
			 case 4 :
            {
			   System.out.println("Enter the num1:");
			   double p = sc.nextDouble();
			   System.out.println("Enter the num2:");
               double q = sc.nextDouble();
			   double r = p/q;
			   System.out.println("The Division of" + p + "and " + q + " is : " + r );

			   break;

            }


		}
    


	}
}
