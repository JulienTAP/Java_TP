package et3.java.geometrie;

import java.awt.*;

public class Rectangle extends FormeGeometrique {
    private int largeur;
    private int hauteur;

    public Rectangle(Point p, Color couleur, int largeur, int hauteur) {
        super(p, couleur);
        this.nom = "Rectangle";
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return super.toString() + "    " + "largeur = " + largeur + "\n" + "    " + "hauteur = " + hauteur + "\n";
    }

    public static void main(String[] args) {
        Rectangle test = new Rectangle(new Point(23,87), new Color(0, 255, 45, 0),56,98);
        System.out.println(test.toString());
    }
}