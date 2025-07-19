public class CalorieApp {

    public static void main(String[] args) {
        // Initialize the necessary services
        UserInputService inputService = new UserInputService();
        CalorieCalculatorService calorieService = new CalorieCalculatorService();
        ResultDisplayService displayService = new ResultDisplayService();

        // 1. Collect user data
        UserProfile userProfile = inputService.collectUserDetails();

        // 2. Calculate BMR and daily calorie requirements
        double bmr = calorieService.calculateBaseMetabolicRate(userProfile);
        double dailyCaloriesRequired = calorieService.calculateTotalCalorieIntake(bmr, userProfile.getActivityLevel());

        // 3. Display the results
        displayService.showResults(bmr, dailyCaloriesRequired);

        // 4. Close resources
        inputService.closeScannerResource();
    }
}
