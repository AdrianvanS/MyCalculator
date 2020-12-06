package com;

public class Calculator {

    private double val;
    private double tempVal;
    private char sign;
    private Screen screen;
    private double result;

    Calculator(Screen screen){
        this.screen = screen;
    }

    public double getResult(){
        return result;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public void setTempVal(double tempVal) {
        this.tempVal = tempVal;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void getCalculate(){
        calculate();
    }

    private void calculate(){
        setVal(screen.getVal());
        setTempVal(screen.getTempVal());
        setSign(screen.getSign());

        switch (this.sign){
            case'+':
                result = val + tempVal;
                break;
            case '-':
                result = tempVal - val;
                break;
            case 'X':
                result = val * tempVal;
                break;
            case '/':
                result = tempVal / val;
                break;
        }
    }
}
