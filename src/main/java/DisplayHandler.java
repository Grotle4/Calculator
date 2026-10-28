import java.util.Scanner;

public class DisplayHandler {
    Scanner scanner = new Scanner(System.in);
    public record Computation(double num1, int operatorValue, double num2) {}
    public enum errors {
        DIVISIBLEBYZERO,
        OPERATORINDEXOUTOFRANGE
    }

    public Computation introMessage(){
        String[] operations = {"Add", "Subtract", "Multiply", "Divide"};
        IO.println("Welcome to the Calculator app.");
        IO.println("Select what operation you would like to perform.");
        IO.print("""
                1 - Add
                2 - Subtract
                3 - Multiply
                4 - Divide
                """);

        int operatorVal = scanner.nextInt();
        if (operatorVal > 4 || operatorVal < 1){
            displayError(errors.OPERATORINDEXOUTOFRANGE);
        }

        IO.println("Select your first number: ");

        double num1 = scanner.nextDouble();

        IO.println("And what number would you like to " + operations[operatorVal - 1] + " by?");

        double num2 = scanner.nextDouble();

        return new Computation(num1, operatorVal, num2);
    }

    public void displayResult(double result){
        IO.println("Your result is: " + result);
    }

    public void displayError(errors errorName){
        switch (errorName){
            case errors.DIVISIBLEBYZERO -> IO.println("Error: Cannot be divided by 0");
            case errors.OPERATORINDEXOUTOFRANGE -> IO.println("Error: Operator value should only be between 1 and 4.");

        }
        System.exit(0);
    }
}
