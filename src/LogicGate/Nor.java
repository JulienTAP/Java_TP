package LogicGate;

public class Nor extends LogicGate {

    public Nor(boolean i1, boolean i2) {
        super(i1, i2);
    }

    @Override
    public void setOutput() {
        output = !(input1 || input2);
    }
}
