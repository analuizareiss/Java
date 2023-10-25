package contabilidade;

public class Assalariado extends Empregado {
    
    private double horasExtras;

    public Assalariado(String nome, String sobrenome, int numIdentidade, double horasExtras) {
        super(nome, sobrenome, numIdentidade);
        this.horasExtras = horasExtras;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
    
    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return Passivo.SALARIO + (horasExtras * Passivo.HORA);
    }
    
}
