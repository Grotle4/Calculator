import java.util.Scanner;

public class DisplayHandler {
    Scanner scanner = new Scanner(System.in);
    public record Computation(int num1, int operatorValue, int num2) {}

    public Computation introMessage(){
        IO.println("Welcome to the Calculator app.");
        IO.println("Select what operation you would like to perform.");
        IO.print("""
                1 - Add
                2 - Subtract
                3 - Multiply
                4 - Divide
                """);

        String[] operations = {"Add", "Subtract", "Multiply", "Divide"};

        int operatorVal = scanner.nextInt();

        IO.println("Select your first number: ");

        int num1 = scanner.nextInt();

        IO.println("And what number would you like to " + operations[operatorVal - 1] + " by?");

        int num2 = scanner.nextInt();

        return new Computation(num1, operatorVal, num2);
    }


}
