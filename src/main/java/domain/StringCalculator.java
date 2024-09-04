package domain;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    private final String SPLIT_STRING = "[:|;]";
    private final String inputString;
    private final int FIRST_INDEX = 0;
    private final int SECOND_INDEX = 1;
    private final int THIRD_INDEX = 2;
    private final String CHECK_FIRST_STRING = "/";
    private final String NEW_STRING_FIND = "\n";
    public StringCalculator(final String str){
        this.inputString = str;
    }

    public List<String> StringList(){
        String firstString = inputString.substring(FIRST_INDEX, SECOND_INDEX);
        if(!firstString.equals(CHECK_FIRST_STRING)){
            String[] strArr = inputString.split(SPLIT_STRING);
            return List.of(strArr);
        }
        int search_index = inputString.indexOf(NEW_STRING_FIND);
        String new_sep = inputString.substring(THIRD_INDEX, search_index);
        int new_start_index = search_index + 1;
        String[] strArr = inputString.substring(new_start_index).split(new_sep);

        return List.of(strArr);
    }

    public List<Integer> StringToNum(List<String> stringNum){
        List<Integer> numList = new ArrayList<>();
        for(String str : stringNum){
            numList.add(Integer.parseInt(str));
        }
        checkMinus(numList);
        return numList;
    }

    public void checkMinus(List<Integer> numList){
        for(Integer num : numList){
            if(num < 0)
                throw new RuntimeException();
        }
    }

    public int addNum(List<Integer> numList){
        int sum = FIRST_INDEX;
        for(int num : numList){
            sum += num;
        }
        return sum;
    }

}
