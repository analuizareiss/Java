/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaria.dominio;

/**
 *Classe responsável por lançar uma exceção quando o cliente não seleciona o tamanho desejado de pizza
 * @author Ana Luiza, Bianca Pacífico, Letícia Pires, Gabriel Pontes
 */
public class TamanhoNaoSelecionadoException extends Exception {
    public TamanhoNaoSelecionadoException() {
            super("Selecione o Tamanho!!");
        }
    
        public TamanhoNaoSelecionadoException(String mensagem) {
            super(mensagem);
        }
}
