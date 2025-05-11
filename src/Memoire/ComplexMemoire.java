package Memoire;
import Component.Complex;

public class ComplexMemoire extends Complex {
    private static OperationComplex[] operations = new OperationComplex[10];

    public ComplexMemoire(double reel,double imaginaire){
        super(reel,imaginaire);
    }

    public ComplexMemoire(ComplexMemoire autre){
        super(autre.getReel(),autre.getImaginaire());
    }

    public void AddMemory(Complex operand, OperationComplex.choix type, Complex result) {
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == null) {
                operations[i] = new OperationComplex(this, operand, type, result);
                break;
            }
        }
    }

    @Override
    public Complex add(Complex c1) {
        Complex res = new ComplexMemoire(this.getReel() + c1.getReel(), this.getImaginaire() + c1.getImaginaire());
        this.AddMemory(c1, OperationComplex.choix.addition, res);
        return res;
    }

    @Override
    public Complex product(Complex c1) {
        Complex res = new ComplexMemoire(this.getReel() * c1.getReel() - this.getImaginaire() * c1.getImaginaire(), this.getReel() * c1.getReel() + this.getImaginaire() * c1.getImaginaire());
        this.AddMemory(c1, OperationComplex.choix.multiplication, res);
        return res;
    }

    @Override
    public String toString() {
        String res = "Liste des operations : \n";
        for(int i=0;i<operations.length;i++){
            if(operations[i]!=null){
                res += operations[i].toString();
            }
        }
        return res;
    }
}
