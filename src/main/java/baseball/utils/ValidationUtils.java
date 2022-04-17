package baseball.utils;

import java.util.List;

public class ValidationUtils {
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;
    public static final int SIZE = 3;

    public static boolean validNo(int i) {
        return i >= MIN_NO && i<= MAX_NO;
    }
    public static boolean validStringLength(String input){
        return input.trim().length() == SIZE;
    }
    public static boolean validListSize(List<Integer> i) {
        return i.size() == SIZE;
    }
}
