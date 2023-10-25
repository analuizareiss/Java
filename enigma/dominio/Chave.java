
package dominio;

import java.util.ArrayList;

public class Chave {
    private int deslocamento;
    private String[] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public Chave(int deslocamento) {
        this.deslocamento = deslocamento;
    }
    
    public int getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(int deslocamento) {
        this.deslocamento = deslocamento;
    }

    public String[] getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String[] alfabeto) {
        this.alfabeto = alfabeto;
    }
    
    public ArrayList<String> cifraLetra(String letra){
        ArrayList<String> retorno = new ArrayList<>();
        for(int i=0;i<alfabeto.length;i++){
            if (letra.equalsIgnoreCase(alfabeto[i])){
                retorno.add(alfabeto[(i+deslocamento) % alfabeto.length]);
                
            }
        }
        return retorno;
    }

    public ArrayList<String> decifraLetra(String letra){
        ArrayList<String> retorno = new ArrayList<>();
        for(int i=0;i<alfabeto.length;i++){
            if (letra.equals(alfabeto[i])){
                int potencia = ((i-deslocamento) % alfabeto.length);
                if(potencia<0){
                    potencia += deslocamento;
                }
                retorno.add(alfabeto[potencia]);
            }
        }
        return retorno;
    }
    
    
    
}
