package view;
import static main.Constant.*;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Parcours;
import model.Position;

public class Affichage extends JPanel {
    private Parcours parcours;
    private Position p;
    public Affichage(Position p, Parcours parcours){
        super();
        this.setPreferredSize(new Dimension(FWIDTH, FHEIGHT));
        this.p = p;
        this.parcours = parcours;
        parcours.generate_points();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        final int x = X_VIEW;
        final int y = convertY(p.get());
        final int w = OWIDTH;
        final int h = OHEIGHT;
        g.drawOval(x, y, w, h);
        drawParcours(g, parcours);
    }

    // Convertit les coordonnées Y du modèle en coordonnées de la vue
    private int convertY(int y){
        return 175 - y*RATIO;
    }

    private void drawParcours(Graphics g, Parcours p){
        ArrayList<java.awt.Point> points = p.get_points();
        for(int i = 0; i < points.size() - 1; i++){
            g.drawLine(points.get(i).x, points.get(i).y, points.get(i+1).x, points.get(i+1).y);
        }
    }
}
