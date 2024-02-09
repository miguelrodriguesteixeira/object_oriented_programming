/*
+-------------------------------------------+
| Numero                                    |
+-------------------------------------------+
- _valor: int
+-------------------------------------------+
+ Numero()                      "por omissao"
+ Numero (valor: int)
+ obterValor(): int
+ toString():String
+ equals(outro: Numero): boolean
+ devolverMaior(outro: Numero): Numero
+-------------------------------------------+
*/
public class Numero {
    private int _valor;

    public Numero(){
        _valor = 0;
    }

    public Numero(int valor){
        _valor = valor;
    }

    public int obterValor(){
        return _valor;
    }
    
    public String toString(){
        return "" + _valor;
    }

    public boolean equals(Numero outro){
        return _valor == outro._valor;
    }

    public Numero devolverMaior(Numero outro){
        return _valor > outro.obterValor()? this:outro;
    }

    public void alterarNumero(int valor){
        _valor = valor;
    }
    public static void main(String[] args) {
        Numero n1 = new Numero(1);
        Numero n2 = new Numero(5);
        System.out.println("o valor n1 = " + n1.obterValor() + " e o valor n2 = " + n2.obterValor());
        System.out.println("sao iguais? = " + n1.equals(n2));
        System.out.println("o maior eh = " + n1.devolverMaior(n2));
    }
}

