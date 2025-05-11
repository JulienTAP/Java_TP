package Component;

import Memoire.ComplexMemoire;
import Memoire.OperationComplex;

public class Complex {
    private final double reel;
    private  final double imaginaire;

    public Complex(double reel, double imaginaire){
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public Complex(Complex nb){
        this.reel = nb.reel;
        this.imaginaire = nb.imaginaire;
    }

    public double getReel() {
        return reel;
    }

    public double getImaginaire() {
        return imaginaire;
    }

    public double module(){
        return Math.sqrt((this.imaginaire*this.imaginaire) + (this.reel*this.reel));
    }

    public double argument(){
        return Math.acos(this.reel/this.module());
    }

    public Complex add(Complex c1){
        return new Complex(this.reel+c1.reel,this.imaginaire+c1.imaginaire);
    }

    public Complex product(Complex c1){
        return new Complex(this.reel*c1.reel-this.imaginaire*c1.imaginaire,this.reel*c1.reel+this.imaginaire*c1.imaginaire);
    }

    @Override public boolean equals(Object obj) {
        if(obj instanceof Complex nouvelObjet){
            return this.imaginaire == nouvelObjet.imaginaire && this.reel == nouvelObjet.reel;
        }
        return false;
    }

    @Override public String toString(){
        return reel + "+" + imaginaire + "i";
    }

    public static void main(String[] arg){
        Complex test = new Complex(10,567);
        System.out.println(test.toString());

        Complex test2 = new Complex(10,567);
        System.out.print(test.equals(test2) + "\n");

        Complex test3 = new Complex(183,7);
        System.out.print(test.equals(test3) + "\n");

        System.out.println(test.module() + " " + test.argument() + "\n");

        Complex test4 = test.add(test2);
        Complex test5 = test.product(test3);

        System.out.println(test4 + " " + test5 + "\n");

        OperationComplex op1 = new OperationComplex(test,test2, OperationComplex.choix.addition,test5);
        System.out.println(op1.toString());

        ComplexMemoire testmemoir1 = new ComplexMemoire(2,8);
        ComplexMemoire testmem2 = new ComplexMemoire(9,2);
        testmemoir1.add(testmem2);

        System.out.println(testmem2.toString());

        testmemoir1.product(testmemoir1);

        System.out.println(testmemoir1.toString());



    }
}
