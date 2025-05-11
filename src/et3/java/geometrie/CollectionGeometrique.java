package et3.java.geometrie;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionGeometrique extends ArrayList<FormeGeometrique> {
    public CollectionGeometrique(FormeGeometrique ... formes){
        this.addAll(Arrays.stream(formes).toList());
    }

    public void translation(int x, int y){
        for (int i=0;i<this.size();i++){
            this.get(i).translate(x,y);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        CollectionGeometrique test = new CollectionGeometrique(new Cercle(new Point(2,6),new Color(193, 14, 221, 186),23), new Rectangle(new Point(23,87), new Color(39, 189, 69, 255),56,98));
        System.out.println(test.toString());
    }
}
