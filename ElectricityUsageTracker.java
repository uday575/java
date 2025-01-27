import java.util.Scanner;

public class ElectricityUsageTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Electricity Usage Tracker!");

        // Input electricity usage details
        System.out.print("Enter the number of appliances: ");
        int numAppliances = scanner.nextInt();
        double totalUsage = 0;

        for (int i = 1; i <= numAppliances; i++) {
            System.out.print("Enter the power consumption (in watts) for appliance " + i + ": ");
            double power = scanner.nextDouble();
            System.out.print("Enter the number of hours appliance " + i + " is used per day: ");
            double hours = scanner.nextDouble();

            // Calculate daily energy usage in kWh
            double dailyUsage = (power * hours) / 1000;  // converting to kWh
            totalUsage += dailyUsage;
        }

        // Assuming cost per kWh
        System.out.print("Enter the cost per kWh (in currency): ");
        double costPerKWh = scanner.nextDouble();

        // Calculate total cost for electricity usage
        double totalCost = totalUsage * costPerKWh;

        // Display the results
        System.out.println("\nTotal daily energy usage: " + totalUsage + " kWh");
        System.out.println("Total cost for electricity usage: " + totalCost + " currency");

        System.out.println("\nThank you for using the Electricity Usage Tracker!");
        scanner.close();
    }
}
