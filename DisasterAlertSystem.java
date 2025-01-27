import java.util.Scanner;

public class DisasterAlertSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Disaster Alert System!");
        System.out.println("Enter weather data to check for disaster alerts.");

        // Input weather parameters
        System.out.print("\nEnter rainfall level (in mm): ");
        double rainfall = scanner.nextDouble();

        System.out.print("Enter wind speed (in km/h): ");
        double windSpeed = scanner.nextDouble();

        System.out.print("Enter temperature (in °C): ");
        double temperature = scanner.nextDouble();

        // Display disaster alert based on conditions
        System.out.println("\nDisaster Alert Analysis:");
        if (rainfall > 200) {
            System.out.println("Alert: Heavy rainfall detected! Risk of flooding. Stay alert and follow local guidelines.");
        } else if (rainfall > 100) {
            System.out.println("Warning: Moderate rainfall detected. Possibility of waterlogging in low-lying areas.");
        } else {
            System.out.println("Rainfall levels are normal.");
        }

        if (windSpeed > 120) {
            System.out.println("Alert: Cyclonic wind speeds detected! Risk of severe storm. Seek shelter immediately.");
        } else if (windSpeed > 60) {
            System.out.println("Warning: High wind speeds detected. Possibility of structural damage. Stay cautious.");
        } else {
            System.out.println("Wind speed levels are normal.");
        }

        if (temperature > 45) {
            System.out.println("Alert: Extreme heat detected! Risk of heatwaves. Stay hydrated and avoid outdoor activities.");
        } else if (temperature < 0) {
            System.out.println("Alert: Freezing temperatures detected! Risk of frostbite. Stay warm and indoors.");
        } else {
            System.out.println("Temperature levels are within the safe range.");
        }

        System.out.println("\nThank you for using the Disaster Alert System! Stay safe.");
        scanner.close();
    }
}
