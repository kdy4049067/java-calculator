package org.example;

import controller.CalculatorController;
import domain.StringCalculator;
import view.InputView;
import view.OutputView;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        CalculatorController Controller = new CalculatorController(inputView, outputView);
        Controller.startCalculator();
    }
}