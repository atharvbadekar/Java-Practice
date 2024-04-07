import java.util.Scanner;

class Menu 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("******Welcome TO MO Hotel***");
		System.out.println("What would you like to Order");

		System.out.println("1.Vegiterian");
		System.out.println("2.Non-vegiterian");
		int choice = sc.nextInt();
		double bill = 0 ;

        switch(choice)
		{
			case 1: 
			{
				System.out.println("--------Vegiterian Menu ----------");
				System.out.println("1 . kaju kari (Rs. 190.00)");
				System.out.println("2 . Special kaju kari (Rs. 290.00)");
				System.out.println("3 . kaju Panir masala  (Rs. 210.00)");
				System.out.println("4 . Mix veg (Rs. 180.00)");
				System.out.println("Enter your choice : ");
				int vegFood = sc.nextInt() ;
				switch(vegFood)
				{
					case 1 :
					{
						System.out.println("How many plates u want to order ? ");
						int food1 = sc.nextInt();
						bill += 190 * food1 ;
						break;
					}
					case 2 :
					{
						System.out.println("How many plates u want to order ? ");
						int food2 = sc.nextInt();
						bill += 290 * food2 ;
						break;
					}
					case 3 :
					{
						System.out.println("How many plates u want to order ? ");
						int food3 = sc.nextInt();
						bill += 210 * food3 ;
						break;
					}
					case 4 :
					{
						System.out.println("How many plates u want to order ? ");
						int food4 = sc.nextInt();
						bill += 180 * food4 ;
						break;
					}
					default :
					{
						System.out.println("We aree ordering for u our famous veg kofta how many plate u want ? ");
						int food5 = sc.nextInt();
						bill += 280 * food5 ;
						break;
					}
				}
				break ;
			}
			case 2:
			{
				System.out.println("--------No - Vegiterian Menu ----------");
				System.out.println("1 . Chiken masala  (Rs. 350.00)");
				System.out.println("2 . Mutton Masala  (Rs. 450.00)");
				System.out.println("3 . Kheema  (Rs. 210.00)");
				System.out.println("4 . Chikan Ranmasala (Rs. 380.00)");
				System.out.println("Enter your choice : ");
				int nonVegFood = sc.nextInt() ;

				switch(nonVegFood)
				{
					case 1 :
					{
						System.out.println("How many plates u want to order ? ");
						int food1 = sc.nextInt();
						bill += 350 * food1 ;
						break;	
					}
					case 2 :
					{
						System.out.println("How many plates u want to order ? ");
						int food2 = sc.nextInt();
						bill += 450 * food2 ;
						break;	
					}
					case 3 :
					{
						System.out.println("How many plates u want to order ? ");
						int food3 = sc.nextInt();
						bill += 210 * food3 ;
						break;	
					}
					case 4 :
					{
						System.out.println("How many plates u want to order ? ");
						int food4 = sc.nextInt();
						bill += 380 * food4 ;
						break;	
					}
					default :
					{
						System.out.println("We aree ordering for u out famous a Chikan thali how many plate u want  ? ");
						int food5 = sc.nextInt();
						bill += 200 * food5 ;
						break;
					}
				}
				break ;
			}
		}
		System.out.println("What would u like  to have with this \n 1. Roti (Rs. 12) \n2.Chapati (Rs. 10) \n3.naan (Rs. 35) \n Enter ur choice : ");
		int choice1  = sc.nextInt() ;
		
		switch(choice1) 
		{
			case 1:
			{
				System.out.println("How many Roti u want ? ");
				int roti = sc.nextInt();
				bill += 12 * roti ;
				break;	
			}
			case 2:
			{
				System.out.println("How many Chapati u want ? ");
				int chapati = sc.nextInt();
				bill += 10 * chapati ;
				break;	
			}
			case 3:
			{
				System.out.println("How many naan u want ? ");
				int naan = sc.nextInt();
				bill += 35 * naan ;
				break;	
			}
			default :
			{
				System.out.println("How many Chapati u want ? ");
				int chapati = sc.nextInt();
				bill += 10 * chapati ;
				break ;
			}
		}
		bill += (18*bill)/ 100 ;

		System.out.println("Your total fuking bill with adding 18 % GST is " + bill) ;
		

       
	}
}
