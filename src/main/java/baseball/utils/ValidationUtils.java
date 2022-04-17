package baseball.utils;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ValidationUtils {
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;
    public static final int SIZE = 3;
    public static final String INVALID_INPUT_LENGTH = "숫자는 3자리만 입력가능합니다.";
    public static final String INVALID_INPUT_TYPE_NUMBER = "숫자만 입력할 수 있습니다.";
    public static final String INVALID_INPUT_RANGE = "1~9사이의 숫자만 입력할 수 있습니다.";
    public static boolean validNoRange(int i) {
        return i >= MIN_NO && i<= MAX_NO;
    }
    public static boolean validStringLength(String input){
        return input.trim().length() == SIZE;
    }
    public static boolean validListSize(List<Integer> i) {
        return i.size() == SIZE;
    }
    public static boolean validHashSetLength(LinkedHashSet<String> hashSet){
        return hashSet.size() == SIZE;
    }
    public static void validNumberType(LinkedHashSet<String> hashSet){
        for(String each : hashSet) {
            try{
                if(!ValidationUtils.validNoRange(Integer.parseInt(each))){
                    throw new IllegalArgumentException(INVALID_INPUT_RANGE);
                }
            }catch(NumberFormatException e){
                throw new IllegalArgumentException(INVALID_INPUT_TYPE_NUMBER);
            }
        }
    }
    public static void validationInputData(String input){
        if(!ValidationUtils.validStringLength(input)){
            throw new IllegalArgumentException(INVALID_INPUT_LENGTH);
        }
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(input.split("")));
        validNumberType(hashSet);
        if(!ValidationUtils.validHashSetLength(hashSet)) {
            throw new IllegalArgumentException(INVALID_INPUT_LENGTH);
        }
    }
}
