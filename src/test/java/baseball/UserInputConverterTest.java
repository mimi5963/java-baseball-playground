package baseball;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;
public class UserInputConverterTest {
    @Test
    void Test(){
        assertThatThrownBy(()->{
            InputConverter.convert("1234");
        }).isInstanceOf(IllegalArgumentException.class);

        assertThat(InputConverter.convert("123")).isInstanceOf(ArrayList.class);
        assertThat(InputConverter.convert(("123"))).contains(1,2,3);

        assertThatThrownBy(()->{
            InputConverter.convert("0r2");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
