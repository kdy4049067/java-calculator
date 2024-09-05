package controller;

import domain.StringCalculator;
import view.InputView;
import view.OutputView;

import java.util.List;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController(InputView inputView, OutputView outputView){
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void startCalculator(){
        final StringCalculator StringCal = new StringCalculator(inputView.getString());
        List<String> StringList = StringCal.StringList();
        List<Integer> IntegerList = StringCal.StringToNum(StringList);
        int result = StringCal.addNum(IntegerList);
        outputView.print(result);
    }
}
