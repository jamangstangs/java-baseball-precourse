package baseball;

public class OutputView {
    public static void printResult(int ball, int strike) {
        if(strike + ball == 0) {
            System.out.println("낫싱");
        }
        if(ball!=0) System.out.printf("%d볼",ball);
        if(strike!=0) System.out.printf("%d스트라이크",strike);
        System.out.println();
        if(strike==3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료.");
        }
    }
}
