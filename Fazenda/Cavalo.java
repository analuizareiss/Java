package Fazenda;
public class Cavalo {
    private String nome;
    private String corPelo;
    private String galope;
    private double consumo;
    
    public Cavalo(){
        nome = " ";
        corPelo = " ";
        galope = " ";
        consumo = 0;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }
    public void setGalope(String galope){
        this.galope = galope;
    }
    public void setConsumo(double consumo){
        this.consumo = consumo;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCorPelo(){
        return corPelo;
    }
    public String getGalope(){
        return galope;
    }
    public double getConsumo(){
        return consumo;
    }

}

