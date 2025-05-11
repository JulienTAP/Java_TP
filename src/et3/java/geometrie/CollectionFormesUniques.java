package et3.java.geometrie;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionFormesUniques <T extends FormeGeometrique> extends CollectionGeometrique{
    public CollectionFormesUniques(T ... formes){
        this.addAll(Arrays.stream(formes).toList());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        CollectionGeometrique test = new CollectionGeometrique(new Cercle(new Point(2,6),new Color(193, 14, 221, 186),23),new Cercle(new Point(2,6),new Color(193, 14, 221, 186),23),new Cercle(new Point(2,6),new Color(193, 14, 221, 186),23));
        System.out.println(test.toString());
    }
}
