import java.util.Scanner;

class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    Scanner sc = new Scanner(System.in);

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        balance += amt;
        System.out.println("Deposit successful");
    }

    void displayBalance() {
        System.out.println("Current Balance = " + balance);
    }
}

class SavAcct extends Account {

    void computeInterest() {
        double rate = 0.05;
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();

        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurAcct extends Account {

    final double MIN_BAL = 1000;
    final double PENALTY = 100;

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        balance -= amt;

        if (balance < MIN_BAL) {
            balance -= PENALTY;
            System.out.println("Minimum balance not maintained");
            System.out.println("Penalty imposed: " + PENALTY);
        } else {
            System.out.println("Withdrawal successful");
        }
    }
}

public class BankDetail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose Account Type: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            SavAcct s = new SavAcct();
            s.accType = "Savings";

            System.out.print("Enter Name: ");
            sc.nextLine();
            s.name = sc.nextLine();

            System.out.print("Enter Account Number: ");
            s.accNo = sc.nextInt();

            System.out.print("Enter Initial Balance: ");
            s.balance = sc.nextDouble();

            s.deposit();
            s.computeInterest();
            s.withdraw();
            s.displayBalance();
        }

        else if (choice == 2) {
            CurAcct c = new CurAcct();
            c.accType = "Current";

            System.out.print("Enter Name: ");
            sc.nextLine();
            c.name = sc.nextLine();

            System.out.print("Enter Account Number: ");
            c.accNo = sc.nextInt();

            System.out.print("Enter Initial Balance: ");
            c.balance = sc.nextDouble();

            c.deposit();
            c.withdraw();
            c.displayBalance();
        }

        else {
            System.out.println("Invalid choice");
        }
    }
}
