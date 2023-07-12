package baseball;

public class ValidationUtils {
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;
   //숫자 하드코딩 하지말고, const 사용합시다

    public static boolean validNo(int no) {
        return no>= MIN_NO && no<= MAX_NO;
    }
}
