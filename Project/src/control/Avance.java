package control;

import model.Parcours;
import model.Position;

public class Avance extends Thread{
    Position p;
    Parcours parcours;
    public Avance(Position p, Parcours parcours){
        this.p = p;
        this.parcours = parcours;
    }
    @Override
    public void run(){
        while(true){
            p.avance();
            try { Avance.sleep(10); }
            catch (Exception e) { e.printStackTrace(); }
        }
    }
}
