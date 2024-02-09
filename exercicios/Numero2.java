/*
+-------------------------------------------+
| Numero2                                    |
+-------------------------------------------+
- _valor: int
+-------------------------------------------+
- Numero2 (valor: int)
+ obterValor(): int
+ toString():String
+ equals(outro: Numero): boolean
+ devolverMaior(outro: Numero): Numero
+-------------------------------------------+
*/

public class Numero2 {
    private int _valor;
    private static Numero2[] _numeros;

    static {    /* ai teriamos de por o construtor private */
        _numeros = new Numero2[100];
        for (int i = 0; i < 100; i += 1) {
            _numeros[i] = new Numero2(i);
        }
    }

    private Numero2(int valor) {
        _valor = valor;
    }

    public static Numero2 criarNumero(int valor) {
        return (valor >= 0 && valor <= 99)? _numeros[valor] : new Numero2(valor);
    }

    public int obterValor(){
        return _valor;
    }
    
    public String toString(){
        return "" + _valor;
    }

    public boolean equals(Numero2 outro){
        return _valor == outro._valor;
    }

    public Numero2 devolverMaior(Numero2 outro){
        return _valor > outro.obterValor()? this:outro;
    }

    public static void main(String[] args) {
        Numero2 n2 = new Numero2(2);
        Numero2 n3 = new Numero2(123);
        System.out.println(n2.toString());
        System.out.println(n3.obterValor());
        System.out.println(Numero2.criarNumero(124));
    }
}
