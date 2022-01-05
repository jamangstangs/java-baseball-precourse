package baseball;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Calculation {

    public int strikeCalculation(String three_digit, String answer) {
        int strike_num = 0;
        for(int i=0; i<3; i++) {
            strike_num += digitCompare(three_digit.charAt(i), answer.charAt(i));
        }
        return strike_num;
    }


    public int ballCalculation(String three_digit, String answer) {
        int ball_num = 0;
        for(int i=0; i<3; i++){
            ball_num += ballDigitCompare(three_digit, answer, i);
        }
        return ball_num;
    }

    public String makeAnswer() {
        String ans;
        do{
            ans = Integer.toString(pickNumberInRange(102,987));
        }while(duplicateCheck(ans)!=0);
        System.out.println(ans);
        return ans;
    }

    private int duplicateCheck(String ans) {
        return ballCalculation(ans,ans);
    }

    private int digitCompare(char i, char j) {
        if(i == j) return 1;
        return 0;
    }

    private int ballDigitCompare(String three_digit, String answer, int i) {
        int ball =0;
        for(int j=0; j<3; j++){
            if(i==j) continue;
            ball += digitCompare(three_digit.charAt(i), answer.charAt(j));
        }
        return ball;
    }

//    static int strikeCalculation(String guess, String ans, int length_of_number){
//        int strike_num = 0;
//        for(int i = 0; i<length_of_number; i++){
//            strike_num = digitCompareForStrike(strike_num,i,guess, ans,length_of_number);
//        }
//        return strike_num;
//    }
//
//    static int ballCalculation(String guess, String ans, int length_of_number){
//        int ball_num = 0;
//        for(int i=0; i<length_of_number; i++){
//            ball_num = digitCompareForBall(ball_num,i,guess,ans,length_of_number);
//        }
//        return ball_num;
//    }
//
//    static int digitCompareForStrike(int strike_num, int i, String guess, String ans, int length_of_number){
//        if(guess.charAt(i) == ans.charAt(i)) strike_num +=1;
//        return strike_num;
//    }
//    static int digitCompareForBall(int ball_num, int i, String guess, String ans, int  length_of_number){
//        for(int j=0; j<=length_of_number; j++){
//            if(i ==)
//        }
//    }
}
