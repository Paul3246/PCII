package control;

import model.Position;

public class Descendre extends Thread{
    Position p;
    public static final int DELAY = 100;
    public Descendre(Position p){
        this.p = p;
    }
    @Override
    public void run(){
        while(true){
            if (p.get() >= 0){
                p.move();
            }
            try { Redessine.sleep(DELAY); }
            catch (Exception e) { e.printStackTrace(); }
        }
    }
}
