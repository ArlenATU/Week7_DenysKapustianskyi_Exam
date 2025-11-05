package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Product>products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while(!exit) {
            System.out.println("Type 1 to add a new product:\nType 2 to update an existed product:\nType 3 to see the list of products: \nType 4 to exit: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();

            int i = 0;

            if(userInput == 1) {
                System.out.println("How many products do you want to add: ");
                int count = scanner.nextInt();
                scanner.nextLine();

                while(i < count) {
                    System.out.println("Enter product ID: ");
                    String productID = scanner.nextLine();

                    for(Product p : products) {
                        while(p.getProductID().equals(productID)) {
                            System.out.println("Entered product ID exists. Enter a new one: ");
                            productID = scanner.nextLine();
                        }
                    }

                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter price: ");
                    double price = scanner.nextDouble();

                    System.out.println("Enter quantity");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    products.add(new Product(productID, name, price, quantity));
                    i++;
                }

            }
            if(userInput == 2) {
                System.out.println("Enter product ID: ");
                String productID = scanner.nextLine();

                for(Product p : products) {
                    if(p.getProductID().equals(productID)) {
                        System.out.println("Enter new name: ");
                        String name = scanner.nextLine();
                        p.setName(name);

                        System.out.println("Enter price: ");
                        double price = scanner.nextDouble();
                        p.setPrice(price);

                        System.out.println("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();
                        p.setQuantity(quantity);
                    } else {
                        System.out.println("Product ID does not exist. Try again");
                    }
                }

            }

            if(userInput == 3) {
                System.out.println("Product list: ");
                for(Product p : products) {
                    System.out.println(products);
                }
                System.out.println("");
            }

            if(userInput == 4) {
                exit = true;
            }
        }

    }
}
