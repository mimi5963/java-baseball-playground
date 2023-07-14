package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputConverter {

    public static List<Integer> convert(String s) {
        if(!Validation.isThreeinput(s)){
            throw new IllegalArgumentException("3자리 숫자만 입력하세요");
        }
        List<Integer> temp = new ArrayList<>();
        for(char ch : s.toCharArray()){
            int tempInt = Integer.parseInt(ch+"");
            Validation.check(tempInt);
            temp.add(tempInt);
        }
        return temp;
    }

    public static List<Integer> getRandomNum() {
        Set<Integer> temp = new HashSet<>();
        do{
            int tempnum = ((int)(Math.random()*8))+1;
            temp.add(tempnum);

        }while(temp.size() != 3);

        return new ArrayList<>(temp);
    }
}
