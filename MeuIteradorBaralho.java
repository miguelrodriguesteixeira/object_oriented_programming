public class MeuIteradorBaralho implements IteratorBaralho{
    private Baralho _baralho;
    private int _indice;

    public MeuIteradorBaralho(Baralho b){
        _baralho = b;
    }

    public boolean haProximacarta(){
        return _indice < _baralho.ObterTamanho();
    }

    public Carta proximaCarta(){
        return _baralho.obterCarta(_indice++);
    }
}
