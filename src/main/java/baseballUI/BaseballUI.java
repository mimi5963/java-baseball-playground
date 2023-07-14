package baseballUI;

import baseball.Balls;
import baseball.GameStatus;
import baseball.InputConverter;
import baseball.Validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaseballUI {
    private Balls com;
    //private Balls user;
    public void gameStart() {
        boolean isend;
        do{
            gameSetup();
            isend = continueGame();
        }while(!isend);
        System.out.println("BYE~");
    }

    private boolean continueGame() {
        boolean thisGameNotend= true;
        boolean allGameIsend;
        //사용자 입력받고, 검사하고 3스트라이크..
        while(thisGameNotend){
            Balls user = new Balls(getuserInput());
            GameStatus gs =user.playwithBalls(com);
            thisGameNotend = reportGame(gs);
        }
        //3스트라이크면 while문 벗어나고, 물어보기
        allGameIsend = isConintue();
        return allGameIsend;
    }

    private boolean reportGame(GameStatus gs) {
        if(gs.gameEnd()){
            System.out.println("3스트라이크");
            return false;
        }

        if(gs.nothing()){
            System.out.println("nothing");
        }

        if(gs.ballandstrike()){
            System.out.println(gs.getBall()+"볼 "+gs.getStrike() +" 스트라이크");
        }

        if(gs.balls()){
            System.out.println(gs.getBall() +"볼");
        }

        if(gs.strikes()){
            System.out.println(gs.getStrike()+"스트라이크");
        }

        return true;
    }

    private boolean isConintue() {
        System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임을 계속하려면 1," +
                "게임을 종료하려면 2를 입력해 주세요: ");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();

        return result ==2;
    }


    private void gameSetup() {
        List<Integer> randomnum = InputConverter.getRandomNum();
        com = new Balls(randomnum);
        System.out.println(Arrays.toString(randomnum.toArray()));

    }

    private List<Integer> getuserInput() {
        List<Integer> temp = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        boolean isDuplicated;

        do {
            System.out.print("숫자를 중복 없이 입력해 주세요: ");
            String input = sc.nextLine();
            temp = InputConverter.convert(input);
            isDuplicated = isduplicatednumber(temp);
        }while (isDuplicated);
        return temp;
    }

    private boolean isduplicatednumber(List<Integer> temp) {
        if(Validation.isduplicateNumbers2(temp)){
            System.out.println("중복된 숫자입니다. 다시 입력해주세요");
            return true;
        }
        return false;
    }
}
