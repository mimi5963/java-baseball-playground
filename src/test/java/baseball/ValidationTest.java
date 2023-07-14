package baseball;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class ValidationTest {
    @Test
    void ValidationTest(){

        assertThatThrownBy(()->{
            Validation.check(0);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() ->{
            Validation.check(10);
        }).isInstanceOf(IllegalArgumentException.class);

//        assertThatThrownBy(()->{
//            Validation.check(1);
//        }).isInstanceOf(IllegalArgumentException.class);

//        assertThatThrownBy(()->{
//            Validation.check(9);
//        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void duplicatedTest(){
//        assertThat(Validation.isduplicateNumbers(Arrays.asList(1,2,3))).isFalse();
//        assertThat(Validation.isduplicateNumbers(Arrays.asList(1,1,2))).isTrue();
//        assertThat(Validation.isduplicateNumbers(Arrays.asList(2,1,2))).isTrue();
//        assertThat(Validation.isduplicateNumbers(Arrays.asList(1,1,1))).isTrue();
    }

    @Test
    void isThreeNumber(){
        assertThat(Validation.isThreeinput("123")).isTrue();
        assertThat(Validation.isThreeinput("23")).isFalse();
        assertThat(Validation.isThreeinput(("1"))).isFalse();
    }
}
