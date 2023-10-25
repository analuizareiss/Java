package contabilidade;

public abstract class Conta implements Passivo{
    protected int diaVencimento;
    protected int mesVencimento;
    protected double valor;

    public Conta(int dia, int mes, double valor) {
        this.diaVencimento = dia;
        this.mesVencimento = mes;
        this.valor = valor;
    }
    
    public int getDia() {
        return diaVencimento;
    }

    public void setDia(int dia) {
        this.diaVencimento = dia;
    }

    public int getMes() {
        return mesVencimento;
    }

    public void setMes(int mes) {
        this.mesVencimento = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}