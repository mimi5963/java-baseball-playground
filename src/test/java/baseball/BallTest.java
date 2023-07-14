package baseball;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
public class BallTest {


    @Test
    void nothingTest(){
        Ball com = new Ball(1,1);
        Ball user = new Ball(9,4);
        assertThat(com.matchBall(user)).isEqualTo(BallStatus.NOTHING);
    }
    @Test
    void BallTest(){
        Ball com = new Ball(1,1);
        Ball user = new Ball(1,4);
        assertThat(com.matchBall(user)).isEqualTo(BallStatus.BALL);
    }

    @Test
    void StrikeTest(){
        Ball com = new Ball(1,1);
        Ball user = new Ball(1,1);
        assertThat(com.matchBall(user)).isEqualTo(BallStatus.STRIKE);
    }
}
