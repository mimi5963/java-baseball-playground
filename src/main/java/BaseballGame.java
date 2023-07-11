public class BaseballGame {
    private final String RANDOM_NUMBER;
    private int[] counter;
      BaseballGame(){
        String random="";
        for(int i=0; i<3;i++) {
           random += ((int) (Math.random() * 8) + 1)+"";
        }
        RANDOM_NUMBER = random;
        counter = new int[2];
    }

    public String getRandomNumber() {
        return RANDOM_NUMBER;
    }


    public boolean checkUserInput(String userInput) {
          //숫자만 같으면 볼
          //숫자와 위치가 같으면 스트라이크

      //  for

        return false;
    }

    private int findNumber(char userInputChar){
          return RANDOM_NUMBER.indexOf(userInputChar);
    }
    private boolean isStrike(int findNumberidx, int i){
          if(findNumberidx == i)
              return true;

          return false;
    }
    private void setBallAndStrike(int findNumberidx,boolean isStrike){
          if(isStrike)
              counter[0]++;
          else if(findNumberidx != -1)
              counter[1]++;
    }

}
