public class CalcEngine {
    private double num1;
    private double num2;
    private int operaterNum;

    public CalcEngine(double providedNum1, double providedNum2, int providedOperator){
        this.num1 = providedNum1;
        this.num2 = providedNum2;
        this.operaterNum = providedOperator;
    }

    public double calculateTotal(){
        double result = 0;
        switch (operaterNum){
            case 1 -> result = num1 + num2;
            case 2 -> result = num1 - num2;
            case 3 -> result = num1 * num2;
            case 4 -> result = num1 / num2;
        }

        return result;
    }




}
