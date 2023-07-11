import org.junit.jupiter.api.*;
import org.testng.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {

    private  BaseballGame newgame;



    @BeforeEach
    void setUp(){
        newgame = new BaseballGame();

    }

    @Test
    void testNumberOf(){
        String num = newgame.getRandomNumber();
        Assert.assertEquals(num.length(),3);
    }

    @AfterEach
    void tearDown(){
        newgame =null;
    }

}