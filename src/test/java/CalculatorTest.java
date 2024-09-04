import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import domain.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void assertAdd(){
        final Calculator cal = new Calculator();
        final int num1 = 3;
        final int num2 = 4;

        final int expected = 7;

        final int result = cal.add(num1,num2);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void assertSub(){
        final Calculator cal = new Calculator();
        final int num1 = 5;
        final int num2 = 2;

        final int expected = 3;

        final int result = cal.subtract(num1,num2);

        assertEquals(result, expected);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void assertMulti(){
        final Calculator cal = new Calculator();

        final int num1 = 3;
        final int num2 = 7;

        final int expected = 21;

        final int result = cal.multiple(num1, num2);

        assertEquals(result, expected);
    }

    @Test
    @DisplayName("나누기 테스트")
    void asserDivide(){
        final Calculator cal = new Calculator();
        final int num1 = 10;
        final int num2 = 3;

        final int expected = 3;

        final int result = cal.divide(num1,num2);

        assertEquals(result, expected);
    }
}
