package contabilidade;

public class Concessionaria extends Conta {
    
    public Concessionaria(){
        super(0,0,0);
    }

    public Concessionaria(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }
    

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return valor;
    }
    
    
}