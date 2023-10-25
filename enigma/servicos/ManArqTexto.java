
package servicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;


public class ManArqTexto {
    
    public static ArrayList<String> abreLerFecha(String nomeArquivo){
       ArrayList<String> retorno = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File(nomeArquivo));
            while(input.hasNext()){
                String linha = input.nextLine();
                retorno.add(linha);
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
       return retorno;
    }
    
    public static void abreGravaFecha(String nomeArquivo, ArrayList<String> dados){
        try {
            Formatter gravador = new Formatter(nomeArquivo);
            for(String linha : dados){
                gravador.format("%s\n", linha);
            }
            gravador.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
