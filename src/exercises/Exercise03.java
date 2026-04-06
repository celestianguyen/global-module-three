package exercises;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the product price: ");
        double productPrice = scanner.nextDouble();

        if (quantity < 0 || productPrice < 0) {
            System.out.println("Invalid input. Quantity and price must be non-negative.");
            scanner.close();
            return;
        }

        double totalCost = productPrice * quantity;
        double vat = 0.1 * totalCost;

        System.out.println("-----Product info-----");
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + productPrice);
        System.out.println("Product quantity: " + quantity);
        System.out.println("Total cost = $" + totalCost);
        System.out.println("VAT = $" + vat);

        scanner.close();
    }
}
