package control;

import model.Position;

public class Avance extends Thread{
    Position p;
    public Avance(Position p){
        this.p = p;
    }
    @Override
    public void run(){
        while(true){
            p.avance();
            p.score();
            p.best_score();
            try { Avance.sleep(10); }
            catch (Exception e) { e.printStackTrace(); }
        }
    }
}
