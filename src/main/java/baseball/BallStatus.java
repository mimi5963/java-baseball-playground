package baseball;

public enum BallStatus {
    BALL, STRIKE, NOTHING;

    //생성된 BallStatus 참조변수에 BALL,STRIKE,NOTHING이 담김 (미리 선언된 인스턴스)
    // 참조변수에는 한가지에 인스턴스만 담길 수 있음으로, 참조변수별 검사 가능
    public boolean isNothing() {
        return this != NOTHING;
    }

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}
