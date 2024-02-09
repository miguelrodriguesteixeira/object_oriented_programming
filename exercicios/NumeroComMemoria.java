/*
+-------------------------------------------+
| Numero                                    |
+-------------------------------------------+
- _valor: int
+-------------------------------------------+
+ Numero()                      "por omissao"
+ Numero (valor: int)
+ obterValor(): int
+ alterarNumero(valor:int)
+ toString():String
+ equals(outro: Numero): boolean
+ maior(outro: Numero): Numero
+-------------------------------------------+
*/                                
/* seta triangular de heranca */
/*                  |          
+-------------------------------------------+
| NumeroComMemoria                          |
+-------------------------------------------+
- _valorAnterior: int
+-------------------------------------------+
+ NumeroComMemoria()
+ NumeroComMemoria(valor:int)
+ obterAnterior():int 
+ desfazer()
+ alterarNumero(valor: int)
---------------------------------------------+
*/

public class NumeroComMemoria extends Numero{
    private int _valorAnterior;

    public NumeroComMemoria(){
        _valorAnterior = 0;
    }

    public NumeroComMemoria(int valor){
        super(valor);
        _valorAnterior = valor;
    }


    @Override
    public void alterarNumero(int valor){
        _valorAnterior = obterValor();
        super.alterarNumero(valor);
    }

}