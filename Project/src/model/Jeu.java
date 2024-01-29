package model;

import javax.swing.JFrame;

import control.Avance;
import control.Colorchange;
import control.Descendre;
import control.ReactionClic;
import control.Redessine;
import view.Affichage;

public class Jeu {
        public void game(JFrame maFenetre) {
        Position p = new Position();
        Parcours parcours = new Parcours(p);
        Affichage a = new Affichage(p, parcours);
        Redessine r = new Redessine(a);
        Descendre d = new Descendre(p);
        Avance av = new Avance(p);
        Colorchange c = new Colorchange(a);
        maFenetre.add(a);
        ReactionClic rc = new ReactionClic(p);
        a.addMouseListener(rc);
        r.start();
        d.start();
        av.start();
        c.start();
    }
}
