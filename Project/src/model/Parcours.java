package model;

import java.util.ArrayList;
import java.util.Random;

import static main.Constant.BEFORE;
import static main.Constant.FHEIGHT;
import static main.Constant.MAX_HEIGHT;
import static main.Constant.MIN_HEIGHT;
import static main.Constant.X_MAX;
import static main.Constant.X_MIN;

import java.awt.Point;
//import absolute math func
import static java.lang.Math.abs;
public class Parcours {
    private ArrayList<Point> points;

    public void generate_points(){
        int length = BEFORE+X_MAX;
        points = new ArrayList<Point>();

        points.add(new Point(0-BEFORE, 200));
        points.add(new Point(BEFORE, 200));
        points.add(new Point(BEFORE+X_MAX, 200));

        while(length < FHEIGHT){
            Point last = points.get(points.size()-1);
            int y_last = last.y;

            int xr = new Random().nextInt(X_MAX - X_MIN) + X_MIN;
            int ratio = new Random().nextInt(10);
            int yr = y_last + (ratio-5)*10;
            length = length + xr;
            points.add(new Point(length, yr));
        }
    }

    public ArrayList<Point> get_points(){
        return points;
    }  
}
