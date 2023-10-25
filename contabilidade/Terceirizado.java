package contabilidade;

public class Terceirizado extends Empregado{
    private double horasTrabalhadas;

    public Terceirizado(String nome, String sobrenome, int numIdentidade, double horasTrabalhadas) {
        super(nome, sobrenome, numIdentidade);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        
        return horasTrabalhadas * Passivo.HORA;
    }
    


}