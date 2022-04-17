package baseball.domain;

import baseball.utils.ValidationUtils;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class BallGenerator {
    public static final String INVALID_INPUT_LENGTH = "숫자는 3자리만 입력가능합니다.";

    public List<Integer> makeRandomNumbers(){
        List<Integer> numberList = new ArrayList<>();
        while(numberList.size() < 3){
            int number = Randoms.pickNumberInRange(1, 9);
            if(numberList.contains(number)){
                continue;
            }
            numberList.add(number);
        }
        return numberList;
    }
}
