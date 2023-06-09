import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of products: ");
        int products = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for(int i=0; i<products; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.println("Common or imported? (c/i/u)");
            char type = sc.next().charAt(0);

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Price: ");
            double price = sc.nextDouble();

            if (type == 'i') {
                System.out.println("Customs fee: ");
                double fee = sc.nextDouble();

                Product p = new ImportedProduct(name, price, fee);
                list.add(p);
            }
            else if (type == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();

                Product p = new UsedProduct(name, price, date);
                list.add(p);
            }
            else {
                Product p = new Product(name, price);
                list.add(p);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }
    }
}
