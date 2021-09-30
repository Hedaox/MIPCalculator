import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * Class used for testing Calculator
 *
 * @version 1.0 - 30 September 2021
 * @author Rey-Bethbeder Joan
 */
public class CalculatorTest {

    Calculator calculator;

    // Executed before each test
    @BeforeEach
    void setUp() {
        calculator = Calculator.getInstance();
    }

    @Test
    @DisplayName("Simple sum should work")
    void testSum() {
        assert calculator.sum(3,3) == 6 : "Simple sum not working";
    }

    @Test
    @DisplayName("Simple subtraction should work")
    void testSubtraction() {
        assert calculator.subtract(3,3) == 0 : "Simple subtraction not working";
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        assert calculator.multiply(3,3) == 9 : "Simple multiplication not working";
    }

    @Test
    @DisplayName("Simple division should work")
    void testDivide() {
        assert calculator.divide(10,2) == 5 : "Simple division not working";
    }

    @Test
    @DisplayName("Multiplication, Correct Handling of Zero")
    void testMultiplyWithZero() {
        assert calculator.multiply(0,3) == 0 : "Zero multiplication not working properly";
        assert calculator.multiply(3,0) == 0 : "Zero multiplication not working properly";
    }

    @Test
    @DisplayName("Division, Correct Handling of Zero")
    void testDivideWithZero() {
        assert calculator.divide(5,0) == -1 : "Zero division not working properly";
    }

}