package baseball;

public class BallNumber {
    private int no;
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;

    public BallNumber(int no){
        if(no< MIN_NO || no> MAX_NO)
        {
            throw new IllegalArgumentException("볼에 들어갈 수 있는 숫자는 1~9사이");
        }
        this.no = no;
    }

    public int getNumber() {
        return this.no;
    }
}
