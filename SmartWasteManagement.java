import java.util.Scanner;

public class SmartWasteManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Smart Waste Management System!");
        System.out.println("Enter the type of waste to get disposal recommendations.");

        // Display waste categories
        System.out.println("\nWaste Categories:");
        System.out.println("1. Food Waste");
        System.out.println("2. Plastic");
        System.out.println("3. Metal");
        System.out.println("4. Glass");
        System.out.println("5. E-Waste");
        System.out.println("6. Hazardous Materials (e.g., batteries, chemicals)");

        // Input from the user
        System.out.print("\nEnter the type of waste: ");
        String wasteType = scanner.nextLine().toLowerCase();

        // Analyze waste type and provide recommendations
        System.out.println("\nWaste Disposal Recommendation:");
        switch (wasteType) {
            case "food waste":
                System.out.println("Category: Biodegradable.");
                System.out.println("Recommendation: Compost it or dispose of it in the green bin.");
                break;

            case "plastic":
                System.out.println("Category: Recyclable.");
                System.out.println("Recommendation: Segregate and send it to recycling facilities.");
                break;

            case "metal":
                System.out.println("Category: Recyclable.");
                System.out.println("Recommendation: Recycle or sell it to a scrap dealer.");
                break;

            case "glass":
                System.out.println("Category: Recyclable.");
                System.out.println("Recommendation: Recycle or dispose of it in designated glass bins.");
                break;

            case "e-waste":
                System.out.println("Category: Hazardous.");
                System.out.println("Recommendation: Take it to authorized e-waste collection centers.");
                break;

            case "hazardous materials":
                System.out.println("Category: Hazardous.");
                System.out.println("Recommendation: Contact local hazardous waste disposal services.");
                break;

            default:
                System.out.println("Unknown waste type. Please categorize it manually or consult local guidelines.");
        }

        System.out.println("\nThank you for using the Smart Waste Management System!");
        scanner.close();
    }
}
