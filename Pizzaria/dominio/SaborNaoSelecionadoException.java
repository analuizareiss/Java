/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaria.dominio;

/**
 * Classe responsável por lançar uma exceção quando o cliente não seleciona o sabor desejado de pizza
 * @author Ana Luiza, Bianca Pacífico, Letícia Pires, Gabriel Pontes
 */
public class SaborNaoSelecionadoException extends Exception {
     public  SaborNaoSelecionadoException() {
            super("Selecione o sabor!!");
        }
    
        public  SaborNaoSelecionadoException(String mensagem) {
            super(mensagem);
        }
}
