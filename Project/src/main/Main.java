package main;

import javax.swing.JFrame;

import view.Menu;

public class Main {
    public static void main(String [] args) {
        JFrame maFenetre = new JFrame("Exercice 1");
        Menu m = new Menu(maFenetre);
        maFenetre.add(m);

        maFenetre.pack();
        maFenetre.setVisible(true);

    }
}
