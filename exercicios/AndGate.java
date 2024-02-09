public class AndGate {
    private boolean _a, _b;

    public AndGate() { /* por omissao sao as duas falsas */
        _a = false;
        _b = false;
    }

    public AndGate(boolean a, boolean b) { /* construtores */
        _a = a;
        _b = b;
    }

    public void setA(boolean a) {
        _a = a;
    }

    public void setB(boolean b) {
        _b = b;
    }

    public boolean getOutput() {
        return (_a && _b);
    }
}
