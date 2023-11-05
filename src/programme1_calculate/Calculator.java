package programme1_calculate;

public class Calculator {

    public void getAddition(int a, int b) {
        int result = a + b;
        System.out.println("addition of  " + a + " and " + b + " is : " + result);
    }

    public void getSubtraction(int a, int b) {
        int result = a - b;
        System.out.println("subtraction of " + a + " and " + b + " is : " + result);
    }

    public void getDivision(int a, int b) {
        int result = a / b;
        System.out.println("division of " + a + " and " + b + " is : " + result);
    }

    public void getMultiplication(int a, int b) {
        int result = a * b;
        System.out.println("multiplication of " + a + " and " + b + " is : " + result);
    }

    public void getCalculationResult(int a, int b, char symbol) {

        if (symbol == '+') {
            getAddition(a, b);
        } else if (symbol == '-') {
            getSubtraction(a, b);
        } else if (symbol == '/') {
            getDivision(a, b);
        } else if (symbol == '*') {
            getMultiplication(a, b);
        }
    }
}
