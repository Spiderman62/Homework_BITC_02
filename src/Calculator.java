public class Calculator {
    private String Arithmetic;

    public void setArithmetic(String Arithmetic) {
        if (Arithmetic.equals("+") || Arithmetic.equals("-") || Arithmetic.equals("*") || Arithmetic.equals("/")) {
            this.Arithmetic = Arithmetic;
        } else {
            this.Arithmetic = null;

        }
    }

    public String getArithmetic() {
        return this.Arithmetic;
    }

    public void calculatorInteger(int firstNum, int secondNum) {
        int result;
        switch (this.Arithmetic) {
            case "+":
                result = firstNum + secondNum;
                System.out.println("Result is: " + result);
                break;
            case "-":
                result = firstNum - secondNum;
                System.out.println("Result is: " + result);
                break;
            case "*":
                result = firstNum * secondNum;
                System.out.println("Result is: " + result);
                break;
            case "/":
                result = firstNum / secondNum;
                System.out.println("Result is: " + result);
                break;
            default:
                System.out.print("Invalid!!!");
        }
    }
}
