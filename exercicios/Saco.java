public class Saco {
    private int _capacidade;
    private int _quantidade;

    public Saco(int quantidade, int capacidade){
        _capacidade = capacidade;
        _quantidade = quantidade;
    }

    public int obtemCapacidade(){
        return _capacidade;
    }

    public boolean estaCheio(){
        if (_capacidade == _quantidade){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean adicionarBerlindes(int berlindesAdicionar){
        if ((_quantidade + berlindesAdicionar) > _capacidade){
            return false;
        }
        else{
            _quantidade = _quantidade + berlindesAdicionar;
            return true;
        }
    }

    public static void main(String args[]) {
        Saco saco1 = new Saco(100, 200);
        System.out.println(saco1.adicionarBerlindes(101));
    }
}
