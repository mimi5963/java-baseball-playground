import java.util.Scanner;

public class BaseballGameUI {
    private BaseballGame baseballGame;


   private void setNewGame(){
        baseballGame = new BaseballGame();
    }
    public void newGameStart(){
        boolean continueGame =true;

        while(continueGame) {
            setNewGame();
            System.out.println(baseballGame.getRandomNumber());
            palyGame();
            continueGame = continueOrNot();
        }
        System.out.println("Bye~");
    }

    private boolean continueOrNot() {
        Scanner sc = new Scanner(System.in);
        boolean continueornotvalue =false;
        System.out.println("3개의 숫자를 모두 맞히셨습니다.! 게임종료");
        System.out.println("게임을 새로 시작하려면1, 종료하려면 2를 입력하세요");
        if(sc.nextLine().equals("1"))
            continueornotvalue=true;
        return continueornotvalue;
    }

    private void palyGame() {
       boolean threeStrike = false;
       String userInput="";
       Scanner sc = new Scanner(System.in);
        while(!threeStrike){
            System.out.print("숫자를 입력해 주세요 :");
            userInput = baseballGame.getuserInput();
                    //sc.nextLine();
            //BaseballGame.userInputcheck(userInput);
            threeStrike =isThreeStrike(baseballGame.checkBallAndStrike(userInput));
        }
    }



    private boolean isThreeStrike(int[] ballAndStrike) {
       if(ballAndStrike[0] == 3) {
           System.out.println("3 strike");
           return true;
       }

       printBallAndStrike(ballAndStrike);

           return false;
    }

    private void printBallAndStrike(int[] ballAndStrike) {
       if(ballAndStrike[0] >0 && ballAndStrike[1]==0)
       {
           System.out.println(ballAndStrike[0]+"스트라이크");
           return;
       }
       if(ballAndStrike[0] == 0 && ballAndStrike[1] >0){
           System.out.println(ballAndStrike[1]+"볼");
           return;
       }
       if(ballAndStrike[0]==0 && ballAndStrike[1] ==0){
           System.out.println("nothing");
           return;
       }

       System.out.println(ballAndStrike[1]+"볼 "+ballAndStrike[1]+"스트라이크");

    }


}
