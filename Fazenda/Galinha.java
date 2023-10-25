package Fazenda;

public class Galinha {
    private String nome;
    private String corPena;
    private int ovos;
    private double consumo;
    
    public Galinha(){
        nome = " ";
        corPena = " ";
        ovos = 0;
        consumo = 0;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCorPena(String corPena){
        this.corPena = corPena;
    }
    public void setOvos(int ovos){
        this.ovos = ovos;
    }
    public void setConsumo(double consumo){
        this.consumo = consumo;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCorPena(){
        return corPena;
    }
    public int getOvos(){
        return ovos;
    }
    public double getConsumo(){
        return consumo;
    }
    /*public Galinha(String nome,String corPena,int ovos,double consumo){
        this.nome = nome;
        this.corPena = corPena;
        this.ovos = ovos;
        this.consumo = consumo;
    }*/
}
