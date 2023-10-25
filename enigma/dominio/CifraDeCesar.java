
package dominio;

import java.util.ArrayList;

public class CifraDeCesar {
    private Chave chave;
    
    public CifraDeCesar(){
        this.chave = new Chave(3);
    }

    public String cifrar(String mensagem){
        StringBuilder fraseCifrada = new StringBuilder();
        String[] palavras = mensagem.split(" ");

        for (int j = 0; j < palavras.length; j++) {
            String[] letras = palavras[j].split("");
            ArrayList<String> retorno = new ArrayList<>();

            for (int i = 0; i < letras.length; i++) {
                retorno.addAll(chave.cifraLetra(letras[i]));
            }

            String palavraN = String.join("", retorno);
            fraseCifrada.append(palavraN);

            if (j < palavras.length - 1) {
                fraseCifrada.append(" ");
            }
        }

        return fraseCifrada.toString();
        /*String fraseCifrada = null;
        String palavraN;
        ArrayList<String> juntaRetorno = new ArrayList<>();
        ArrayList<String> retorno = new ArrayList<>();
        String[] palavras = mensagem.split(" ");

        for(int j = 0;j <palavras.length;j++){
            String letras[] = palavras[j].split("");
            System.out.println(" "+letras);
            for(int i=0;i<letras.length;i++){  
                retorno.addAll(chave.cifraLetra(letras[i]));
                System.out.println(" "+retorno);
                palavraN = String.join("",retorno);
            }
            juntaRetorno.add(palavraN);
            
        }
         fraseCifrada = String.join(" ",juntaRetorno);
        return fraseCifrada;*/
    }

    public String decifrar(String mensagem)throws DecifragemInvalidaException {
        StringBuilder fraseDecifrada = new StringBuilder();
        String[] palavras = mensagem.split(" ");
        boolean decifrou = false;

        for (int j = 0; j < palavras.length; j++) {
            String[] letras = palavras[j].split("");
            ArrayList<String> retorno = new ArrayList<>();

            for (int i = 0; i < letras.length; i++) {
                retorno.addAll(chave.decifraLetra(letras[i]));

            }

            String palavraN = String.join("", retorno);
            fraseDecifrada.append(palavraN);

            if (j < palavras.length - 1) {
                fraseDecifrada.append(" ");
                decifrou = true;
            }
        }

        if (!decifrou){
            throw new DecifragemInvalidaException();
        }
        return fraseDecifrada.toString();
    }

}
