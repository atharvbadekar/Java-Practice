import java.util.Scanner;

public class UserIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Please enter your college name:");
        String collegeName = scanner.nextLine();
        
        System.out.println("Please enter your degree:");
        String degree = scanner.nextLine();
        
        System.out.println("Please enter your graduation year:");
        int graduationYear = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Please enter your address:");
        String address = scanner.nextLine();
        
        System.out.println("Please enter your phone number:");
        Long phoneNumber = scanner.nextLong();
        
        System.out.println("Please enter your percentage/CGPA:");
        double percentageOrCGPA = scanner.nextDouble();
        
        
        System.out.println("\n--- User Introduction ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College Name: " + collegeName);
        System.out.println("Degree: " + degree);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Percentage/CGPA: " + percentageOrCGPA);
        
        
        scanner.close();
    }
}
