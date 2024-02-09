/*
+-------------------------------------------+
| Pneu                                      |
+-------------------------------------------+
| - _pressaoAr:int                          |
| - _pressaoRecomendada:int                 |
| - _estaFurado:boolean                     |  Nota: + public / - private
+-------------------------------------------+
| + Pneu(recomendada:int, pressao:int)      |
| + obtemPressaoAr(): int                   |
| + obtemPressaoArRecomendada(): int        |
| + alterarPressao(novaPressao:int):void    |                 
+-------------------------------------------+
*/

public class Pneu {
  private int _pressaoAr;
  private int _pressaoArRecomendada;
  private boolean _furado;
  private int _npneus;

  public Pneu(int pressaoAr, int recomendada) {
    _pressaoAr = pressaoAr;
    _pressaoArRecomendada = recomendada;
    //_furado = false;
    _npneus += 1;
  }

  public int obtemPressaoAr() {
    return _pressaoAr;
  }

  public int obtemPressaoArRecomendada() {
    return _pressaoArRecomendada;
  }

  public boolean estaFurado() {
    return _furado;
  }

  public boolean estaVazio() {
    return _pressaoAr < 0.8 * _pressaoArRecomendada;
  }

  public void alterarPressao(int novaPressao) {
    if (!_furado) {
      if (novaPressao > 1.5 * _pressaoArRecomendada) {
        _furado = true;
        _pressaoAr = 0;
      } else
        _pressaoAr = novaPressao;
    }
  }
}




