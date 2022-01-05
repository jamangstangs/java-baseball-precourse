package baseball;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class User {
    String enterThreeDigitNumber(){
        Calculation calculator = new Calculation();
        Printer printer = new Printer();
        printer.printInputSpace();
        String guess = readLine();
        if(calculator.ballCalculation(guess,guess) !=0){
            throw new IllegalArgumentException();
        }
        if(guess.length()!=3){
            throw new IllegalArgumentException();
        }
        return guess;
    }

    public boolean whetherRegameOrQuit(){
        String regame_or_quit = readLine();
        if(regame_or_quit.length()!=1){
            throw new IllegalArgumentException();
        }
        // 입력한 문자의 아스키 코드가 49 50이 아닌경우
        if(regame_or_quit.charAt(0)>50 && regame_or_quit.charAt(0)<49 ){
            throw new IllegalArgumentException();
        }
        if(regame_or_quit.charAt(0) == 49) return true;
        else return false;

    }
}
