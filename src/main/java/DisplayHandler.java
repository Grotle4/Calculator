import java.util.Scanner;

public class DisplayHandler {
    Scanner scanner = new Scanner(System.in);
    public record Computation(double num1, int operatorValue, double num2) {}

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
            IO.println("Error: Operator value should only be between 1 and 4.");
            System.exit(0);
        }

        IO.println("Select your first number: ");

        double num1 = scanner.nextDouble();

        IO.println("And what number would you like to " + operations[operatorVal - 1] + " by?");

        double num2 = scanner.nextDouble();

        return new Computation(num1, operatorVal, num2);
    }


}
