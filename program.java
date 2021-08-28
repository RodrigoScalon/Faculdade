import java.util.Locale;
import java.util.Scanner;

public class program {

    public String name;
    public double price;
    public int quantity;

public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner input = new Scanner(System.in);

    product product = new product();
    System.out.println("Enter product data: ");
    System.out.println("Name: ");
    product.name = input.nextLine();
    System.out.println("Price:");
    product.price = input.nextDouble();
    System.out.println("Quantity in Stock: ");
    product.quantity = input.nextInt();

    System.out.println(product.name + ", " +product.price + ", " +product.quantity);


    input.close();

}
}