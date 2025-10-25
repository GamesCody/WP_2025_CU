package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame
{
    public App (){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setMinimumSize(new Dimension(300, 200));
        JPanel panelButton = new JPanel(new GridLayout(5, 4));
        JTextField textFieldScreen = new JTextField(10);


        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonDevision = new JButton("/");
        JButton buttonMultiplication = new JButton("*");
        JButton buttonSubstraction = new JButton("-");
        JButton buttonAddition = new JButton("+");
        JButton buttonEquals = new JButton("=");
        JButton buttonClear = new JButton("C");
        JButton buttonUndo = new JButton("<-");
        JPanel empty = new JPanel();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "9");
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "0");
            }
        });
        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "*");
            }
        });
        buttonSubstraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "-");
            }
        });
        buttonAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "+");
            }
        });
        buttonDevision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "/");
            }
        });
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "=");
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldScreen.getText();
                textFieldScreen.setText(value + "C");
            }
        });
        empty.setBackground(Color.LIGHT_GRAY); // opcjonalnie, żeby było widać

        panelButton.add(buttonClear);
        panelButton.add(buttonDevision);
        panelButton.add(buttonMultiplication);
        panelButton.add(buttonSubstraction);
        panelButton.add(button7);
        panelButton.add(button8);
        panelButton.add(button9);
        panelButton.add(buttonAddition);
        panelButton.add(button4);
        panelButton.add(button5);
        panelButton.add(button6);
        panelButton.add(buttonEquals);
        panelButton.add(button1);
        panelButton.add(button2);
        panelButton.add(button3);
        panelButton.add(buttonUndo);
        panelButton.add(empty);
        panelButton.add(button0);






        setLayout(new BorderLayout());
        add(textFieldScreen, BorderLayout.NORTH);
        add(panelButton, BorderLayout.CENTER);

    }
    public static void main( String[] args )

    {
        EventQueue.invokeLater(new Runnable(){



            @Override
            public void run(){
                new App().setVisible(true);
            }

        });
    }
}
