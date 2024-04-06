class Sunny {
    public static void main(String[] args) {
        System.out.println(issunny(81));
    }

    public static boolean issunny(int num) 
		{
		num += 1 ;
        double ans = power(num, 0.5);
		System.out.println(ans);
		System.out.println((int)ans);
        if (ans  == (int)ans ) 
		{ 
            return true;
		}
        return false;
		}

    public static double power(double base, double raise) 
	{
        double pow = 1;
        for (int i = 0; i < raise; i++) 
			{
            pow *= base;
        }
        return pow;
    }
}
