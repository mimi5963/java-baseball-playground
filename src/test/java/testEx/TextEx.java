package testEx;

import org.junit.After;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TextEx {

    @BeforeEach
    public void testBeforeEach(){

    }
    @AfterEach
    public void testAfterEach(){

    }
   @Order(1)
    @Test
    public void testAnnotation(){
        assertEquals("test","test");
    }

    @Order(2)
    @DisplayName("출력되는 테스트명 입니다.")
    @Test
    public void testAnnotation2(){
        assertEquals("test","test");
    }


}
