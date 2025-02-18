/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaria.dominio;

/**
 * Classe responsável por reunir as informações do cliente com o pedido realizado pelo mesmo
 * @author Ana Luiza, Bianca Pacífico, Letícia Pires, Gabriel Pontes
 */

public class Pedido {
    
    private Cliente cliente;
    private Pizza[] pedidos;
    
    public Pedido(Cliente novoCliente, Pizza[] novoPedido){
        pedidos = novoPedido;
        cliente = novoCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pizza[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pizza[] pedidos) {
        this.pedidos = pedidos;
    }
    
}