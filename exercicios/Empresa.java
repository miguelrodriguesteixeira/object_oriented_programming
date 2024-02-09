import java.util.*;

public class Empresa {
    private Set <Funcionario> _funcionarios;

    public Empresa() {
        _funcionarios = new HashSet<>();
    }

    public boolean addFuncionario(Funcionario f){
        return _funcionarios.add(f);
    }

    public void imprimirFuncionarios(){
        for (Funcionario f: _funcionarios){
            System.out.println(f.obterNome());
            System.out.println(f.obterSalario());
        }
    }

    public boolean removerFuncionario(Funcionario f){
        return _funcionarios.remove(f);
    }

    public void removerStartsWith(String start){
        Iterator <Funcionario> it = _funcionarios.iterator();

        while (it.hasNext()){
            Funcionario f = it.next();
            if(f.obterNome().startsWith(start)){
                it.remove();
            }
        }
    }

    public Collection<Funcionario> obterFuncionarioSalarioMaior(int valor){
        List <Funcionario> salarioSuperior = new ArrayList <>();

        for(Funcionario f : _funcionarios){
            if(f.obterSalario() > valor){
                salarioSuperior.add(f);
            }
        }
        return salarioSuperior;
    }
}
