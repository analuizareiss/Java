package agenda.visao;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import agenda.negocio.*;
import agenda.servicos.*;

public class AppAgenda {    
    public static void main(String[] args) throws FileNotFoundException{
        ManipulaArqTxt manipulador = new ManipulaArqTxt("agendaPessoal.txt", null, null);

        // Abrir arquivo para gravação (ou recriar o arquivo)
        manipulador.abrirArquivoGravacao();

        // Gravar contatos no arquivo
        Contato contato1 = new Contato("kanye West", "999999999", "kanye@gmail.com", "Av.Amazonas - 101");
        Contato contato2 = new Contato("Taylor Swift", "988888888", "Taylor@gmail.com", "Av.Amazonas - 103");
        manipulador.gravarContato(contato1);
        manipulador.gravarContato(contato2);

        // Ler contatos do arquivo
        ArrayList<Contato> contatosLidos = manipulador.lerArquivo();
        for (Contato contato : contatosLidos) {
            System.out.println("Contato lido: " + contato.getNome());
        }
    }

}
