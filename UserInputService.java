import java.util.Scanner;

public class UserInputService {

    private final Scanner scanner;

    // Constructor
    public UserInputService() {
        this.scanner = new Scanner(System.in);
    }

    // Collect user profile details
    public UserProfile collectUserDetails() {
        System.out.println("Welcome to the Calorie Calculator!");

        String gender = getValidGender();
        int age = getValidIntegerInput("Enter your age (in years): ");
        double weight = getValidDoubleInput("Enter your weight (in kilograms): ");
        double height = getValidDoubleInput("Enter your height (in centimeters): ");
        String activityLevel = getValidActivityLevel();

        return new UserProfile(gender, age, weight, height, activityLevel);
    }

    // Gender validation
    private String getValidGender() {
        String gender;
        while (true) {
            System.out.print("Enter your gender (M/F): ");
            gender = scanner.nextLine().trim().toUpperCase();
            if ("M".equals(gender) || "F".equals(gender)) {
                break;
            }
            System.out.println("Invalid input! Please enter 'M' or 'F'.");
        }
        return gender;
    }

    // Integer validation (for age)
    private int getValidIntegerInput(String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                if (input > 0) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.nextLine();  // Clear invalid input
            }
        }
        return input;
    }

    // Double validation (for weight/height)
    private double getValidDoubleInput(String prompt) {
        double input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                if (input > 0) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear invalid input
            }
        }
        return input;
    }

    // Activity level validation
    private String getValidActivityLevel() {
        String activityLevel;
        while (true) {
            System.out.print("Enter your activity level (sedentary/moderate/active): ");
            activityLevel = scanner.nextLine().trim().toLowerCase();
            if ("sedentary".equals(activityLevel) || "moderate".equals(activityLevel) || "active".equals(activityLevel)) {
                break;
            }
            System.out.println("Invalid input! Please enter 'sedentary', 'moderate', or 'active'.");
        }
        return activityLevel;
    }

    // Close scanner resource
    public void closeScannerResource() {
        scanner.close();
    }
}
