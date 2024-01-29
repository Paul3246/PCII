package control;

import model.ImagePosition;

public class Imagechange extends Thread{
    ImagePosition ip;
    public Imagechange(ImagePosition ip){
        this.ip = ip;
    }
    @Override
    public void run(){
        while(true){
            ip.move_pos1();
            ip.move_pos2();
            try { Imagechange.sleep(50); }
            catch (Exception e) { e.printStackTrace(); }
        }
    }
    
}
