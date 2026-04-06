package exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter integer b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient;
        System.out.println("---Results----");
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);

        if (b != 0) {
            quotient = (double) a / b;
            System.out.println("The quotient is " + quotient);
        } else {
            System.out.println("The quotient is undefined as divided by zero");
        }
    }
}
