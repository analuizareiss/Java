package agenda.negocio;


import java.io.*;
import java.util.HashMap;

public class Agenda {
    private HashMap<String,Contato> contatos;

    public Agenda(HashMap<String, Contato> contatos) {
        this.contatos = contatos;
    }

    public HashMap<String, Contato> getContatos() {
        return contatos;
    }

    public void setContatos(HashMap<String, Contato> contatos) {
        this.contatos = contatos;
    }

    public boolean addContato(String nome,Contato novo){
        contatos.put(nome,novo);
        
        return true;
    }

    public boolean existeContato(String nome){
        if(contatos.containsKey(nome)){
            return true;
        }else{   
            return false;
        }
    }

    public Contato consultarContato(String nome){
        if(existeContato(nome)){
            return contatos.get(nome);
        }else{
            try {
                throw new ContatoInexistenteException("Contato não encontrado: " + nome);
            } catch (ContatoInexistenteException erro) {
                erro.printStackTrace();
                return null;
            } 
        }

    }

    public void removerContato(String nome){
        contatos.remove(nome);
    }

    public void persistirAgenda(){
        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("agendaPessoal.txt"))) {
            obj.writeObject(contatos);
        } catch (IOException erro) {
            erro.printStackTrace();
        }

    }
    
    public void lerAgenda(){
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("agendaPessoal.txt"))) {
            contatos = (HashMap<String, Contato>) input.readObject();
        } catch (IOException | ClassNotFoundException erro) {
            erro.printStackTrace();
        }
    }

    

}
