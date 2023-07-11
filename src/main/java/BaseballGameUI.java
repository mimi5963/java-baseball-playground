import java.util.Scanner;

public class BaseballGameUI {
    private BaseballGame baseballGame;


   private void setNewGame(){
        baseballGame = new BaseballGame();
    }
    public void gameStart(){
        boolean continueGame =true;
        while(continueGame) {
            setNewGame();
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
            userInput = sc.nextLine();
            threeStrike =baseballGame.checkUserInput(userInput);
        }
    }


}
