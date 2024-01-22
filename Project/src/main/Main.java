package main;

import javax.swing.JFrame;

import control.Avance;
import control.Descendre;
import control.ReactionClic;
import control.Redessine;
import model.Parcours;
import model.Position;
import view.Affichage;

public class Main {
    public static void main(String [] args) {
        JFrame maFenetre = new JFrame("Exercice 1");
        Position p = new Position();
        Parcours parcours = new Parcours(p);
        Affichage a = new Affichage(p, parcours);
        Redessine r = new Redessine(a);
        Descendre d = new Descendre(p);
        Avance av = new Avance(p, parcours);
        maFenetre.add(a);
        ReactionClic rc = new ReactionClic(p);
        a.addMouseListener(rc);
        r.start();
        d.start();
        av.start();

        maFenetre.pack();
        maFenetre.setVisible(true);
    }
}
