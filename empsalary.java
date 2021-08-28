import java.util.Scanner;

public class empsalary {

    String name;
    double grossSalary, tax, netSalary, increaseSalary; 

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        employee employee = new employee();

        System.out.println("Name: ");
        employee.name = input.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = input.nextDouble();
        System.out.println("Tax: ");
        employee.tax = input.nextDouble();

        System.out.printf ("Employee:", employee.name + "," +employee.netSalary);

        System.out.println("Wich percentage to increase salary? ");
        double percentage = input.nextDouble();
        employee.increaseSalary(percentage);
        
        System.out.println();
        System.out.println ("Update data:" +employee);

        input.close();
    }
}

