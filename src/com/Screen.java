package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Screen extends JFrame implements ActionListener, KeyListener {

    JFrame frame;
    JTextField textField1;
    JLabel labelSign;
    JLabel labelTempVal;
    JButton buttonZero;
    JButton buttonOne;
    JButton buttonTwo;
    JButton buttonThree;
    JButton buttonFour;
    JButton buttonFive;
    JButton buttonSix;
    JButton buttonSeven;
    JButton buttonEight;
    JButton buttonNine;
    JButton buttonPoint;
    JButton buttonEnter;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonMultiply;
    JButton buttonDivide;
    JButton buttonClear;
    JButton buttonBackSpace;
    JPanel panel;
    JPanel panelTop;
    Calculator calculator;


    Screen() {

        //---------Initialize Frame and Labels---------------

        frame = new JFrame("MyCalculator");
        frame.setSize(350, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Path path = FileSystems.getDefault().getPath(".");
        String imagePath = path.normalize().toAbsolutePath() + "\\braces_big.png";
        ImageIcon icon = new ImageIcon(imagePath);
        frame.setIconImage(icon.getImage());

        labelSign = new JLabel("");
        labelSign.setOpaque(true);
        labelSign.setVisible(true);
        labelSign.setFont(new Font("Calibri", Font.BOLD, 20));
        labelSign.setBounds(15, 60, 40, 20);

        labelTempVal = new JLabel("");
        labelTempVal.setOpaque(true);
        labelTempVal.setVisible(true);
        labelTempVal.setHorizontalAlignment(SwingConstants.RIGHT);


        textField1 = new JTextField("");
        textField1.setFont(new Font("Calibri", Font.BOLD, 20));
        textField1.setHorizontalAlignment(SwingConstants.RIGHT);
        textField1.addKeyListener(this);

        panelTop = new JPanel();
        panelTop.setLayout(new GridLayout(2, 1, 1, 1));
        panelTop.setBounds(15, 15, 300, 70);


        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 0, 0));
        panel.setBounds(15, 90, 300, 300);

        //---------Initialize Frame and Labels end---------------

        //---------Initialize Buttons---------------

        buttonZero = new JButton("0");
        buttonZero.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonZero.setFocusable(false);
        buttonZero.addActionListener((e) -> {
            textField1.setText(textField1.getText() + "0");
        });

        buttonOne = new JButton("1");
        buttonOne.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonOne.setFocusable(false);
        buttonOne.addActionListener((e) -> {
            textField1.setText(textField1.getText() + "1");
        });

        buttonTwo = new JButton("2");
        buttonTwo.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonTwo.setFocusable(false);
        buttonTwo.addActionListener((e) -> {
            textField1.setText(textField1.getText() + "2");
        });

        buttonThree = new JButton("3");
        buttonThree.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonThree.setFocusable(false);
        buttonThree.addActionListener((e) -> {
            textField1.setText(textField1.getText() + "3");
        });

        buttonFour = new JButton("4");
        buttonFour.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonFour.setFocusable(false);
        buttonFour.addActionListener((e) -> {
            textField1.setText(textField1.getText() + "4");
        });

        buttonFive = new JButton("5");
        buttonFive.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonFive.setFocusable(false);
        buttonFive.addActionListener((e) -> {
            textField1.setText(textField1.getText() + "5");
        });

        buttonSix = new JButton("6");
        buttonSix.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonSix.setFocusable(false);
        buttonSix.addActionListener((e) -> {
            textField1.setText(textField1.getText() + "6");
        });

        buttonSeven = new JButton("7");
        buttonSeven.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonSeven.setFocusable(false);
        buttonSeven.addActionListener((e) -> {
            textField1.setText(textField1.getText() + "7");
        });

        buttonEight = new JButton("8");
        buttonEight.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonEight.setFocusable(false);
        buttonEight.addActionListener((e) -> {
            textField1.setText(textField1.getText() + "8");
        });

        buttonNine = new JButton("9");
        buttonNine.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonNine.setFocusable(false);
        buttonNine.addActionListener((e) -> {
            textField1.setText(textField1.getText() + "9");
        });

        buttonPoint = new JButton(".");
        buttonPoint.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonPoint.setFocusable(false);
        buttonPoint.addActionListener((e) -> {
            textField1.setText(textField1.getText() + ".");
        });

        buttonEnter = new JButton("=");
        buttonEnter.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonEnter.setFocusable(false);
        buttonEnter.setBackground(new Color(207, 207, 255));
        buttonEnter.addActionListener((e) -> {
            enterButtonPressed();
        });

        buttonPlus = new JButton("+");
        buttonPlus.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonPlus.setFocusable(false);
        buttonPlus.setBackground(new Color(207, 207, 255));
        buttonPlus.addActionListener((e) -> {
            plusButtonPressed();
        });

        buttonMinus = new JButton("-");
        buttonMinus.setFont(new Font("Calibri", Font.BOLD, 30));
        buttonMinus.setFocusable(false);
        buttonMinus.setBackground(new Color(207, 207, 255));
        buttonMinus.addActionListener((e) -> {
            minusButtonPressed();
        });

        buttonMultiply = new JButton("X");
        buttonMultiply.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonMultiply.setFocusable(false);
        buttonMultiply.setBackground(new Color(207, 207, 255));
        buttonMultiply.addActionListener((e) -> {
            multiplyButtonPressed();
        });

        buttonDivide = new JButton("/");
        buttonDivide.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonDivide.setFocusable(false);
        buttonDivide.setBackground(new Color(207, 207, 255));
        buttonDivide.addActionListener((e) -> {
            divideButtonPressed();
        });

        buttonClear = new JButton("C");
        buttonClear.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonClear.setFocusable(false);
        buttonClear.setBackground(new Color(207, 207, 255));
        buttonClear.addActionListener((e) -> {
            clearButtonPressed();
        });

        buttonBackSpace = new JButton("B/S");
        buttonBackSpace.setFont(new Font("Calibri", Font.BOLD, 20));
        buttonBackSpace.setFocusable(false);
        buttonBackSpace.setBackground(new Color(207, 207, 255));
        buttonBackSpace.addActionListener((e) -> {

            backSpaceButtonPressed();


        });

        //Add elements to panel

        panelTop.add(textField1);
        panelTop.add(labelTempVal);

        panel.add(buttonSeven);
        panel.add(buttonEight);
        panel.add(buttonNine);
        panel.add(buttonPlus);

        panel.add(buttonFour);
        panel.add(buttonFive);
        panel.add(buttonSix);
        panel.add(buttonMinus);

        panel.add(buttonOne);
        panel.add(buttonTwo);
        panel.add(buttonThree);
        panel.add(buttonMultiply);

        panel.add(buttonZero);
        panel.add(buttonPoint);
        panel.add(buttonEnter);
        panel.add(buttonDivide);

        panel.add(buttonClear);
        panel.add(buttonBackSpace);


        //---------Initialize Buttons end---------------

        //Add panels to frame

        frame.add(panelTop);
        frame.add(labelSign);
        frame.add(panel);

        //        frame.getContentPane().setBackground(new Color(51, 36, 84));

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    //------------Getters-------------------

    public double getVal() {
        return Double.parseDouble(textField1.getText());
    }

    public double getTempVal() {
        return Double.parseDouble(labelTempVal.getText());
    }

    public char getSign() {
        return labelSign.getText().charAt(0);
    }

    //------------Getters end-------------------

    //---------------Setters---------------------

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }


    //------------Setters end-------------------


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void repaintTopPanel() {
        labelSign.setFont(new Font("Calibri", Font.BOLD, 20));
        labelSign.setBounds(15, 60, 40, 20);
        labelSign.setForeground(Color.black);
        textField1.setFont(new Font("Calibri", Font.BOLD, 20));
        textField1.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSign.setVisible(true);
        frame.add(labelSign);
    }

    private void isWhole(double num) {
        if ((num % 1) == 0) {
            textField1.setText(String.valueOf((int) num));
        } else textField1.setText(String.valueOf(num));

    }

    private void isWholeLabel(double num){
        if ((num % 1) == 0) {
            labelTempVal.setText(String.valueOf((int) num));
        } else labelTempVal.setText(String.valueOf(num));

    }

    private void clearButtonPressed(){
        labelSign.setText("");
        labelTempVal.setText("");
        textField1.setText("");
    }

    private void enterButtonPressed() {
        try {
            calculator.getCalculate();
            double val = calculator.getResult();
            isWhole(val);
            labelTempVal.setText("");
            labelSign.setText("");
        } catch (NumberFormatException f) {
            JOptionPane.showMessageDialog(null, "Invalid values!", "Unable to calculate!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void plusButtonPressed() {
        try {
            labelSign.setText("+");
            repaintTopPanel();
            labelSign.setVisible(true);
            double num = Double.parseDouble(textField1.getText());
            labelTempVal.setText(String.valueOf(num));
            isWholeLabel(num);
            textField1.setText("");
        } catch (NumberFormatException e) {
            labelSign.setText("+");
            textField1.setText("");
            repaintTopPanel();
            labelSign.setVisible(true);
            JOptionPane.showMessageDialog(null, "Invalid value(s)!", "Unable to calculate!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void minusButtonPressed() {
        try {
            labelSign.setText("-");
            repaintTopPanel();
            labelSign.setVisible(true);
            double num = Double.parseDouble(textField1.getText());
            labelTempVal.setText(String.valueOf(num));
            isWholeLabel(num);
            textField1.setText("");
        } catch (NumberFormatException e) {
            labelSign.setText("-");
            textField1.setText("");
            repaintTopPanel();
            labelSign.setVisible(true);
            JOptionPane.showMessageDialog(null, "Invalid value(s)!", "Unable to calculate!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void multiplyButtonPressed() {
        try {
            labelSign.setText("X");
            repaintTopPanel();
            labelSign.setVisible(true);
            double num = Double.parseDouble(textField1.getText());
            labelTempVal.setText(String.valueOf(num));
            isWholeLabel(num);
            textField1.setText("");
        } catch (NumberFormatException e) {
            labelSign.setText("X");
            textField1.setText("");
            repaintTopPanel();
            labelSign.setVisible(true);
            JOptionPane.showMessageDialog(null, "Invalid value(s)!", "Unable to calculate!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void divideButtonPressed() {
        try {
            labelSign.setText("/");
            repaintTopPanel();
            labelSign.setVisible(true);
            double num = Double.parseDouble(textField1.getText());
            labelTempVal.setText(String.valueOf(num));
            isWholeLabel(num);
            textField1.setText("");
        } catch (NumberFormatException e) {
            labelSign.setText("/");
            textField1.setText("");
            repaintTopPanel();
            labelSign.setVisible(true);
            JOptionPane.showMessageDialog(null, "Invalid value(s)!", "Unable to calculate!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void backSpaceButtonPressed() {
        try {
            String text = textField1.getText();
            int length = text.length();
            String newString = text.substring(0, length - 1);
            textField1.setText(newString);
        } catch (StringIndexOutOfBoundsException g) {
            JOptionPane.showMessageDialog(null, "Field is blank!", "Unable to execute!", JOptionPane.WARNING_MESSAGE);
        }
    }

    //---------------KeyListener Methods---------------------

    @Override
    public void keyTyped(KeyEvent e) {
//        char key = e.getKeyChar();
//        switch (key) {
//             case '+':
//                plusButtonPressed();
//                break;
//            case '-':
//                minusButtonPressed();
//                break;
//            case '/':
//                divideButtonPressed();
//                break;
//            case '*':
//                multiplyButtonPressed();
//                break;
//            case '=':
//                enterButtonPressed();
//                break;
//            default:
//                if (key == KeyEvent.VK_ENTER) enterButtonPressed();
//                if (key == KeyEvent.VK_BACK_SPACE) backSpaceButtonPressed();
//                break;
//
//        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

        char key = e.getKeyChar();
        switch (key) {
            case '+':
                plusButtonPressed();
                break;
            case '-':
                minusButtonPressed();
                break;
            case '/':
                divideButtonPressed();
                break;
            case '*':
                multiplyButtonPressed();
                break;
            case '=':
                enterButtonPressed();
                break;
            default:
                if (key == KeyEvent.VK_ENTER) enterButtonPressed();
                if (key == KeyEvent.VK_ESCAPE) clearButtonPressed();
                break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        try {
            double num = Double.parseDouble(textField1.getText());
        } catch (NumberFormatException f) {
            textField1.setText("");
        }


    }


    //---------------KeyListener Methods end---------------------
}
