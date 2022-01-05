package baseball;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        Dealer dealer = new Dealer();
        User user = new User();
        Game game = new Game();

        boolean anotherGame = false;

        do {
            anotherGame = dealer.startGame(user, game);
        } while (anotherGame == true);
    }
}

//
//// 아래로 갈수록 병합
//// 각 자리 숫자 반환하는 함수
//// 스트라이크 테스트, 볼 테스트 -> 낫싱은 이게 싹다 0일 경우
//// 테스트 하나로 모아서 결과 내는 함수, 입력 받는 함수
//// 게임 반복해주는 함수.
//
//// 추가 구현: 예외처리, 랜덤 숫자 서로다른 임의의 수
//
//// 랜덤 구현
//    // 서로 다른 수가 나올때까지 반복
//
//// 예외처리
//    // ges값이 아래와 같은 경우
//        // 3자리가 아닌 경우
//        // 중복되는 값이 3자리 안에 존재할 경우.
//    // 종료 코드가 2가 아닌경우,


