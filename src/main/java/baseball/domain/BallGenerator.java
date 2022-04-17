package baseball.domain;

import baseball.utils.ValidationUtils;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class BallGenerator {
    public List<Integer> computerBall() {
        List<Integer> numberList = new ArrayList<>();
        while (numberList.size() < 3) {
            int number = Randoms.pickNumberInRange(1, 9);
            if (numberList.contains(number)) {
                continue;
            }
            numberList.add(number);
        }
        return numberList;
    }
    public List<Integer> userBall(String input){
        ValidationUtils.validationInputData(input);
        List<Integer> userBall = new ArrayList<>();
        for(String each : input.split("")){
                userBall.add(Integer.valueOf(each));
        }
        return userBall;
    }
}
