/* Numero.java : package calc.core; */
/* OperacaoMais.java : package calc.operation; */
/* Main.java : package calc; */
/* javac -cp ex1 ex1/calc/*.java */ 
/* java -cp ex1 calc.Main */

/*public class RemoveNumber extends Command<IntegerManager> {
    public RemoveNumber(IntegerManager receiver){
        super("Remover numero", receiver);
        addIntegerField("numero", "introduza numero");
    }

    protected void execute(){
        Integer n = integerField("numero");
        if (_receiver.remove(n)){ /* fazer .remove no IntegerManager
            _display.addLine("removido");
        }
        else {
            _display.addLine("nao removido");
        }
        _display.display();
    }
}
*/
/* javac -cp po-uilib.jar:. `find ex -name *.java´ */
/* javac -cp po-uilib.jar:. ex.app.App */

/*correto */
/* java -cp po-uilib.jar:. prr.app.App */
/* javac -cp po-uilib.jar:. `find prr -name "*.java"` */
/*find prr -name "*.java" -print | xargs javac -cp po-uilib.jar:. */