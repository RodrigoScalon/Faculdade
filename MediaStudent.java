import java.util.Scanner;
public class MediaStudent {


    String name; 
    double n1,n2,n3,fg,mp;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student Student = new Student();

        System.out.println("Name: ");
        Student.name = input.nextLine(); 

        System.out.println("Nota 1: ");
        Student.n1 = input.nextDouble();
        System.out.println("Nota 2: ");
        Student.n2 = input.nextDouble();
        System.out.println("Nota 3: ");
        Student.n3 = input.nextDouble();

        System.out.println("FINAL GRADE: " +Student.fg()); 

            if (Student.fg() < 60.0) {
                System.out.println ("FAILED");
                System.out.printf ("MISSING POINTS: %.2f%n ", +Student.mp());
            }
            else {
                System.out.println("PASS!");
            }

        input.close();
    }
}