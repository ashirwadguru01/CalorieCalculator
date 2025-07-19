public class CalorieCalculatorService {

    // Constants for BMR calculation
    private static final double BMR_MALE_BASE = 88.362;
    private static final double BMR_FEMALE_BASE = 447.593;
    private static final double WEIGHT_COEFFICIENT_MALE = 13.397;
    private static final double WEIGHT_COEFFICIENT_FEMALE = 9.247;
    private static final double HEIGHT_COEFFICIENT_MALE = 4.799;
    private static final double HEIGHT_COEFFICIENT_FEMALE = 3.098;
    private static final double AGE_COEFFICIENT_MALE = 5.677;
    private static final double AGE_COEFFICIENT_FEMALE = 4.330;

    private static final double SEDENTARY_CALORIE_MULTIPLIER = 1.2;
    private static final double MODERATE_CALORIE_MULTIPLIER = 1.55;
    private static final double ACTIVE_CALORIE_MULTIPLIER = 1.725;

    // Method to compute BMR based on user data (gender, weight, height, age)
    public double calculateBaseMetabolicRate(UserProfile userProfile) {
        double bmr = 0;

        if ("M".equalsIgnoreCase(userProfile.getGender())) {
            bmr = BMR_MALE_BASE +
                  (WEIGHT_COEFFICIENT_MALE * userProfile.getWeight()) +
                  (HEIGHT_COEFFICIENT_MALE * userProfile.getHeight()) -
                  (AGE_COEFFICIENT_MALE * userProfile.getAge());
        } else { // Assumes female by default
            bmr = BMR_FEMALE_BASE +
                  (WEIGHT_COEFFICIENT_FEMALE * userProfile.getWeight()) +
                  (HEIGHT_COEFFICIENT_FEMALE * userProfile.getHeight()) -
                  (AGE_COEFFICIENT_FEMALE * userProfile.getAge());
        }
        return bmr;
    }

    // Method to calculate total daily calorie expenditure based on activity level
    public double calculateTotalCalorieIntake(double bmr, String activityLevel) {
        double totalCalories = 0;

        switch (activityLevel.toLowerCase()) {
            case "sedentary":
                totalCalories = bmr * SEDENTARY_CALORIE_MULTIPLIER;
                break;
            case "moderate":
                totalCalories = bmr * MODERATE_CALORIE_MULTIPLIER;
                break;
            case "active":
                totalCalories = bmr * ACTIVE_CALORIE_MULTIPLIER;
                break;
            default:
                throw new IllegalArgumentException("Unknown activity level: " + activityLevel);
        }
        return totalCalories;
    }
}
