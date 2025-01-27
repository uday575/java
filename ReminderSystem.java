import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ReminderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Reminder System!");
        System.out.print("Enter your reminder message: ");
        String message = scanner.nextLine();

        System.out.print("Set the reminder time in seconds: ");
        int seconds = scanner.nextInt();

        // Schedule the reminder
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\n*** Reminder Alert! ***");
                System.out.println("Message: " + message);
                timer.cancel(); // Stop the timer after the reminder
            }
        }, seconds * 1000);

        System.out.println("Reminder set for " + seconds + " seconds from now.");
        System.out.println("You can continue doing your tasks while we remind you.");

        // Close the scanner
        scanner.close();
    }
}
