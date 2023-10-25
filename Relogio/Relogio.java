package Relogio;

public class Relogio {
    private Contador hora;
    private Contador minuto;
    private String displayFormato;
    /*private Contador hora12h;
    private Contador minuto12h;*/
    private boolean formato24h;

    public Relogio() {
        hora = new Contador(0, 24);
        minuto = new Contador(0, 60);
    }
    public Relogio(Contador hora,Contador minuto,boolean formato24h){
        this.hora = hora;
        this.minuto = minuto;
        this.formato24h = formato24h;
    }

    public void setHora(Contador hora) {
        this.hora = hora;
    }

    public Contador getHora() {
        return hora;
    }

    public void setMinuto(Contador minuto) {
        this.minuto = minuto;
    }

    public Contador getMinuto() {
        return minuto;
    }

    public void setDisplayFormato(String displayFormato) {
        this.displayFormato = displayFormato;
    }
    public String getDisplayFormato() {
        return displayFormato;
    }
    public void setFormato24h(boolean formato24h) {
        this.formato24h = formato24h;
    }
    public boolean getFormato24h() {
        return formato24h;
    }


    public void ticTac() {
        minuto.contar();
        if (minuto.getValor() == 0) {
            hora.contar();
        }
    }

    public void atualizaDisplay(){  
        hora = new Contador(0, 13);
        minuto = new Contador(0, 60);
    }
    public void atualizaDisplay2(){  
        hora = new Contador(1, 12);
        minuto = new Contador(0, 60);
    }




}
