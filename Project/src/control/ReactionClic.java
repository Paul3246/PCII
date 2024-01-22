package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import model.Position;

public class ReactionClic extends MouseAdapter{
    public Position p;
    public ReactionClic(Position p){
        super();
        this.p = p;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        p.jump(-10);
    }

}