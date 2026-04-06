package exercises;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter license plate number (up to 5 digits): ");
        int plate = scanner.nextInt();

        if (plate < 0 || plate > 99999) {
            System.out.println("Invalid input. Must be between 0 and 99999.");
            scanner.close();
            return;
        }

        int sum = 0;

        while (plate > 0) {
            int digit = plate % 10;
            sum += digit;
            plate /= 10;
        }

        int score = sum % 10;

        System.out.println("Score points: " + score);

        scanner.close();
    }

}
