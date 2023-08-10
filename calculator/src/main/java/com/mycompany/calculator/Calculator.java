package com.mycompany.calculator;

import com.mycompany.calculator.gui.JframeGui;

public class Calculator {

    public static void main(String[] args) {
                /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeGui().setVisible(true);
            }
        });
    }
}
