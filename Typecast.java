class Typecast {
    public static void main(String[] args) {
        double a = 1284.937;
        System.out.println("---------  Double to all  -----------");
        byte b = (byte) a;
        short s = (short) a;
        char ch = (char) a;
        int i = (int) a;
        long l = (long) a;
        float f = (float) a;
        System.out.println(b);
        System.out.println(s);
        System.out.println(ch);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);

        float a1 = 512.82f;
        System.out.println("---------  Float to all  -----------");
        byte b1 = (byte) a1;
        short s1 = (short) a1;
        char ch1 = (char) a1;
        int i1 = (int) a1;
        long l1 = (long) a1;
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(ch1);
        System.out.println(i1);
        System.out.println(l1);

		long a2 = 5367521;
        System.out.println("---------  Long to all  -----------");
        byte b2 = (byte) a2;
        short s2 = (short) a2;
        char ch2 = (char) a2;
        int i2 = (int) a2;
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(ch2);
        System.out.println(i2);

		int a3 = 11;
        System.out.println("---------  Int to all  -----------");
        byte b3 = (byte) a3;
        short s3 = (short) a3;
        char ch3 = (char) a3;
        System.out.println(b3);
        System.out.println(s3);
        System.out.println(ch3);

		char a4 = 'B';
        System.out.println("---------  Char to all  -----------");
        byte b4 = (byte) a4;
        short s4 = (short) a4;
        System.out.println(b4);
        System.out.println(s4);

		short a5 = 128;
        System.out.println("---------  Short to all  -----------");
        byte b5 = (byte) a5;
        System.out.println(b5);
    }
}
