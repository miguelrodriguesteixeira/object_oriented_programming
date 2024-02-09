import java.util.Arrays;
import java.util.Collections;

public class Baralho {
  private Carta[] _cartas;

  public Baralho(Carta[] cartas) {
    _cartas = cartas;
  }

  public void baralhar() {
    Collections.shuffle(Arrays.asList(_cartas));
  }

  public int ObterTamanho(){
    return _cartas.length;
  }

  public Carta obterCarta(int indice){
    return _cartas[indice];
  }
  
  public IteratorBaralho iterador(){
    return new MeuIteradorBaralho(this);
  }
}
