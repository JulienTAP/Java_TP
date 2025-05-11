package LogicGate;

public class BasculeRS {
    private Nor porte1;
    private Nor porte2;
    private boolean Q1 = false;
    private boolean Q2 = true;

    public BasculeRS(Nor p1, Nor p2){
        this.porte1 = p1;
        this.porte2 = p2;
        this.porte1.input2 = porte2.getOutput();
        this.porte2.input1 = porte1.getOutput();

        setQ1();
        setQ2();
    }

    public void setR(boolean R){
        this.porte1.input1 = R;
    }

    public void setS(boolean S){
        this.porte2.input2 = S;
    }

    public void setQ1(){
        Q1 = porte1.getOutput();
    }

    public void setQ2(){
        Q2 = porte2.getOutput();
    }

    public boolean getR(){
        return porte1.input1;
    }

    public boolean getS(){
        return porte2.input2;
    }

    public boolean getQ1(){
        return Q1;
    }

    public boolean getQ2(){
        return Q2;
    }

    public static void main(String[] args) {
        BasculeRS test = new BasculeRS(new Nor(true,true),new Nor(true,true));

    }
}
