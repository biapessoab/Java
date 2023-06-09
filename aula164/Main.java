package aula164;

import java.util.*;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int number = sc.nextInt();

        for(int i=0; i<number; i++) {
            System.out.println("Shape #" + i + " data:");

            System.out.print("Rectangle or circle (r/c)? ");
            char shape = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(shape == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape s = new Rectangle(color, width, height);
                list.add(s);
            }
            else if(shape == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Shape s = new Circle(color, radius);
                list.add(s);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");

        for (Shape shape : list) {
            System.out.println(shape.area());
        }
    }
}
