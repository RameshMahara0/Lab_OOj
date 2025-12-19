import java.util.Scanner;

class Student {

    String usn;
    String name;
    int[] credits;
    int[] marks;
    int n;

    Scanner sc = new Scanner(System.in);


    void acceptDetails() {
        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        credits = new int[n];
        marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    // Method to calculate SGPA
    double calculateSGPA() {
        int totalCredits = 0;
        int totalPoints = 0;

        for (int i = 0; i < n; i++) {
            int gradePoint;

            if (marks[i] >= 90) gradePoint = 10;
            else if (marks[i] >= 80) gradePoint = 9;
            else if (marks[i] >= 70) gradePoint = 8;
            else if (marks[i] >= 60) gradePoint = 7;
            else if (marks[i] >= 50) gradePoint = 6;
            else if (marks[i] >= 40) gradePoint = 5;
            else gradePoint = 0;

            totalPoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        return (double) totalPoints / totalCredits;
    }


    void displayDetails() {
        System.out.println("\nUSN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("SGPA: " + calculateSGPA());
    }
}

public class SCGPA {
    public static void main(String[] args) {

        Student s = new Student();
        s.acceptDetails();
        s.displayDetails();
    }
}
