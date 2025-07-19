public class ResultDisplayService {

    public void showResults(double bmr, double dailyCaloriesRequired) {
        System.out.println("\n---- Results ----");
        System.out.println("Your Basal Metabolic Rate (BMR) is: " + bmr + " calories/day.");
        System.out.println("Your daily calorie requirement based on your activity level: " + dailyCaloriesRequired + " calories/day.");
    }
}
