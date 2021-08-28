import java.util.Scanner;

public class valRectangle {

    double width, height, area, perimiter, diagonal; 

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        rectangle rectangle = new rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = input.nextDouble();
        rectangle.height = input.nextDouble();

        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimiter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal() );


        input.close();

    }
}

