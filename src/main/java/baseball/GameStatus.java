package baseball;

public class GameStatus {
    private int strike;
    private int ball;

    public int getStrike() {
        return this.strike;
    }

    public int getBall() {
        return this.ball;
    }

    public void report(BallStatus status) {
        if(status.isStrike())
            this.strike++;
        if(status.isBall())
            this.ball++;
    }
    public boolean nothing(){
        return this.getBall() ==0 && getStrike()==0;
    }

    public boolean ballandstrike(){
        return getBall()>0 && getStrike() >0;
    }

    public boolean balls(){
        return getStrike() ==0 && getBall()>0;
    }
    public boolean strikes(){
        return getBall() ==0 && getStrike()>0;
    }
    public boolean gameEnd() {
        return this.getStrike() == 3;
    }
}
