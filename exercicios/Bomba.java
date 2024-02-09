public class Bomba {
    private int _id;
    private int _quantidade;

    public Bomba(int id){
        _id = id;
    }

    public void abastece(int q){
        _quantidade += q;
    }

    public int obtemCombustivelFornecido(){
        return _quantidade;
    }
}

