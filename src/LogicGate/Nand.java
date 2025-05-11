package LogicGate;

public class Nand extends LogicGate{

    public Nand(boolean i1, boolean i2) {
        super(i1, i2);
    }

    @Override
    public void setOutput() {
        output = !(input1 && input2);
    }
}
