package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
public class BallsTest {
    @Test
    void ThreeNothingTest(){
        Balls com = new Balls(Arrays.asList(1,2,3));
        Balls user = new Balls(Arrays.asList(4,5,6));
        GameStatus gs = com.playwithBalls(user);
        assertThat(gs.getStrike()).isEqualTo(0);
        assertThat(gs.getBall()).isEqualTo(0);

    }

    @Test
    void  스트라이크1_볼1_Test(){
        Balls com = new Balls(Arrays.asList(1,2,3));
        Balls user = new Balls(Arrays.asList(1,3,4));
        GameStatus gs = com.playwithBalls(user);
        assertThat(gs.getStrike()).isEqualTo(1);
        assertThat(gs.getBall()).isEqualTo(1);

    }

    @Test
    void  스트라이크2__Test(){
        Balls com = new Balls(Arrays.asList(1,2,3));
        Balls user = new Balls(Arrays.asList(1,4,3));
        GameStatus gs = com.playwithBalls(user);
        assertThat(gs.getStrike()).isEqualTo(2);
        assertThat(gs.getBall()).isEqualTo(0);
        assertThat(gs.gameEnd()).isFalse();
    }
    @Test
    void  볼2__Test(){
        Balls com = new Balls(Arrays.asList(1,2,3));
        Balls user = new Balls(Arrays.asList(3,1,4));
        GameStatus gs = com.playwithBalls(user);
        assertThat(gs.getStrike()).isEqualTo(0);
        assertThat(gs.getBall()).isEqualTo(2);
        assertThat(gs.gameEnd()).isFalse();

    }
    @Test
    void  스트라이크3__Test(){
        Balls com = new Balls(Arrays.asList(1,2,3));
        Balls user = new Balls(Arrays.asList(1,2,3));
        GameStatus gs = com.playwithBalls(user);
        assertThat(gs.getStrike()).isEqualTo(3);
        assertThat(gs.getBall()).isEqualTo(0);
        assertThat(gs.gameEnd()).isTrue();

    }
//    @Test
//    void nothingTest(){
//        Balls com = new Balls(Arrays.asList(1,2,3));
//        Ball user = new Ball(4,1);
//        assertThat(com.palywhitBall(user)).isEqualTo(BallStatus.NOTHING);
//    }

//    @Test
//    void BallTest(){
//        Balls com = new Balls(Arrays.asList(1,2,3));
//        Ball user = new Ball(1,2);
//        assertThat(com.palywhitBall(user)).isEqualTo(BallStatus.BALL);
//    }

//    @Test
//    void strikeTest(){
//        Balls com = new Balls(Arrays.asList(1,2,3));
//        Ball user = new Ball(1,1);
//        assertThat(com.palywhitBall(user)).isEqualTo(BallStatus.STRIKE);
//    }
}
