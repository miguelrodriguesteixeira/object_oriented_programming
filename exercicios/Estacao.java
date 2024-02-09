public class Estacao {
    private int _capacidade;
    private int _quantidade;
    private int[] _bombas;
    private static final int NUMERO_BOMBAS = 10; /* underlined porque e estatico */

    public Estacao(int capacidade) {
        _quantidade = capacidade;
        _capacidade = capacidade;
        _bombas = new int[NUMERO_BOMBAS];
    }

    public int abastece(int q, int bomba){
        if (q > _quantidade){
            q = _quantidade;
        }
        _quantidade -= q;
        _bombas[bomba] += q;
        return q;
    }

    public int obtemCombustivelDisponivel(){
        return _quantidade;
    }

    public int obtemAbastecidoEm(int bomba){
        return _bombas[bomba];
    }

    public void adicionarCombustivel(int q){
        _quantidade += q;
    }

    public static void main(String[] args) {
        Estacao estacao1 = new Estacao(300);
        estacao1.adicionarCombustivel(100);
        System.out.println(estacao1.obtemCombustivelDisponivel());
    }
}

