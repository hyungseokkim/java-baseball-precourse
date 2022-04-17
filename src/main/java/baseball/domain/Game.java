package baseball.domain;

import baseball.view.GameView;
import baseball.domain.GameRule;
import java.util.List;

public class Game {
    public static final String MESSAGE_SUCCESS = "3개의 숫자를 모두 맞추셨습니다! 게임 종료";
    BallGenerator ball = new BallGenerator();
    List<Integer> computerBall;

    public Game(){
        BallGenerator ball = new BallGenerator();
        computerBall = ball.computerBall();
    }
    public void runGame(){
        List<Integer> userBall = ball.userBall(GameView.inputUserBall());
        GameRule gameRule = new GameRule();
        String gameResult = gameRule.logicOfRule(computerBall,userBall);
        GameView.outputMessage(gameResult);
        if(gameResult.equals("3"+GameRule.RESULT_STRIKE)){
            gameResult = MESSAGE_SUCCESS;
            GameView.outputMessage(gameResult);
            return;
        }
        runGame();
    }
}
