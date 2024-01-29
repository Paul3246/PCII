package view;

import static main.Constant.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Jeu;

public class Menu extends JPanel{
    JFrame maFenetre;
    public Menu(JFrame maFenetre){
        super();
        this.maFenetre = maFenetre;
        this.setPreferredSize(new Dimension(FWIDTH, FHEIGHT));
        JButton myButton = new JButton("Cliquez pour commencer");
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of Jeu and call the game method
                Jeu jeu = new Jeu();
                jeu.game(maFenetre);
            }
        });
        this.add(myButton);
    }
}
