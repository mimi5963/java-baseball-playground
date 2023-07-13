package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> answers;

    public Balls(List<Integer> answers) {
        this.answers = Balls.getBalls(answers);
    }

    private static List<Ball> getBalls(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        for(int i=0; i<3;i++){
            balls.add(new Ball(i+1, answers.get(i)));
        }
        return balls;
    }


    public BallStatus play(Ball userBall) {
       return  answers.stream().map(answer-> answer.play(userBall))
                .filter(BallStatus::isNothing)//return된 각 BallsStatus에 대해
                .findFirst()
                .orElse(BallStatus.NOTHING);

       //일단 아 이렇게도 할 수 있구나 정도 알고 넘어가자..
    }
    public PlayResult play(List<Integer> balls){
            Balls userballs = new Balls(balls);
            PlayResult result =new PlayResult();
            for(Ball answer : answers){ //컴퓨터가 가지고 있는 볼이랑
                BallStatus status=userballs.play(answer);//새로만든 user볼 비교
                result.report(status);
            }
            return result;
    }
}
