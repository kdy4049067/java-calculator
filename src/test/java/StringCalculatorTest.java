import domain.StringCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    @DisplayName("문자열 계산기 테스트")
    void assertStringCal(){
        final StringCalculator strCal = new StringCalculator();
        String str = "1;2:3;4";

        final int expected = 10;
        final int result = strCal.StringCal(str);

        assertEquals(result, expected);
    }

    @Test
    @DisplayName("문자열 계산기 두번째 테스트")
    void asserStringCal2(){
        final StringCalculator strCal = new StringCalculator();
        String str = "//;\n1;2;3;5";

        final int expected = 11;
        final int result = strCal.StringCal(str);

        assertEquals(result, expected);
    }
}
