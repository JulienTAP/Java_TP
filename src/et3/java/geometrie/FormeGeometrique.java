package et3.java.geometrie;

import java.awt.*;

public abstract class FormeGeometrique {
    protected String nom;
    private Point centre;
    private Color couleur;

    public FormeGeometrique(Point p, Color couleur){
        this.centre = p;
        this.couleur = couleur;
    }

    public void translate(int x, int y){
        this.centre.x += x;
        this.centre.y += y;
    }

    @Override
    public String toString() {
        return this.nom + " :\n" + "    " + "centre de gravité : " + "x = " + centre.x + ", " + "y = " + centre.y + "\n" + "    " + "couleur : " + "r = " + couleur.getRed() + ", g = " + couleur.getGreen() + ", b = " + couleur.getBlue() + ", alpha = " + couleur.getAlpha() + "\n";
    }
}
