import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int employees = sc.nextInt();
        
        List<Employee> list = new ArrayList<>();

        for (int i=0; i<employees; i++) {
            System.out.println("Employee #" + i + " data:");

            System.out.println("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Hours: ");
            int hours = sc.nextInt();
            
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (outsourced == 'y') {
                System.out.println("Additional charge: ");
                double additional = sc.nextDouble();
                Employee emp = new Outsourced(name, hours, valuePerHour, additional);
                list.add(emp);
            }
            else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee employee : list) {
            System.out.println(employee.getName() + "- $" + employee.payment());
        }

        sc.close();
    }
}
