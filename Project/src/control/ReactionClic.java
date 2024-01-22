package control;

import static main.Constant.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.Position;

public class ReactionClic extends MouseAdapter{
    public Position p;
    public ReactionClic(Position p){
        super();
        this.p = p;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        p.jump(IMPULSION);
    }

}