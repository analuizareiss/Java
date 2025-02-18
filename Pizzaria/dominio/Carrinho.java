/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaria.dominio;

/**
 * Classe responsável por juntar o pedido de pizzas e calcular o valor total da compra
 * @author Ana Luiza, Bianca Pacífico, Letícia Pires, Gabriel Pontes
 */
public class Carrinho {
    
    private Pizza[] pedidos;
    private double valorTotal;
   
    public Carrinho(Pizza[] pedidos) {
        this.pedidos = pedidos;
        valorTotal = 0;
    }   
    
    public Pizza[] getPedidos() {
        return pedidos;
    }
    
    public void setPedidos(Pizza[] pedidos) {
        this.pedidos = pedidos;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
/**
 * método que calcula o valor do pedido
 * @param pedidos é um vetor de pizzas
 * @return valor total do pedido
 */  
    public double calculaValorTotal(Pizza[] pedidos){
        for(int i=0; i < pedidos.length;i++){
            if (pedidos[i]!=null){
                valorTotal += pedidos[i].getValor();
            }
        }
        
        return valorTotal;
    }
}