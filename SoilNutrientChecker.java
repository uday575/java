import java.util.Scanner;

public class SoilNutrientChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to the Soil Nutrient Checker!");
        System.out.println("Enter the nutrient values (NPK levels):");

        // Input for Nitrogen (N)
        System.out.print("Enter Nitrogen (N) value: ");
        double nitrogen = scanner.nextDouble();

        // Input for Phosphorus (P)
        System.out.print("Enter Phosphorus (P) value: ");
        double phosphorus = scanner.nextDouble();

        // Input for Potassium (K)
        System.out.print("Enter Potassium (K) value: ");
        double potassium = scanner.nextDouble();

        // Nutrient thresholds (can be modified based on real-world data)
        final double N_LOW = 20.0, N_HIGH = 50.0;
        final double P_LOW = 10.0, P_HIGH = 40.0;
        final double K_LOW = 15.0, K_HIGH = 50.0;

        // Analyze Nitrogen
        System.out.println("\nNutrient Analysis:");
        if (nitrogen < N_LOW) {
            System.out.println("Nitrogen is LOW. Recommendation: Apply nitrogen-rich fertilizer (e.g., urea).");
        } else if (nitrogen > N_HIGH) {
            System.out.println("Nitrogen is HIGH. Recommendation: Avoid nitrogen-based fertilizers.");
        } else {
            System.out.println("Nitrogen level is OPTIMAL.");
        }

        // Analyze Phosphorus
        if (phosphorus < P_LOW) {
            System.out.println("Phosphorus is LOW. Recommendation: Apply phosphorus-rich fertilizer (e.g., superphosphate).");
        } else if (phosphorus > P_HIGH) {
            System.out.println("Phosphorus is HIGH. Recommendation: Avoid phosphorus-based fertilizers.");
        } else {
            System.out.println("Phosphorus level is OPTIMAL.");
        }

        // Analyze Potassium
        if (potassium < K_LOW) {
            System.out.println("Potassium is LOW. Recommendation: Apply potassium-rich fertilizer (e.g., potassium sulfate).");
        } else if (potassium > K_HIGH) {
            System.out.println("Potassium is HIGH. Recommendation: Avoid potassium-based fertilizers.");
        } else {
            System.out.println("Potassium level is OPTIMAL.");
        }

        System.out.println("\nThank you for using the Soil Nutrient Checker!");
        scanner.close();
    }
}
