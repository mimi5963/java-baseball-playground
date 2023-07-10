package study;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @DisplayName("출력되는 테스트명 입니다.")
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    @DisplayName("split Test")
    @Test
    void splitTest(){
      String[] input = "1,2".split(",");
      assertThat(input).contains("1","2");


    }

    @Test
    void splitTest2(){
        String[] input ="1".split(",");
        assertThat(input.length).isEqualTo(1);
        assertThat(input).containsExactly("1");
    }

    @Test
    void subStringTest3(){
        String input = "(1,2)";
        assertThat(input.substring(1,input.length()-1)).isEqualTo("1,2");

    }
    @DisplayName("charAt메소드 테스트, 위치 값 벗어나면, Exception 발생하는지 Test")
    @Test
    void CharAttest(){
        String input ="abc";

        for(int i=0; i<input.length();i++){
            assertThat(input.charAt(i)).isEqualTo("abc".charAt(i));

        }
        assertThatThrownBy( () -> {
            input.charAt(4);
        } ).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
