import java.util.Scanner;

public class Main {
    public void checkLeapYear() {
        CheckLeapYear checkLeapYear = new CheckLeapYear();
        Scanner keydownYear = new Scanner(System.in);
        int year;
        System.out.print("Enter year to check: ");
        if (keydownYear.hasNextInt()) {
            year = keydownYear.nextInt();
            checkLeapYear.checkLeapYear(year);
        } else {
            System.out.println("Must be a number!!!");
        }
    }

    public void calculator() {
        Scanner keydownCalculator = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter an arithmetic operator (+, -, *, /): ");
        String arithmetic = keydownCalculator.nextLine();

        calculator.setArithmetic(arithmetic);
        String currentArithmetic = calculator.getArithmetic();

        if (currentArithmetic != null) {
            System.out.print("Enter the first number: ");
            int firstNum = keydownCalculator.nextInt();
            System.out.print("Enter the second number: ");
            int secondNum = keydownCalculator.nextInt();
            calculator.calculatorInteger(firstNum,secondNum);
        } else {
            System.out.println("Invalid arithmetic operator entered.");
        }
    }
    public void findMaxInteger() {
        FindMaxInteger findMaxInteger = new FindMaxInteger();
        Scanner keydownMax = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        if (keydownMax.hasNextInt()) {
            int isMax = keydownMax.nextInt();
            int[] numbers = new int[isMax];
            for(int i = 0;i < isMax;i++){
                System.out.printf("Enter element number %d: ",i + 1);
                numbers[i] = keydownMax.nextInt();
            }
            int max = findMaxInteger.returnMaxInt(numbers);
            System.out.println("Max integer is: "+ max);
        } else {
            System.out.println("Must be a number!!!");
        }
    }
    public void CalculatorQuadratic() {
        CalculatorQuadratic calculatorQuadratic = new CalculatorQuadratic();
        Scanner keydownQuadratic = new Scanner(System.in);
        double a,b,c;

            System.out.print("Enter the first number: ");
            a = keydownQuadratic.nextInt();
            System.out.print("Enter the second number: ");
            b = keydownQuadratic.nextInt();
            System.out.print("Enter the third number: ");
            c = keydownQuadratic.nextInt();
            calculatorQuadratic.setCalculatorQuadratic(a,b,c);
            calculatorQuadratic.actionCalculatorQuadratic();

    }

    public static void main(String[] args) {
        Main main = new Main();
        int type;
        Scanner system = new Scanner(System.in);
        System.out.println("1: Check leap year");
        System.out.println("2: Calculator app");
        System.out.println("3: Find max integer");
        System.out.println("4: Calculator quadratic");
        System.out.print("Please enter the number above to perform programmer: ");
        if (system.hasNextInt()) {
            type = system.nextInt();
            switch (type) {
                case 1:
                    main.checkLeapYear();
                    break;
                case 2:
                    main.calculator();
                    break;
                case 3:
                    main.findMaxInteger();
                    break;
                case 4:
                    main.CalculatorQuadratic();
                    break;
                default:
                    System.out.println("Maintenance");
            }
        } else {
            System.out.println("Must be a number!!!");
        }
    }
}