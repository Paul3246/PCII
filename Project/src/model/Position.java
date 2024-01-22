package model;

public class Position {
    private int height = 0;
    private int vitesse = 1;
    public int avancement = 0;

    public int get() {
        return height;
    }

    public void jump(int v) {
        vitesse = v; // met la vitesse a v (qui doit etre negative puisque l on va dans le sens
                     // contraire a la chute)
    }

    public void move() {
        //System.out.println(height);
        height = height - vitesse; // On modifie la hauteur, en la decrementant de la valeur de la vitesse
        if (height < -125) {
            height = -125; // Si on a fini le mouvement
        } else {
            vitesse = vitesse + 1;// On augmente progressivement la vitesse (a chaque fois que le thread appel la
                                  // fonction move)
        }
    }
    public void avance(){
        avancement = avancement + 1;
    }
}
