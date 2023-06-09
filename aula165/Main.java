package aula165;

import java.util.*;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int people = sc.nextInt();

        List<Pessoa> list = new ArrayList<>();

        for (int i = 0; i < people; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();

                Pessoa p = new PF(name, income, health);
                list.add(p);
            }
            else if (type == 'c') {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();

                Pessoa p = new PJ1(name, income, employees);
                list.add(p);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double sum = 0;

        for (Pessoa person : list) {
            System.out.println(person.getName() + " $" + person.tax());
            sum += person.tax();
        }

        System.out.println();
        System.out.println("TAXES PAID: " + sum);
    }
}
