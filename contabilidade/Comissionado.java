package contabilidade;

public class Comissionado extends Empregado{
    protected double valorDeVendas;

    public Comissionado(String nome, String sobrenome, int numIdentidade, double valorDeVendas) {
        super(nome, sobrenome, numIdentidade);
        this.valorDeVendas = valorDeVendas;
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return valorDeVendas * 0.06;
    }

    public double getValorDeVendas() {
        return valorDeVendas;
    }

    public void setValorDeVendas(double valorDeVendas) {
        this.valorDeVendas = valorDeVendas;
    }


    
}