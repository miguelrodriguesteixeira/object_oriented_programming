/*
+-------------------------------------------+
| Caneta                                    |
+-------------------------------------------+
| - _capacidadeTinta: int                   |
| - _cor: String                    
| - _marca: String            
| - _quantidade: int                        |
+-------------------------------------------+
| + Caneta (capacidadeTinta:int, marca:String,
  cor:String)
| + escrever(texto:String): boolean                
  + recarregar(novaQuantidade:int):int
  + obtemCor(): String
  + obtemQuantidade():int;
+-------------------------------------------+
*/

public class Caneta {
    private String _marca;
    private String _cor;
    private int _capacidadeTinta;
    private int _quantidade; 

    public Caneta (int capacidadeTinta, String marca,
    String cor){
        _capacidadeTinta = capacidadeTinta;
        _marca = marca;
        _cor = cor;
        _quantidade = capacidadeTinta;
    }

    public boolean escrever(String texto){
        if (texto.length() > _quantidade){
            return false;
        }
        else{
            _quantidade = _quantidade - texto.length();
            return true;
        }
    }

    public int recarregar(int quantidadeRecarregar){
        int novaQuantidade = _quantidade + quantidadeRecarregar;
        _quantidade = Math.min(_capacidadeTinta, novaQuantidade);
        if (novaQuantidade > _capacidadeTinta){
            return novaQuantidade - _capacidadeTinta;
        }
        else {
            return 0;
        }
    }

    public String obtemCor() {
        return _cor;
    }

    public int obtemQuantidade() {
        return _quantidade;
    }
    public static void main(String args[]) {
        Caneta caneta1 = new Caneta(3,"Bugatti", "Red");
        System.out.println(caneta1.escrever("miguel"));
      }
    
}
