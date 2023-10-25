package superNosso;

public class Venda {
    private ItemDeProduto[] produtos;
    private double precoTotal = 0.0;
    private int quantidade;
    private int limite;
    private int inseridos;

    public Venda() {
        this.limite = 30;
        this.produtos = new ItemDeProduto[limite];
        this.precoTotal = 0.0;
        this.quantidade = 0;
        this.inseridos = 0;
    }
    
    public Venda(ItemDeProduto[] produtos, int quantidade) {
        this.produtos = produtos;
        this.quantidade = quantidade;
    }
    

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getPrecoTotal() {
        return precoTotal;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public boolean addVenda(ItemDeProduto novo){
        if (inseridos < limite){
            produtos[inseridos] = novo;
            inseridos++;
            return true;
        }
        return false;
    }


    public double valorTotal(){
        precoTotal = 0.0;
        for(int i=0;i<inseridos;i++){
            precoTotal = precoTotal + (quantidade * (produtos[i].getProduto().getPreco())); 
        }

        return precoTotal;
        
    }


    

    
}
