package view;
import static main.Constant.*;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.ImagePosition;
import model.Parcours;
import model.Position;

public class Affichage extends JPanel {
    private Parcours parcours;
    private Position p;
    private BufferedImage image1;
    private BufferedImage image2;
    private ImagePosition ip;

    public Affichage(Position p, Parcours parcours, ImagePosition ip){
        super();
        this.setPreferredSize(new Dimension(FWIDTH, FHEIGHT));
        this.p = p;
        this.ip = ip;
        this.parcours = parcours;
        parcours.generate_points();
        try {
            image1 = ImageIO.read(new File("/home/paul/PCII/Projet_PCII/Project/src/images/flappy.png"));
            image2 = ImageIO.read(new File("/home/paul/PCII/Projet_PCII/Project/src/images/flappy.png"));
        } catch (IOException ex) {
            throw new RuntimeException("Image not found");
        }
        ip.set_pos2(image1.getWidth());
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawImages(g);
        final int x = X_VIEW;
        final int y = convertY(p.get());
        final int w = OWIDTH;
        final int h = OHEIGHT;
        g.drawOval(x, y, w, h);
        drawParcours(g, parcours);
        showScore(g);
        //showBestScore(g);
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
    private void showScore(Graphics g){
        g.drawString("Score : " + p.score, 10, 10);
    }
    private void showBestScore(Graphics g){
        g.drawString("Best score : " + p.best_score, 10, 20);
    }
    public void drawImages(Graphics g){
        g.drawImage(image1, ip.get_pos1(), 0, this);
        g.drawImage(image2, ip.get_pos2(), 0, this);
        if (ip.get_pos2() + image2.getWidth() == FWIDTH){
            ip.set_pos1(FWIDTH);
        }
        if (ip.get_pos1() + image1.getWidth() == FWIDTH){
            ip.set_pos2(FWIDTH);
        }
    }
}
