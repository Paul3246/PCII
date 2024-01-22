package model;

public class Position {
    private int height = 0;
    private int vitesse = 1;
    private int avancement = 0;

    public int get() {
        return height;
    }

    public void jump(int v) {
        vitesse = v; // met la vitesse a v (qui doit etre negative puisque l on va dans le sens
                     // contraire a la chute)
    }

    public void move() {
        System.out.println(height);
        height = height - vitesse; // On modifie la hauteur, en la decrementant de la valeur de la vitesse
        if (height < 0) {
            height = 0; // Si on a fini le mouvement
        } else {
            vitesse = vitesse + 1;// On augmente progressivement la vitesse (a chaque fois que le thread appel la
                                  // fonction move)
        }
    }
}
