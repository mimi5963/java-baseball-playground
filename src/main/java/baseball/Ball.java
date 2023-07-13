package baseball;

import java.util.*;

public class Ball {
    private final BallNumber ballNo;
    private final int position;
    public Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = new BallNumber(ballNo);
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)){
            return BallStatus.STRIKE;
        }
        if(ball.matchBallNumber(ballNo.getNumber())) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;



    }

    private boolean matchBallNumber(int ballNo) {
        return this.ballNo.getNumber() == ballNo;
        //이런식으로 짜는게 좋대.. 직접접근하지말고
        //객체에 인스턴스 변수 직접 접근보단 해당 객체 (여기선 ball)
        //메시지 보내는 형식 사용하는게 좋다
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return ballNo == ball.ballNo && position == ball.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNo, position);
    }
}
