package calculator;

/**
 * Calculator Singleton Class
 *
 * @author Rey-Bethbeder Joan
 * @version 1.0 - 30 September 2021
 */
public class Calculator {

    // The singleton instance
    private static Calculator calculatorInstance = null;

    private Calculator() {
    }

    // Get Singleton instance
    public static Calculator getInstance() {
        if (calculatorInstance == null) {
            calculatorInstance = new Calculator();
        }
        return calculatorInstance;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }


    public double divide(double a, double b) {
        // Check if the user is not trying to divide by zero
        if (b != 0)
        {
            return a / b;
        }

        return -1;
    }
}
