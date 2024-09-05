package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner s = new Scanner(System.in);

    public String getString(){
        return s.next();
    }
}
