package model;

import javax.swing.JFrame;

import control.Avance;
import control.Descendre;
import control.Imagechange;
import control.ReactionClic;
import control.Redessine;
import view.Affichage;

public class Jeu {
        public void game(JFrame maFenetre) {
        Position p = new Position();
        ImagePosition ip = new ImagePosition();
        Parcours parcours = new Parcours(p);
        Affichage a = new Affichage(p, parcours, ip);
        Redessine r = new Redessine(a);
        Descendre d = new Descendre(p);
        Avance av = new Avance(p);
        Imagechange c = new Imagechange(ip);
        maFenetre.add(a);
        ReactionClic rc = new ReactionClic(p);
        a.addMouseListener(rc);
        r.start();
        d.start();
        av.start();
        c.start();
    }
}
