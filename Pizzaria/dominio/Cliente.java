/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaria.dominio;

/**
 * Classe responsável por reunir as informações do cliente que está realizando o pedido da pizza
 * @author Ana Luiza, Bianca Pacífico, Letícia Pires, Gabriel Pontes
 */
public class Cliente {
       private String nome;
       private String contato;
       private String rua;
       private String numero;
       private String bairro;
       private String senha;
    
        public Cliente(){
            nome = " ";
            contato = " ";
            bairro = " ";
            numero = " ";
            rua = " ";
            senha = " ";
        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getContato(){
            return contato;
        }

        public void setContato(String contato){
            this.contato = contato;
        }

        public String getRua(){
            return rua;
        }

        public void setRua(String rua){
            this.rua = rua;
        }

        public String getNumero(){
            return numero;
        }

        public void setNumero(String numero){
            this.numero = numero;
        }

        public String getBairro(){
            return bairro;
        }

        public void setBairro(String bairro){
            this.bairro = bairro;
        }

        public String getSenha(){
            return senha;
        }

        public void setSenha(String senha){
            this.senha = senha;
        }
        
/**
 *
 * método que retorna o endereço completo do cliente
 * @return endereço
 */
        public String getEndereco(){
        return "Endereço: " + rua + numero+"," + bairro;
    }
}
