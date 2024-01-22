package view;

import model.Position;
import javax.swing.*;
import java.awt.*;

public class Affichage extends JPanel {
    public static final int largeur = 400;
    public static final int hauteur = 400;
    private Position p;
    public Affichage(Position p){
        super();
        this.setPreferredSize(new Dimension(largeur, hauteur));
        this.p = p;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        final int x = 200;
        final int y = p.get();
        final int w = 20;
        final int h = 100;
        g.drawOval(x, y, w, h);
    }
}
