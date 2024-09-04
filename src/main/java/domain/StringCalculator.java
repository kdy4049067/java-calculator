package domain;

public class StringCalculator {
    public int StringCal(String str){
        String reg =  " ";
        if(str.contains("\n")){
            int index = str.indexOf("\n");
            reg = str.substring(2, index);
            str = str.substring(index+1);
        }
        reg = ";|:";
        String[] strArr = str.split(reg);
        int [] intArr = new int[strArr.length];

        for(int i = 0; i < strArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int result = 0;
        for(int i = 0; i < intArr.length; i++){
            result += intArr[i];
        }

        return result;
    }
}
