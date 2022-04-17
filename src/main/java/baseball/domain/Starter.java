package baseball.domain;

import baseball.view.GameView;

public class Starter {
    public void run(){
        Game game = new Game();
        game.runGame();
        if(GameView.askRestart().equals("2")){
            System.out.println("게임 종료");
            return;
        }
        run();
    }
}
