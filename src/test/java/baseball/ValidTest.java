package baseball;

import baseball.domain.BallGenerator;
import baseball.domain.GameRule;
import baseball.utils.ValidationUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidTest {
    BallGenerator ballGenerator = new BallGenerator();
    @Test
    void 숫자검증_1_9() {
        assertThat(ValidationUtils.validNo(ballGenerator.makeRandomNumbers().get(0))).isTrue();
        assertThat(ValidationUtils.validNo(ballGenerator.makeRandomNumbers().get(1))).isTrue();
        assertThat(ValidationUtils.validNo(ballGenerator.makeRandomNumbers().get(2))).isTrue();
        assertThat(ValidationUtils.validNo(10)).isFalse();
    }
    @Test
    void 숫자검증_3자리() {
        assertThat(ValidationUtils.validListSize(new ArrayList<>(ballGenerator.makeRandomNumbers()))).isTrue();
        assertThat(ValidationUtils.validListSize(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))).isFalse();
        assertThat(ValidationUtils.validListSize(new ArrayList<>(Arrays.asList(1, 2)))).isFalse();
    }
    @Test
    void logicOfRule(){
        assertThat(GameRule.logicOfRule(new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(1, 2, 3)))).isEqualTo("3스트라이크");
    }
}
