/*
+-------------------------------------------+
| Carro                                     |
+-------------------------------------------+
| - _marca: String                          |
| - _quilometragem: int                     |
| - _velocidadeMaxima: int                  |
| - _estaTravado: boolean                   |
| - _velocidadeAtual: int                   |
| - _pneu1: Pneu                            |
| - _pneu2: Pneu                            |
| - _pneu3: Pneu                            |
| - _pneu4: Pneu                            |
+-------------------------------------------+
| + Carro (marca:String, velocidadeMaxima:int, pneu1: Pneu
    pneu2:Pneu,pneu3:Pneu,pneu4:Pneu)
| + obtemQuilometragem(): int                  
| + obtemMarca(): String      
| + temPneuVazio(): boolean
| + alterarQuilometragem(novaQuilometragem:int)
| + estaEmMovimento(): boolean 
| + alterarTravagem(): void
| + alterarVelocidade(novaVelocidade:int)
+-------------------------------------------+
*/

public class Carro {
    private String _marca;
    private int _quilometragem;
    private int _velocidadeMaxima;
    private int _velocidadeAtual;
    private boolean _estaTravado;
    private Pneu _pneu1; /* private Pneu[] _pneus */
    private Pneu _pneu2;
    private Pneu _pneu3;
    private Pneu _pneu4;

    public Carro(String marca, int velocidadeMaxima,Pneu pneu1,  
    Pneu pneu2, Pneu pneu3, Pneu pneu4){
        _marca = marca;
        _velocidadeMaxima = velocidadeMaxima;
        _pneu1 = pneu1;
        _pneu2 = pneu2;    /*_pneus = newPneu[4] */
        _pneu3 = pneu3;    /* _pneus[0] = pneu1*/
                            /* _pneus[1] = pneu2*/
                            /* _pneus[2] = pneu3*/
                            /* _pneus[3] = pneu4*/
        _pneu4 = pneu4;
        _estaTravado = true;

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

    public boolean estaEmMovimento() {
        return !_estaTravado;
    }
    
    public void alterarTravagem() {
        if (_estaTravado) {
            _estaTravado = false;
        }
        else {
            _estaTravado = true;
        }
    }

    public void alterarVelocidade(int novaVelocidade) {
        if (!_estaTravado) {
            if (novaVelocidade > _velocidadeMaxima) {
                _velocidadeAtual = _velocidadeMaxima;
            }
            else {
                _velocidadeAtual = novaVelocidade;
            }
        }
    }
    public static void main(String args[]) {
        System.out.println("faisca Mcqueen");
      }

}
