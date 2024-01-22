package view;
import static main.Constant.*;

import model.Position;
import model.Parcours;
import javax.swing.*;

import main.Constant;

import java.awt.*;

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
        for(int i = 0; i < p.get_points().size() - 1; i++){
            g.drawLine(p.get_points().get(i).x, p.get_points().get(i).y, p.get_points().get(i+1).x, p.get_points().get(i+1).y);
        }
    }
}
