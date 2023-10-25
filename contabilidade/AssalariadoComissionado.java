package contabilidade;

public class AssalariadoComissionado extends Comissionado {
    private double percentualBonus;


    public AssalariadoComissionado(String nome, String sobrenome, int numIdentidade, double valorDeVendas,
            double percentualBonus) {
        super(nome, sobrenome, numIdentidade, valorDeVendas);
        this.percentualBonus = percentualBonus;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    public void setPercentualBonus(double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }

    public double getValorDeVendas() {
        return valorDeVendas;
    }

    public void setValorDeVendas(double valorDeVendas) {
        this.valorDeVendas = valorDeVendas;
    }

    


    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        
        return Passivo.SALARIO + (valorDeVendas*0.06)+ (Passivo.SALARIO*0.1);
    }

    


}
