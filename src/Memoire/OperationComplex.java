package Memoire;

import Component.Complex;

public class OperationComplex {
    private Complex operande1;
    private Complex operande2;
    public static  enum choix {addition, multiplication}
    private choix type;
    private Complex resultat;

    public choix getType(){
        return type;
    }

    public Complex[] getOperande(){
        return new Complex[]{operande1,operande2};
    }

    public Complex getResultat(){
        return resultat;
    }

    public OperationComplex(Complex operande1,Complex operande2, choix type, Complex resultat){
        this.operande1 = operande1;
        this.operande2 = operande2;
        this.type = type;
        this.resultat = resultat;
    }

    @Override public String toString(){
        return "(" + operande1.toString() + ")" +((type==choix.multiplication)?("*"):("+")) + "(" + operande2.toString() + ")" + " = " + resultat.toString() + "\n";
    }
}
