package model;

import static main.Constant.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
public class Parcours {
    private ArrayList<Point> points;
    private Position p;

    public Parcours(Position p){
        this.p = p;
    }

    public void generate_points(){
        int yr = 200;
        int ratio;
        int length = BEFORE+X_MAX;
        points = new ArrayList<Point>();

        points.add(new Point(0-BEFORE, yr));
        points.add(new Point(BEFORE, yr));

        while(length < FHEIGHT+AFTER){
            Point last = points.get(points.size()-1);
            int y_last = last.y;
            int xr = new Random().nextInt(X_MAX - X_MIN) + X_MIN;
            do {
                ratio = new Random().nextInt(10);
                yr = y_last + (ratio-5)*10;
            } while(yr > MAX_HEIGHT || yr < MIN_HEIGHT);
            length = length + xr;
            points.add(new Point(length, yr));
        }
    }

    public ArrayList<Point> get_points(){
        ArrayList<Point> points2 = new ArrayList<Point>();
        for(Point point : points){
            points2.add(new Point(point.x-p.avancement, point.y));
        }
        if (points2.get(0).x < 0-BEFORE){
            points.remove(0);
        }
        if (points2.get(points2.size()-1).x < FWIDTH+AFTER){
            int yr = 0;
            int ratio;
            int length = points.get(points.size()-1).x;
            Point last = points.get(points.size()-1);
            int y_last = last.y;
            int xr = new Random().nextInt(X_MAX - X_MIN) + X_MIN;
            do {
                ratio = new Random().nextInt(10);
                yr = y_last + (ratio-5)*10;
            } while(yr > MAX_HEIGHT || yr < MIN_HEIGHT);
            length = length + xr;
            points.add(new Point(length, yr));

        }
        return points2;
    }
}
