package baseball;

import java.util.Objects;

public class Ball {
    private final int  number;
    private final int posiotion;
    public Ball(int Number, int Position) {
        Validation.check(Number);
        this.number = Number;
        this.posiotion= Position;
    }

    public BallStatus matchBall(Ball other) {
        if(equals(other))
            return BallStatus.STRIKE;
        if(isBall(other))
            return BallStatus.BALL;

            return BallStatus.NOTHING;
    }

    private boolean isBall(Ball other) {
        return number == other.number;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass())return false;
        Ball bo = (Ball)o;
        return number == bo.number && posiotion == bo.posiotion;

    }
    @Override
    public int hashCode(){
        return Objects.hash(number,posiotion);
    }
}
