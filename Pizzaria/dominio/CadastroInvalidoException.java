/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaria.dominio;

/**
 * Responsável por lançar a exceção quando o cliente não realiza o cadastro da forma correta
 * @author Ana Luiza, Bianca Pacífico, Letícia Pires, Gabriel Pontes
 */
public class CadastroInvalidoException extends Exception {
     public  CadastroInvalidoException() {
            super("Cadastro Inválido!! Espaços não preenchidos ou erro ao salvar.");
        }
    
        public  CadastroInvalidoException(String mensagem) {
            super(mensagem);
        }
}