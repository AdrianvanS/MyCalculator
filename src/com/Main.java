package com;

public class Main {

    public static void main(String[] args) {

        Screen screen = new Screen();
        Calculator calculator = new Calculator(screen);
        screen.setCalculator(calculator);
    }

}
