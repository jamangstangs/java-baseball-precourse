package baseball;

public class Game {
    Calculation calculator = new Calculation();
    Printer printer = new Printer();

    boolean smallGame(String three_digit, String answer){
        int strike;
        int ball;

        strike = calculator.strikeCalculation(three_digit, answer);
        ball = calculator.ballCalculation(three_digit, answer);

        printer.printResult(strike, ball);

        if(strike == 3) return false;
        return true;
    }


}
