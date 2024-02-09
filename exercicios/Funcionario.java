public class Funcionario {
    private final String NOME;
    private int _salario;

    public Funcionario(String nome, int salario){
        NOME = nome;
        _salario = salario;
    }

    public String obterNome(){
        return NOME;
    }

    public int obterSalario(){
        return _salario;
    }

    @Override
    public int hashCode(){
        return NOME.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Funcionario){
            Funcionario f = (Funcionario) obj;

            if(f.obterNome() == this.obterNome()){
                return true;
            }
        }
        return false;
    }
}
