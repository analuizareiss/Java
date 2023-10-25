package superNosso;

public class ItemDeProduto {
    private Produto produto;
    private int quantidade;
    private double precoTotal;

    public ItemDeProduto(){
        produto = new Produto();
        quantidade = 0;
        precoTotal = 0;
    }

    public ItemDeProduto(Produto produto,int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }
    
    
    
}
