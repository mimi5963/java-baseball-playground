public class BaseballGame {
    private final String RANDOM_NUMBER;

      BaseballGame(){
        String random="";
        for(int i=0; i<3;i++) {
           random += ((int) (Math.random() * 8) + 1)+"";
        }
        RANDOM_NUMBER = random;
    }

    public String getRandomNumber() {
        return RANDOM_NUMBER;
    }


}
