import domain.StringCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    @DisplayName("문자열 계산기 테스트")
    public void asserStringCalculator(){
        final StringCalculator stringCal = new StringCalculator("1:2;3:4");
        final List<String> strArr = stringCal.StringList();
        final List<Integer> numList = stringCal.StringToNum(strArr);
        final int result = stringCal.addNum(numList);
        final int expected = 10;

        assertEquals(result, expected);
    }
}
