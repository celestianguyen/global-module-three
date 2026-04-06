package exercises;

import java.time.Year;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your birth year: ");
        int birthYear = scanner.nextInt();

        int currentYear = Year.now().getValue();

        int age;

        if (currentYear < birthYear || birthYear <= 0) {
            System.out.println("Invalid year");
        } else {
            age = currentYear - birthYear;
            System.out.println("Your birth year is " + age);
        }

    }
}
