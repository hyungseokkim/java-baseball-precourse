package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class GameView {
    public static String askRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return Console.readLine();
    }
    public static String inputUserBall() {
        System.out.print("숫자를 입력해주세요 : ");
        return Console.readLine();
    }
    public static void outputMessage(String message){
        System.out.println(message);
    }
}
