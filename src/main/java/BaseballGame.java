import java.util.Scanner;

public class BaseballGame {
    private final String RANDOM_NUMBER;


      BaseballGame(){
        String random="";
        for(int i=0; i<3;i++) {
           random += ((int) (Math.random() * 8) + 1)+"";
        }
        RANDOM_NUMBER = random;

    }

    private String userInputcheck(String userInput) {
          String modifiedInput=userInput;
          Scanner sc = new Scanner(System.in);
          while(modifiedInput.length() != 3 || duplicated(modifiedInput)){
              System.out.println("다시 입력해 주세요");
              modifiedInput = sc.nextLine();
          }

          return modifiedInput;
    }

    public boolean duplicated(String modifiedInput) {
          int idx=Integer.MIN_VALUE;
          for(int i=0; i<modifiedInput.length()-1;i++){
              char temp = modifiedInput.charAt(i);
              idx = modifiedInput.substring(i+1).indexOf(temp);
          }
          if(idx != -1){
              return true;
          }
          return false;
    }


    public String getRandomNumber() {
        return RANDOM_NUMBER;
    }


    public int[] checkBallAndStrike(String userInput) {
          int[] ballAndStrikeCounter = new int[2];
          int idx;
          boolean isstrike=false;
          //숫자만 같으면 볼
          //숫자와 위치가 같으면 스트라이크

          for(int i=0; i<RANDOM_NUMBER.length();i++){
              idx = findNumber(userInput.charAt(i));
              isstrike = isStrike(idx,i);
              setBallAndStrike(idx,isstrike,ballAndStrikeCounter);
          }

        return ballAndStrikeCounter;
    }

    private int findNumber(char userInputChar){
          return RANDOM_NUMBER.indexOf(userInputChar);
    }
    private boolean isStrike(int findNumberidx, int i){
          if(findNumberidx == i)
              return true;

          return false;
    }
    private void setBallAndStrike(int findNumberidx,boolean isStrike,int[] ballAndStrikeCounter){
          if(isStrike) {
              ballAndStrikeCounter[0]++;
              return;
          }
          if(findNumberidx != -1)
              ballAndStrikeCounter[1]++;

    }

    public String getuserInput() {
          String userInput="";
          Scanner sc = new Scanner(System.in);
          userInput = sc.nextLine();
          userInput = userInputcheck(userInput);

          return userInput;
    }
}
