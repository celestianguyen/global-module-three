package exercises;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input scores
        System.out.print("Enter Math score: ");
        double math = scanner.nextDouble();

        System.out.print("Enter Physics score: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter Chemistry score: ");
        double chemistry = scanner.nextDouble();

        // Input weights
        System.out.print("Enter Math weight: ");
        double wMath = scanner.nextDouble();

        System.out.print("Enter Physics weight: ");
        double wPhysics = scanner.nextDouble();

        System.out.print("Enter Chemistry weight: ");
        double wChemistry = scanner.nextDouble();

        // Validate input
        if (math < 0 || physics < 0 || chemistry < 0 ||
                wMath < 0 || wPhysics < 0 || wChemistry < 0) {
            System.out.println("Invalid input. Scores and weights must be non-negative.");
            scanner.close();
            return;
        }

        double totalWeight = wMath + wPhysics + wChemistry;

        if (totalWeight == 0) {
            System.out.println("Invalid input. Total weight cannot be zero.");
            scanner.close();
            return;
        }

        // Weighted average formula
        double average =
                (math * wMath +
                        physics * wPhysics +
                        chemistry * wChemistry) / totalWeight;

        // Output
        System.out.printf("Average score = %.2f%n", average);

        scanner.close();

    }
}
