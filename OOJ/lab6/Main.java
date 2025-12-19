import java.util.Scanner;
import CIE.*;
import SEE.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int[] internal = new int[5];
            int[] external = new int[5];

            System.out.println("Enter Internal Marks:");
            for (int j = 0; j < 5; j++)
                internal[j] = sc.nextInt();

            System.out.println("Enter SEE Marks:");
            for (int j = 0; j < 5; j++)
                external[j] = sc.nextInt();

            Internal in = new Internal(internal);
            Externals ex = new Externals(usn, name, sem, external);

            System.out.println("Final Marks:");
            for (int j = 0; j < 5; j++) {
                int finalMarks = in.marks[j] + ex.seeMarks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
        }
    }
}
