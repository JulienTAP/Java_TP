package et3.java.geometrie;

import java.awt.*;

final public class Carre extends Rectangle {
    public Carre(Point p, Color couleur, int longeur) {
        super(p, couleur, longeur,longeur);
        this.nom = "Carre";
    }
}