package study;

import com.beust.jcommander.Parameter;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }
    @DisplayName("중복제거된 사이즈확인")
    @Test
    void sizeTest(){
     assertThat(numbers.size()).isEqualTo(3);
    }

    @DisplayName("set Contain test")
    @Test
    void ContainTest(){
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();

    }

    @DisplayName("set Parameterized Tests")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void PramTest(int number){
        assertThat(numbers.contains(number)).isTrue();
        }

    @DisplayName("set Parameterized Tests with CsvSource")
    @ParameterizedTest
    @CsvSource(value = {"1,true","2,true","3,true","4,false","5,false"})
    void CsvSourceTest(String input, String expected){
        int inputNumber = Integer.parseInt(input);
        boolean expecte = Boolean.parseBoolean(expected);
        assertThat(numbers.contains(inputNumber)).isEqualTo(expecte);
    }

    @DisplayName("set Parameterized Test with CsvFiles")
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/study/data.csv", numLinesToSkip = 1)
    void CsvFilesTest(String input, String expected){
        int inputNumber = Integer.parseInt(input);
        boolean expecte = Boolean.parseBoolean(expected);
        assertThat(numbers.contains(inputNumber)).isEqualTo(expecte);

    }
}
