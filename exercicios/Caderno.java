public class Caderno{
    private int _capacidade;
    private int _quantidade;

    public Caderno(int capacidade, int quantidade){
        _capacidade = capacidade;
        _quantidade = quantidade;
    }

    static Caderno outro = new Caderno(200, 4);

    public boolean adicionarLinha(){
        if (_quantidade == _capacidade){
            return false;
        }
        else {
            _quantidade += 1;
            return true;
        }
    }
    public Caderno compararCadernos(Caderno outro){
        if (_quantidade >= outro._quantidade){
            return this;
        }
        else{
            return outro;
        }
    }
    public static void main(String args[]) {
        Caderno caderno1 = new Caderno(100, 0);
        System.out.println(caderno1.adicionarLinha());
        System.out.println(caderno1.compararCadernos(outro));
    }
}