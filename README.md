This is a Calorie Calculator application designed to estimate your daily calorie needs based on your Basal Metabolic Rate (BMR) and activity level. It provides a simple and interactive interface for users to input their personal data (age, weight, height, gender, and activity level) and receive accurate daily calorie recommendations for weight maintenance.

Features:
BMR Calculation: Computes your Basal Metabolic Rate (BMR) based on age, gender, weight, and height using the Mifflin-St Jeor Equation.

Daily Calorie Estimation: Calculates your daily calorie requirement by factoring in your activity level (Sedentary, Moderate, or Active).

User Input Validation: Ensures that user inputs (age, weight, height, etc.) are properly validated for accuracy and appropriateness.

Modular Design: The project is organized into several services, ensuring maintainability and extensibility.

Technologies Used:
Java: Core programming language for building the application.

Scanner: For reading user input.

Project Structure:
CalorieApp.java: Main entry point to the application. Controls the flow of the program by invoking user input, calculation, and result display services.

CalorieCalculatorService.java: Handles the core business logic of calculating BMR and total daily calorie requirements.

UserInputService.java: Responsible for gathering and validating user input such as gender, age, weight, height, and activity level.

ResultDisplayService.java: Displays the calculated results in a user-friendly format.

UserProfile.java: Data model to store the user’s profile information (gender, age, weight, height, activity level).
