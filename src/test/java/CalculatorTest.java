import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    public static Calculator ca;
    @DisplayName("출력되는 테스트명 입니다.")
    @BeforeAll
     static void  creat(){
        ca = new Calculator();
    }
    @Test
    void add() {
        assertEquals(ca.add(1,2),3);
    }

    @Test
    void subtract() {
        assertEquals(ca.subtract(1,2),-1);
    }

    @Test
    void multiply() {
        assertEquals(ca.multiply(1,2),2);
    }

    @Test
    void divide() {
        assertEquals(ca.divide(1,2),0);
    }
}