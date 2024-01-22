package main;

import javax.swing.JFrame;
import control.Descendre;
import control.Redessine;
import control.ReactionClic;
import model.Position;
import view.Affichage;

public class Main {
    public static void main(String [] args) {
        JFrame maFenetre = new JFrame("Exercice 1");
        Position p = new Position();
        Affichage a = new Affichage(p);
        Redessine r = new Redessine(a);
        Descendre d = new Descendre(p);
        maFenetre.add(a);
        ReactionClic rc = new ReactionClic(p);
        a.addMouseListener(rc);
        r.start();
        d.start();

        maFenetre.pack();
        maFenetre.setVisible(true);
    }
}
