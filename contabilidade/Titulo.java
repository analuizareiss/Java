package contabilidade;

public class Titulo extends Conta {

    public Titulo(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        if (((diaPagto > diaVencimento) && (mesPagto == mesVencimento)) ||
            ((mesPagto > mesVencimento))){
            valor += valor*0.1;
        }
        return valor;
    }
    
}