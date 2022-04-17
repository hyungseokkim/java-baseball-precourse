package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GameRule {
    public static final String RESULT_STRIKE = "스트라이크";
    public static final String RESULT_BALL = "볼";
    public static final String RESULT_NOTHING = "낫싱";

    public static int countOfStrikeIncluding(List<Integer> computerBall, List<Integer> userBall){
        int result = 0;
        for(int i=0; i<userBall.size(); i++){
            if(userBall.get(i).equals(computerBall.get(i))){
                result ++;
            }
        }
        return result;
    }
    public static int countOfIncluding(List<Integer> computerBall, List<Integer> userBall){
        int result = 0;
        for(int i : computerBall){
            if(computerBall.contains(i)) {
                result++;
            }
        }
        return result;
    }
    public static String logicOfRule(List<Integer> computerBall, List<Integer> userBall){
        int ballCount = countOfIncluding(computerBall, userBall);
        if(ballCount == 0){
            return RESULT_NOTHING;
        }
        String result = "";
        int strikeCount = countOfStrikeIncluding(computerBall, userBall);
        ballCount = ballCount-strikeCount;
        if(ballCount > 0){
            result = result + ballCount + RESULT_BALL + " ";
        }
        if(strikeCount > 0){
            result = result + strikeCount + RESULT_STRIKE + " ";
        }
        return result.trim();
    }
}
