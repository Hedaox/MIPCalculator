import calculator.Calculator;

/**
 * Main class
 *
 * @version 1.0 - 30 September 2021
 * @author Rey-Bethbeder Joan
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.getInstance();

        System.out.println(calculator.multiply(5, 5));
        System.out.println(calculator.sum(5, 5));
        System.out.println(calculator.subtract(5, 5));
        System.out.println(calculator.divide(10, 5));
        System.out.println(calculator.divide(5, 0));
        System.out.println(calculator.divide(5, 3));
    }
}
