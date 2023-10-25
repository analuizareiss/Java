package superNosso;

import java.util.Scanner;
//import java.util.ArrayList;


public class Estoque {
    private ItemDeProduto[] estante;
    private int inseridos;
    private int limite;



    public Estoque(ItemDeProduto[] estante) {
        this.estante = estante;
    }

    public void setEstante(ItemDeProduto[] estante) {
        this.estante = estante;
    }
    public ItemDeProduto[] getEstante() {
        return estante;
    }
    
   /*public void setVenda(Venda venda){
        this.venda = venda;
    }

    public Venda getVenda(){
        return venda;
    }*/


    public Estoque() {
        this.limite = 30;
        this.inseridos = 0;
        this.estante = new ItemDeProduto[limite];
    }


    
    public boolean addItemDeProduto(ItemDeProduto novo){
        if (inseridos < limite){
            estante[inseridos] = novo;
            inseridos++;
            return true;
        }
        return false;
    }

    public boolean buscarItemDeProduto (int codigo){

            for(int i=0;i<inseridos;i++){
                if(codigo == estante[i].getProduto().getCodigo()){
                    return true;
                }
            }

            return false;
    }
    
    public double valorCompra(int codigo,int quantidade){
        Venda venda = new Venda();
        for(int i=0;i<estante.length;i++){
                if(codigo == estante[i].getProduto().getCodigo()){
                    venda.addVenda(estante[i]);
                    venda.setQuantidade(quantidade);
                    
                    return venda.valorTotal();
                }
        }
        
        return 0;
    }

    public boolean abaterQuantidade(int codigo,int quantidade){
        for(int i=0;i<inseridos;i++){
            if(codigo == estante[i].getProduto().getCodigo()){
                estante[i].setQuantidade(estante[i].getQuantidade() - quantidade);
            }
        }
        return false;
    }

    public boolean retirarDoEstoque(int codigo){
        for(int i=0;i<inseridos;i++){
            if(codigo == estante[i].getProduto().getCodigo()){
                if(estante[i].getQuantidade() == 0){
                    estante[i] = estante[i+1];
                    inseridos--;
                }
            }
        }
        return false;
    }


}


    
