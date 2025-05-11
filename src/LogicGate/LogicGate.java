package LogicGate;

abstract public class LogicGate {
    protected boolean input1;
    protected boolean input2;
    protected boolean output;

    public LogicGate (boolean i1,boolean i2){
        input1 = i1;
        input2 = i2;
        setOutput();
    }

    abstract public void setOutput();

    public void setInput1(boolean input1) {
        this.input1 = input1;
        setOutput();
    }

    public void setInput2(boolean input2) {
        this.input2 = input2;
        setOutput();
    }

    public boolean getOutput(){
        return output;
    }

    public static void TestTable(){
        Nand porte1 = new Nand(true,true);
        assert !porte1.getOutput();
        Nor porte2 = new Nor(false,false);
        assert porte2.getOutput();

        porte1.setInput1(false);
        assert porte1.getOutput();

        porte2.setInput1(true);
        assert !porte2.getOutput();
    }

    public static void main(String[] args){
        LogicGate.TestTable();
    }
}
