public class Lychrel {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
			int num = 20 ; 
            int ans = num + reverse(num);
            if (isPalindrome(ans)) {
                System.out.println("It is not Lychrel");
                break;
            }
            num = ans;
        }
    }

    public static int reverse(int num) {
        int rev = 0;
        for (int i = num; i != 0; i /= 10) {
            int last = i % 10; 
            rev = rev * 10 + last;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
}
