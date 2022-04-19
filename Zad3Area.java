import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;
public class Zad3Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte userChoice;
        double radius = 0;
        double side1;
        double side2;
        double side3;

        System.out.printf("(1)Enter 1 if you want to calculate the area of a Circle %n" +
                "(2) Enter 2 if you want to calculate the area of a triangle %n" +
                "(3) Enter 3 if you want to calculate the area of a rectangle: %n");
        userChoice = scanner.nextByte();

        if (userChoice == 1) {

            System.out.println("Enter the radius of the circle: ");
            radius = scanner.nextDouble();
            System.out.println(areaOfCircle(radius));
        } else if (userChoice == 2) {
            System.out.println("Enter the size of the first side of the triangle: ");
            side1 = scanner.nextDouble();
            System.out.println("Enter the size of the second side of the triangle: ");
            side2 = scanner.nextDouble();
            System.out.println("Enter the size of the third side of the triangle: ");
            side3 = scanner.nextDouble();
            System.out.println(areaOfTriangle(side1, side2, side3));
        } else if (userChoice == 3) {
            System.out.println("Enter the size of the first side of the rectangle: ");
            side1 = scanner.nextDouble();
            System.out.println("Enter the size of the second side of the rectangle: ");
            side2 = scanner.nextDouble();
            System.out.println(areaOfRectangle(side1, side2));
        } else {
            System.out.println("Something went wrong!!!");
        }


    }

    private static double areaOfRectangle(double side1, double side2) {
        return side1 * side2;
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    private static double areaOfTriangle(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }
}





