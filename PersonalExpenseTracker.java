import java.util.Scanner;

public class PersonalExpenseTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalIncome = 0;
        double totalExpenses = 0;

        System.out.println("Welcome to the Basic Personal Expense Tracker!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add Income
                    System.out.print("Enter income amount: ₹");
                    double income = scanner.nextDouble();
                    totalIncome += income;
                    System.out.println("Income added! Current total income: ₹" + totalIncome);
                    break;

                case 2: // Add Expense
                    System.out.print("Enter expense amount: ₹");
                    double expense = scanner.nextDouble();
                    totalExpenses += expense;
                    System.out.println("Expense added! Current total expenses: ₹" + totalExpenses);
                    break;

                case 3: // View Balance
                    double balance = totalIncome - totalExpenses;
                    System.out.println("\nCurrent balance: ₹" + balance);
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using the Personal Expense Tracker!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
