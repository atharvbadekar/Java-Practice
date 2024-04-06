import java.util.Scanner;

public class MysteryNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a mystery number
        boolean isMysteryNumber = false;
        for (int i = 1; i <= number / 2; i++) {
            int reversedNumber = reverse(i);
            if (i + reversedNumber == number) {
                isMysteryNumber = true;
                break;
            }
        }

        // Print the result
        if (isMysteryNumber) {
            System.out.println(number + " is a mystery number.");
        } else {
            System.out.println(number + " is not a mystery number.");
        }
    }

    private static int reverse(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }
}