package com.trycatch.java.algorithm.strategy;

public class OperationContext {

    private Strategy strategy;
    public OperationContext(String str){
        switch (str){
            case "+":
                strategy = new OperationAdd();
                break;
            case "-":
                strategy = new OperationSubstract();
                break;
            case "*":
                strategy = new OperationMultiply();
                break;
            default:

        }
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}
