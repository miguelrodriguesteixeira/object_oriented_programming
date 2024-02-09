public class VeiculoPesado extends Veiculo {
    private int _aceleracoes;
    private int _travagens;

    public VeiculoPesado(String marca) {
        super(marca);
    }

    @Override
    public void buzina() {
        System.out.println("POO POO");
    }
    
    public int obtemNumeroAceleracoes() {
        return _aceleracoes;
    }
    
    public int obtemNumeroTravagens() {
        return _travagens;
    }

    @Override
    public void trava() {
        super.trava();
        _travagens++;
    }
    
    @Override
    public void acelera() {
        super.acelera();
        _aceleracoes++;
    }

    public static void main(String[] args) {
        VeiculoPesado v1 = new VeiculoPesado("buggati");
        v1.trava();
        System.out.println(v1.obtemNumeroTravagens());
        v1.buzina();

    }
}
