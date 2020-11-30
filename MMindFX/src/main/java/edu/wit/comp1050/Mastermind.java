package edu.wit.comp1050;

import javafx.application.Application;

public class Mastermind {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Timer());
        t1.start();
        Thread t2 = new Thread(new soundPlayer());
        t2.start();

        Application.launch(edu.wit.comp1050.mindFX.class, args);
    }
}
