package study;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.Stack;

import static org.assertj.core.api.Assertions.*;

public class StringCalculator {
    static String[] input;
    static Scanner sc;
    private static void userInput(String inputValue){
        System.setIn(new ByteArrayInputStream(inputValue.getBytes()));
    }
    @DisplayName("입력받기")
    @ParameterizedTest
    @ValueSource(strings = {"2 + 3 * 4 / 2"})
     void setValues(String inputVal){
        userInput(inputVal);
        sc = new Scanner(System.in);
        input = sc.nextLine().split(" ");
        assertThat(input).isEqualTo(new String[]{"2","+","3","*","4","/","2"});
    }

    @DisplayName("잘 계산되는 지 확인")
    @ParameterizedTest
    @ValueSource(strings = {"2 + 3 * 4 / 2"})
    void calculating(String val){
        String[] input =val.split(" ");
        int temp =Integer.parseInt(input[0]);

        for(int i=1; i<input.length;i++){
            switch (input[i]){
                case "+":
                    temp = temp + Integer.parseInt(input[++i]);
                    break;
                case "-":
                    temp = temp - Integer.parseInt(input[++i]);
                    break;
                case "*":
                    temp = temp * Integer.parseInt(input[++i]);
                    break;
                case "/":
                    temp = temp / Integer.parseInt(input[++i]);
                    break;
            }
        }

        assertThat(temp).isEqualTo(10);

    }





}
