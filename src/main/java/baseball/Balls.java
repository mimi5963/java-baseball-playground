package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Integer> numbers) {
        Validation.isduplicateNumbers(numbers);
        this.balls = numbersToBalls(numbers);
    }

    private List<Ball> numbersToBalls(List<Integer> numbers) {
        List<Ball> temp = new ArrayList<>();
        for(int i=0; i<numbers.size();i++){
            temp.add(new Ball(numbers.get(i),i+1));
        }
        return temp;
    }

    private BallStatus palywhitBall(Ball other) {
        //들어온 볼 1개당 모든 볼과 비교
        List<BallStatus> result =new ArrayList<>();
        for(Ball b : balls){
            result.add(b.matchBall(other));
        }
        if(result.contains(BallStatus.STRIKE))
            return BallStatus.STRIKE;
        if(result.contains(BallStatus.BALL))
            return BallStatus.BALL;

        return BallStatus.NOTHING;
    }

    public GameStatus playwithBalls(Balls other) {
        GameStatus result  = new GameStatus();
        for(Ball b : balls){
            result.report(other.palywhitBall(b));
        }
        return result;
    }
}
