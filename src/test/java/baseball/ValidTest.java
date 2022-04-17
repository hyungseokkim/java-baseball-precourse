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
        assertThat(ValidationUtils.validNoRange(ballGenerator.computerBall().get(0))).isTrue();
        assertThat(ValidationUtils.validNoRange(ballGenerator.computerBall().get(1))).isTrue();
        assertThat(ValidationUtils.validNoRange(ballGenerator.computerBall().get(2))).isTrue();
        assertThat(ValidationUtils.validNoRange(10)).isFalse();
    }
    @Test
    void 숫자검증_3자리() {
        assertThat(ValidationUtils.validListSize(new ArrayList<>(ballGenerator.computerBall()))).isTrue();
        assertThat(ValidationUtils.validListSize(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))).isFalse();
        assertThat(ValidationUtils.validListSize(new ArrayList<>(Arrays.asList(1, 2)))).isFalse();
    }
    @Test
    void logicOfRule(){
        assertThat(GameRule.logicOfRule(new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(1, 2, 3)))).isEqualTo("3스트라이크");
    }
    @Test
    void userBallTest(){
        assertThat(ballGenerator.userBall("234")).isEqualTo(new ArrayList<>(Arrays.asList(2, 3, 4)));
    }
}
