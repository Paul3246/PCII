public class Redessine extends Thread{
    Affichage a;
    public static final int DELAY = 50; 

    public Redessine(Affichage a){
        this.a = a;
    }
    @Override
    public void run(){
        while(true){
            a.repaint();
            try { Redessine.sleep(DELAY); }
            catch (Exception e) { e.printStackTrace(); }
        }
    }

}
