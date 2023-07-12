import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.testng.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {

    private  BaseballGame newgame;



    @BeforeEach
    void setUp(){
        newgame = new BaseballGame();

    }
    @ParameterizedTest
    @CsvSource({"123,false","222,true","456,false"})
    void duplicatedTest(String input, String result){
        boolean results = Boolean.parseBoolean(result);
        boolean metodresult = newgame.duplicated(input);
       assertEquals(results,metodresult);

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


  @Test
  void resultBallAndStrike(){
       int[] test = ballAndStrikeTest("213","213");
       assertArrayEquals(new int[]{3,0},test);
  }
    @Test
    void isStrikeTest(){
        assertFalse(isStrike(-1,1));
        assertFalse(isStrike(1,2));
        assertTrue(isStrike(1,1));
        assertTrue(isStrike(2,2));
    }
    @Test
    void  intArrayPulsTest(){
        int[] one = new int[] {0,0};
        intArrPuls(one,(int[] i)->{i[0]++; i[1]++;});
        assertArrayEquals(new int[]{1,1}, one);
    }
    @Test
    void SetResultTest(){
        int[] t = new int[]{0,0};
        setResult(0,true,t);

    }

  private int[] ballAndStrikeTest(String computer, String user){
        int idx;
        boolean isStrike=false;
        int[] result = new int[]{0,0};
        for(int i=0;i<computer.length();i++){
             idx = findnumber(computer,user.charAt(i));
            isStrike= isStrike(idx,i);
             setResult(idx,isStrike,result);
        }

        return result;
    }

    private void setResult(int idx, boolean isStrike, int[] result) {
        if(isStrike && idx != -1)
            result[0]++;
        else if(idx != -1)
            result[1]++;


    }

    private boolean isStrike(int ballidx, int i) {
      if(ballidx == i)
          return true;

      return false;
    }


    private int findnumber(String conputerInput, char Userinput){
            return conputerInput.indexOf(Userinput);
    }



    private void intArrPuls(int[] one,Consumer<int[]> o) {
        o.accept(one);
    }




}