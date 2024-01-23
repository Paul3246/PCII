package control;
import static main.Constant.*;

import view.Affichage;

public class Redessine extends Thread{
    Affichage a;

    public Redessine(Affichage a){
        this.a = a;
    }
    @Override
    public void run(){
        while(true){
            a.revalidate();
            a.repaint();
            try { Redessine.sleep(DELAY); }
            catch (Exception e) { e.printStackTrace(); }
        }
    }

}
