import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1500;
        int choice;

        while (true) {
            System.out.println("\n----- WELCOME TO ATM -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is Rs. " + balance);
                    break;

                case 2:
                    System.out.print("Enter an amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Rs. " + depositAmount + " deposited successfully.");
                    } else {
                        System.out.println("Invalid amount. Try again.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Rs. " + withdrawAmount + " withdrawn successfully.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance. Please enter a valid amount.");
                    } else {
                        System.out.println("Invalid amount. Try again.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
