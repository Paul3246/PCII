package control;

import view.Affichage;

public class Colorchange extends Thread{
    Affichage a;
    public Colorchange(Affichage a){
        this.a = a;
    }
    @Override
    public void run(){
        while(true){
            a.changeColorRandomly(a.getGraphics());
            try { Colorchange.sleep(1000); }
            catch (Exception e) { e.printStackTrace(); }
        }
    }
    
}
