package et3.java.geometrie;

import java.awt.*;

public class Cercle extends FormeGeometrique {
    private double rayon;

    public Cercle(Point p, Color couleur,double rayon) {
        super(p, couleur);
        this.nom = "Cercle";
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return super.toString() + "    " + "rayon : " + rayon + "\n";
    }

    public static void main(String[] args) {
        Cercle test = new Cercle(new Point(2,6),new Color(193, 14, 221, 79),23);
        System.out.println(test.toString());
    }
}