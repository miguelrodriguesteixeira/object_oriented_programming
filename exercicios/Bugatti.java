/*
+-------------------------------------------+
| Bugatti                                   |
+-------------------------------------------+
| - _marca: String                          |
| - _quilometragem: int                     |
| - _velocidadeMaxima: int                  |              
| - _pneus: Pneu[]                     
+-------------------------------------------+
| + Bugatti (marca:String, velocidadeMaxima:int, quilometragem:int, pneus:Pneu[])
| + obtemQuilometragem(): int                   
| + obtemMarca(): String      
| + temPneuVazio(): boolean
| + alterarQuilometragem(novaQuilometragem:int)
| + montarPneus(novospneus: Pneu[]): boolean
+-------------------------------------------+
*/

public class Bugatti {
    private String _marca;
    private int _quilometragem;
    private int _velocidadeMaxima;
    private Pneu[] _pneus;

    public Bugatti(String marca, int velocidadeMaxima, int quilometragem, Pneu[] pneus){
        _marca = marca;
        _velocidadeMaxima = velocidadeMaxima;
        _quilometragem = quilometragem = 0;
        for (int i = 0; i < _npneus; i++){
            _pneus[i] = pneus[i];
        }
        /* _pneu1 = pneu1;
        _pneu2 = pneu2;    _pneus = newPneu[4] 
        _pneu3 = pneu3;     _pneus[0] = pneu1
        _pneu4 = pneu4; */
    }

    public int obtemQuilometragem() {
        return _quilometragem;
    }

    public String obtemMarca() {
        return _marca;
    }
    
    public boolean temPneuVazio() {
        return _pneu1.estaVazio() || _pneu2.estaVazio()
        || _pneu3.estaVazio() || _pneu4.estaVazio();
    }

    public void alterarQuilometragem(int novaQuilometragem) {
        _quilometragem = novaQuilometragem;
    }

    public boolean montarPneus(Pneu novoPneu1, Pneu novoPneu2,
    Pneu novoPneu3,Pneu novoPneu4){
        int recomendada = novoPneu1.obtemPressaoArRecomendada();
        if ((recomendada ==
        novoPneu2.obtemPressaoArRecomendada()) &&
        (recomendada == novoPneu3.obtemPressaoArRecomendada()) &&
        (recomendada == novoPneu4.obtemPressaoArRecomendada())){
            _pneu1 = novoPneu1;
            _pneu2 = novoPneu2;
            _pneu3 = novoPneu3;
            _pneu4 = novoPneu4;
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]) {
        Pneu bug1 = new Pneu(100, 200);
        Pneu bug2 = new Pneu(100, 200);
        Pneu bug3 = new Pneu(100, 200);
        Pneu bug4 = new Pneu(100, 200);
        Bugatti buggatti1 = new Bugatti("boogatti", 200, 
        30000, bug1, bug2, bug3, bug4);
        Pneu novo1 = new Pneu(100, 400);
        Pneu novo2 = new Pneu(100, 200);
        Pneu novo3 = new Pneu(100, 300);
        Pneu novo4 = new Pneu(100, 200);
        System.out.println(buggatti1.montarPneus(novo1, novo2, novo3, novo4));
      }
    
}
