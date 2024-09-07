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
    public static void artrapezium(double a, double b, double c){
        double sol = ((a+b)*c)/2;
        System.out.println("the area is: " + sol);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        char cont = 'y';
        do{
            System.out.println("Which shape would you like to find the area of?");
            System.out.println("enter 1 for square");
            System.out.println("enter 2 for circle");
            System.out.println("enter 3 for rectangle");
            System.out.println("enter 4 for triangle");
            System.out.println("enter 5 for trapezium");
            int opt = ip.nextInt();
            switch (opt) {
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
                    break;
                case 5:
                    System.out.println("enter parallel sides and height");
                    double g = ip.nextInt();
                    double h = ip.nextInt();
                    double i = ip.nextInt();
                    artrapezium(g, h, i);
                    break;
                default:
                    System.out.println("Please enter a correct value");

            }
            System.out.println("Continue? (y/n)"); 
            cont = ip.next().toLowerCase().charAt(0); 
            ip.nextLine();
        }while(cont == 'y');
        System.out.println("Exiting Program");
        ip.close();

    }

}


