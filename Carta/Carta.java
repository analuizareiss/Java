package Carta;

public class Carta {
    private String naipe;
    private int valor;

    public Carta(){
        naipe = " ";
        valor = 0;
    }
    public void setNaipe(String naipe){
        this.naipe = naipe;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    public String getNaipe(){
        return naipe;
    }
    public int getValor(){
        return valor;
    }
    public Carta(int valor,String naipe){
        this.valor = valor;
        this.naipe = naipe;
    }
    public int compararValor(Carta outraCarta){
        if(this.valor > outraCarta.valor){
            return 1;
        }else if(this.valor == outraCarta.valor){
            return 0;
        }else{
            return -1;
        }
    }

    public boolean mesmoNaipe(Carta outraCarta){
        return this.naipe.equals(outraCarta.naipe);
    }


}
