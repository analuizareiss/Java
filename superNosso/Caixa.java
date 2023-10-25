package superNosso;

import java.util.Scanner;

public class Caixa {
    public static void main(String[] args){
        
        int codigo = -1;
        int quantidade;
        double valorCompleto = 0.00;
        double valorProduto;
        
        Produto produto1 = new Produto(11111,"Detergente ABC",1);
        Produto produto2 = new Produto(22222,"Sabão em pó OMO",6.5);
        Produto produto3 = new Produto(33333,"Shampoo Beleza Fácil",12);
        Produto produto4 = new Produto(44444,"Creme dental Colgate",3.5);
        Produto produto5 = new Produto(55555,"Sabonete Nívea",1.8);
        Produto produto6 = new Produto(66666,"Biscoito Maizena",2);
        Produto produto7 = new Produto(77777,"Leite desnatado Parmalat",3);

        Estoque estoque = new Estoque();


        estoque.addItemDeProduto(new ItemDeProduto(produto1,90));
        estoque.addItemDeProduto(new ItemDeProduto(produto2,50));
        estoque.addItemDeProduto(new ItemDeProduto(produto3,37));
        estoque.addItemDeProduto(new ItemDeProduto(produto4,60));
        estoque.addItemDeProduto(new ItemDeProduto(produto5,90));
        estoque.addItemDeProduto(new ItemDeProduto(produto6,57));
        estoque.addItemDeProduto(new ItemDeProduto(produto7,38));


        System.out.println("Seja bem-vindo ao supermercado Super Nosso <3");
        System.out.println(" ");
        while(codigo !=0){
            Scanner input = new Scanner(System.in);
            System.out.print("Qual o código que deseja encontrar(Digite 0 se não desejar mais comprar): ");
            codigo = input.nextInt();
            if(estoque.buscarItemDeProduto(codigo)){
                System.out.print("Qual a quantidade que deseja comprar:");
                quantidade = input.nextInt();
                valorProduto = estoque.valorCompra(codigo,quantidade);
                valorCompleto += valorProduto;
                estoque.abaterQuantidade(codigo,quantidade);
                estoque.retirarDoEstoque(codigo);
                
            }          
        }
        
        System.out.println("O valor total a ser pago é R$"+valorCompleto);
        System.out.println("Agradecemos a preferência :) ");


        

    }
}
