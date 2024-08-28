import java.util.Scanner;
import java.util.*;

public class menuapp {

    public static void arsquare(double a) {
        double sol = a * a;
        System.out.println("the area is: " + sol);
    }

    public static void arcircle(double a) {
        double sol = (3.14 * (a * a));
        System.out.println("the area of the circle is: " + sol);
    }

    public static void arrectangle(double a, double b) {
        double sol = a * b;
        System.out.println("the area is: " + sol);
    }

    public static void artriangle(double a, double b) {

        double sol = (a * b) / 2;
        System.out.println("the area is: " + sol);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Which shape would you like to find the area of?");
        System.out.println("enter 1 for square");
        System.out.println("enter 2 for circle");
        System.out.println("enter 3 for rectangle");
        System.out.println("enter 4 for triangle");
        int opt = ip.nextInt();
        switch (opt) {// TODO Auto-generated method stub
            case 1:
                System.out.println("enter the side length");
                double a = ip.nextInt();
                arsquare(a);
                break;
            case 2:
                System.out.println("enter the radius");
                double b = ip.nextInt();
                arcircle(b);
                break;
            case 3:
                System.out.println("enter length and breadth");
                double c = ip.nextInt();
                double d = ip.nextInt();
                arrectangle(c, d);
                break;
            case 4:
                System.out.println("enter the height and base");
                double e = ip.nextInt();
                double f = ip.nextInt();
                artriangle(e, f);
            default:
                System.out.println("Please enter a correct value");
        }

    }

}


