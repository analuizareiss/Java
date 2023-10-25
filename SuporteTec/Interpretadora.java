package SuporteTec;

import java.util.HashSet;

public class Interpretadora {
    private HashSet<String> palavrasChave;


    public Interpretadora() {
        palavrasChave = new HashSet<>();
    }

    public HashSet<String> getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(HashSet<String> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public void separarPalavras(String frase){
        String[] palavras = frase.split(" ");
        for(String guardaPalavras : palavras){
            palavrasChave.add(guardaPalavras);
        }

    }

    
}

