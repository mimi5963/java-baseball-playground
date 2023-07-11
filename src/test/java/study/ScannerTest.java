package study;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

public class ScannerTest {

    @Test
    void ScannerTest(){
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        assertThat(val).isEqualTo("adsdsa");
    }
}
