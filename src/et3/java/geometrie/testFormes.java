package et3.java.geometrie;

import java.awt.*;
import java.util.ArrayList;

public class testFormes {
    public static void main(String[] args) {
        ArrayList test = new ArrayList();
        Cercle testCercle = new Cercle(new Point(2,6),new Color(193, 14, 221, 186),23);
        Rectangle testRectangle = new Rectangle(new Point(23,87), new Color(39, 189, 69, 255),56,98);
        Carre testCarre = new Carre(new Point(9,69), new Color(61, 92, 195, 255),2);
        test.add(testCercle);
        test.add(testRectangle);
        test.add(testCarre);

        for(int i=0; i<test.size();i++){
            System.out.println(test.get(i).toString());
        }

        try {
            test.remove(5);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Impossible \n");
        }
    }
}
