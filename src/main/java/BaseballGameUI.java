import java.util.Scanner;

public class BaseballGameUI {
    private BaseballGame newGame;

    BaseballGameUI(BaseballGame newGame){
        this.newGame = newGame;
    }
    //입력만 받기
    public void GameStart(){
        Scanner sc = new Scanner(System.in);
        String input ="";
        while(true) {
            System.out.print("숫자를 입력해 주세요:");
            input = sc.nextLine();
        }
    }
}
