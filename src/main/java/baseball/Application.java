package baseball;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        while(repeatGame()){};
    }

    // ------- Test 함수 구현 ------
    static int strikeTest(String ges, String ans){
        int strike_num = 0;
        if(ges.charAt(0)==ans.charAt((0))) strike_num+=1;
        if(ges.charAt(1)==ans.charAt((1))) strike_num+=1;
        if(ges.charAt(2)==ans.charAt((2))) strike_num+=1;
        return strike_num;
    }

    static int ballTest(String ges, String ans){
        int ball_num = 0;
        if(ges.charAt(0)==ans.charAt((1))) ball_num+=1;
        if(ges.charAt(0)==ans.charAt((2))) ball_num+=1;
        if(ges.charAt(1)==ans.charAt((0))) ball_num+=1;
        if(ges.charAt(1)==ans.charAt((2))) ball_num+=1;
        if(ges.charAt(2)==ans.charAt((0))) ball_num+=1;
        if(ges.charAt(2)==ans.charAt((1))) ball_num+=1;
        return ball_num;
    }

    // ------- Test 병합 ------
    static boolean totalTest(String ges, String ans){
        int strike = strikeTest(ges,ans);
        int ball = ballTest(ges,ans);
        if(strike + ball == 0) {
            System.out.println("낫싱");
            return false;
        }
        if(ball!=0) System.out.printf("%d볼",ball);
        if(strike!=0) System.out.printf("%d스트라이크",strike);
        System.out.println();
        if(strike==3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료.");
            return true;
        }
        return false;
    }

    // ------- 게임 시작 함수 ------
    static boolean gameStart(String ans){
        //입력오류 잡아내기
        //String ges = readLine();
        // ges 예외처리필요!
        String ges = getGes();
        return totalTest(ges, ans);
    }

    // ------- 게임 반복 함수 ------
    static boolean repeatGame() {
        String ans = newRandom();
        do {
            System.out.print("숫자를 입력해주세요 : ");
        } while (!gameStart(ans));

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String cont = readLine();
        // cont 입력 예외처리
        checkCont(cont);
        if(cont.charAt(0) == 49) return true;
        return false;
    }


    // ------- 기능 보완 함수 ------
    // 올바르지 않은 랜덤값 배제하는 함수
    static String newRandom(){
        String ans;
        do{
            // 자기 자신을 ballTest하면 ball이 0이여야 임의의 수가 중복된 수가 아니다.
            ans = Integer.toString(pickNumberInRange(102,987));
        }while(ballTest(ans,ans)!=0);
        System.out.println(ans);
        return ans;
    }

    // 입력오류 잡아내기
    // 길이 4 아니거나
    static String getGes(){
        String ges = readLine();
        if(ballTest(ges,ges) !=0){
            throw new IllegalArgumentException();
        }
        if(ges.length()!=3){
            throw new IllegalArgumentException();
        }
        return ges;
    }

    // 입력한 숫자가 1,2가 아닌경우 예외처리
    static void checkCont(String cont){
        // 길이가 1이 아닌 경우
        if(cont.length()!=1){
            throw new IllegalArgumentException();
        }
        // 입력한 문자의 아스키 코드가 49 50이 아닌경우
        if(cont.charAt(0)>50 && cont.charAt(0)<49 ){
            throw new IllegalArgumentException();
        }
    }

}

// 아래로 갈수록 병합
// 각 자리 숫자 반환하는 함수
// 스트라이크 테스트, 볼 테스트 -> 낫싱은 이게 싹다 0일 경우
// 테스트 하나로 모아서 결과 내는 함수, 입력 받는 함수
// 게임 반복해주는 함수.

// 추가 구현: 예외처리, 랜덤 숫자 서로다른 임의의 수

// 랜덤 구현
    // 서로 다른 수가 나올때까지 반복

// 예외처리
    // ges값이 아래와 같은 경우
        // 3자리가 아닌 경우
        // 중복되는 값이 3자리 안에 존재할 경우.
    // 종료 코드가 2가 아닌경우,


