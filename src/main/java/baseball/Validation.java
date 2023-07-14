package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validation {

    private final static int MIN_NUM =1;
    private final static int MAX_NUM =9;
    private final static int VAILDAT_INPUT_NUM = 3;

    public static void check(int n) {
        if(n<MIN_NUM || n> MAX_NUM)
        {
            throw new IllegalArgumentException("범위의 1~9사이 숫자만 가능");
        }

    }

    public static <T> void isduplicateNumbers(List<T> numbserList) {
        boolean result = true;
        Set<T> testSet = new HashSet<>(numbserList);
        if(testSet.size() != numbserList.size())
        {
            throw new IllegalArgumentException("중복값이 들어왔습니다. 게임을 다시 사작하세요");
        }

    }

    public static boolean isThreeinput(String s) {

        return s.length() == VAILDAT_INPUT_NUM;
    }
}
