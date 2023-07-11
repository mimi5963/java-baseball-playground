import java.util.Scanner;

public class StringCalculator {
    private static Scanner sc;

    static{
        sc= new Scanner(System.in);
    }
    private String[] userInput(){
        String[] input;
        input= sc.nextLine().split(" ");
        return input;
    }

    public int Calculating(){
        String[] input = this.userInput();
        int temp =Integer.parseInt(input[0]);
        for(int i=1; i<input.length;i++){
            switch (input[i]){
                case "+":
                    temp = temp + Integer.parseInt(input[++i]);
                    break;
                case "-":
                    temp = temp - Integer.parseInt(input[++i]);
                    break;
                case "*":
                    temp = temp * Integer.parseInt(input[++i]);
                    break;
                case "/":
                    temp = temp / Integer.parseInt(input[++i]);
                    break;
            }
        }
        return temp;
    }

}
