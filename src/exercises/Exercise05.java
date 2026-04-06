package exercises;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        // Validate input
        if (radius < 0) {
            System.out.println("Invalid input. Radius must be non-negative.");
            scanner.close();
            return;
        }

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Circumference = %.2f%n", circumference);
        System.out.printf("Area = %.2f%n", area);

        scanner.close();
    }
}
