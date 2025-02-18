/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaria.servico;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import pizzaria.dominio.Pedido;

/**
 * 
 * Classe responsável por manipular o arquivo texto dos pedidos
 * @author Ana Luiza, Bianca Pacífico, Letícia Pires, Gabriel Pontes
 */
public class ManArqTxt {
      public String arquivo;
      public Formatter gravador;
        
    
    public ManArqTxt(String arquivo, Formatter gravador) {
        this.arquivo = arquivo;
        this.gravador = gravador;
       
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
   
    
    public void abrirArquivoGravacao() {
        try {
            gravador = new Formatter(arquivo);
            gravador.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void gravarPedido(Pedido pedido) {
        try {
            gravador = new Formatter(new FileWriter(arquivo, true)); // Abre o arquivo em modo de anexação
            gravador.format("%s, %s, %s%n", pedido.getCliente().getNome(), pedido.getCliente().getEndereco(),pedido.getCliente().getContato());
            if (pedido.getPedidos()[0]!=null){
                 gravador.format("%s%n",pedido.getPedidos()[0].getInfo());
            }
            if (pedido.getPedidos()[1] !=null){
               gravador.format("%s%n",pedido.getPedidos()[1].getInfo());
             }
            if (pedido.getPedidos()[2]!=null){
                gravador.format(" %s%n",pedido.getPedidos()[2].getInfo());
            }
            if (pedido.getPedidos()[3]!=null){
                gravador.format(" %s%n",pedido.getPedidos()[3].getInfo());
             }
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

 
}
