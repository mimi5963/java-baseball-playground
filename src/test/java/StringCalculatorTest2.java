import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest2 {


    @DisplayName("문자열 계산기 테스트")
    @Test
    void calculating() {
        StringCalculator scc = new StringCalculator();
        assertEquals( scc.Calculating(),10);

    }
}