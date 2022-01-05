package baseball;

public class Dealer {
    boolean startGame(User user, Game game){
        boolean small_game_continue;
        Calculation calculator = new Calculation();
        String answer = calculator.makeAnswer();

        do{
            small_game_continue = game.smallGame(user.enterThreeDigitNumber(), answer);
        }while(small_game_continue == true);
        // 여기까지 오면 3스트라이크 맞춘 경우
        return user.whetherRegameOrQuit();
    }
}
