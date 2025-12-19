import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;   // discriminant

        if (d > 0) {
            System.out.println("Roots are real and distinct");
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        }
        else if (d == 0) {
            System.out.println("Roots are real and equal");
            double r = -b / (2 * a);
            System.out.println("Root = " + r);
        }
        else {
            System.out.println("There are no real solutions");
        }
    }
}
