public class Veiculo {
    private String _marca;
    private Estacao _estacao;

    public Veiculo(String marca){
        _marca = marca;
    }

    public Veiculo(String marca, Estacao estacao){
        _marca = marca;
        _estacao = estacao;
    }

    public String obtemMarca(){
        return _marca;
    }

    public void acelera() {
        System.out.println("VRUM VRUM");
    }
    
      public void trava() {
        System.out.println("GRRR GRRR");
    }
    
      public void buzina() {
        System.out.println("PII PII");
    }

    public void alteraEstacao(Estacao novaest) {
        _estacao = novaest;
    }
    
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("bugatti");
        veiculo1.buzina();
    }
}
