package baseball;

public class Printer {
    public void printResult(int strike, int ball) {
        if(ball == 0 && strike == 0){
            System.out.printf("낫싱");
        }
        if(ball!=0){
            System.out.printf("%d볼 ", ball);
        }
        if(strike!=0){
            System.out.printf("%d스트라이크 ", strike);
        }
        System.out.println();
        if(strike == 3){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        }
    }

    public void printInputSpace() {
        System.out.print("숫자를 입력해주세요 : ");
    }
}
