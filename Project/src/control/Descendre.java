package control;

import model.Position;

public class Descendre extends Thread{
    Position p;
    public Descendre(Position p){
        this.p = p;
    }
    @Override
    public void run(){
        while(true){
            if (p.get() >= -125){
                p.move();
            }
            try { Thread.sleep(100); }
            catch (Exception e) { e.printStackTrace(); }
        }
    }
}
