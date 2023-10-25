package contabilidade;

public interface Passivo{
    public static final double SALARIO =  1320;
    public static final double HORA = 65;
    
    public abstract double getValorAPagar(int diaPagto, int mesPagto);



}