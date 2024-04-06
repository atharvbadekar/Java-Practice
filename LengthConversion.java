class LengthConversion 
{
	public static void main(String[] args) 
	{
		metertoCentimeter(1000) ;
	}
	public static void metertoCentimeter(double meter)
	{
		double cm = meter * 100 ;
		System.out.println(cm) ;

		centimetertoInch(cm) ;
	}
	public static void centimetertoInch(double cm)
	{
		double inch = cm * 0.393701;
		System.out.println(inch) ;

		inchtoFoot(inch) ;
	}
	public static void inchtoFoot(double inch)
	{
		double foot = inch * 0.0833333;
		System.out.println(foot) ;

		foottoKm(foot) ;
	}
	public static void foottoKm(double foot)
	{
		double km = foot * 0.0003048;
		System.out.println(km) ;
	}
}
