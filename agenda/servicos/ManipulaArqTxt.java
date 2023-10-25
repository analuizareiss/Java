package agenda.servicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

import agenda.negocio.Contato;

public class ManipulaArqTxt {
    public String arquivo;
    public Formatter gravador;
    public Scanner leitor;
    
    
    public ManipulaArqTxt(String arquivo, Formatter gravador, Scanner leitor) {
        this.arquivo = arquivo;
        this.gravador = gravador;
        this.leitor = leitor;
    }
    public String getArquivo() {
        return arquivo;
    }
    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
    public Formatter getGravador() {
        return gravador;
    }
    public void setGravador(Formatter gravador) {
        this.gravador = gravador;
    }
    public Scanner getLeitor() {
        return leitor;
    }
    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }
    
    public void abrirArquivoGravacao() {
        try {
            gravador = new Formatter(arquivo);
            gravador.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void gravarContato(Contato contato) {
        try {
            gravador = new Formatter(new FileWriter(arquivo, true)); // Abre o arquivo em modo de anexação
            gravador.format("%s, %s, %s, %s%n", contato.getNome(), contato.getEndereco(), contato.getTelefone(), contato.getEmail());
            gravador.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fechaArquivoGravacao(){
        if(gravador != null){
            gravador.close();
        }
    }

    public void abreArquivoLeitura() throws FileNotFoundException{
        gravador = new Formatter(arquivo);
        gravador.close();
    }
    
    public ArrayList<Contato> lerArquivo() throws FileNotFoundException{
        ArrayList<Contato> contatos = new ArrayList<>();
        leitor = new Scanner(new File(arquivo));
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            String[] partes = linha.split(", ");
            if (partes.length == 4) {
                Contato contato = new Contato(partes[0], partes[1], partes[2], partes[3]);
                contatos.add(contato);
            }
        }
        
        return contatos;
    }

    public void fechaAquivoLeitura(){
        if(leitor != null){
            leitor.close();
        }
    }
    
}
