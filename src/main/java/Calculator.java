public class Calculator {
    /*
    In order for this script to work. We need to break it up into multiple processes.
    1. A display handler to manage CLI line displays and user input.
    2. A calculator processer that can proccess operations from said user input.
    3. An input handler to take the input and parse it into integers that are usable for math operations.
     */

    public static void main(String[] args){
        DisplayHandler display = new DisplayHandler();
        DisplayHandler.Computation comp = display.introMessage();
        if (comp.num2() == 0 || comp.num1() == 0 && comp.operatorValue() == 4){
            display.displayError(DisplayHandler.errors.DIVISIBLEBYZERO);
        }

        CalcEngine engine = new CalcEngine(comp.num1(), comp.num2(), comp.operatorValue());
        double result = engine.calculateTotal();
        display.displayResult(result);
    }
}
