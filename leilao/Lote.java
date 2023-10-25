package leilao;

public class Lote {
    private Produto[] produtos;
    private int limite;
    private int inseridos;

    public Lote(){
        limite = 30;
        inseridos = 0;
        produtos = new Produto[limite]; 
    }
    
    public Lote(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public boolean addProduto(Produto novo){
        if (inseridos < limite){
            produtos[inseridos] = novo;
            inseridos++;
            return true;
        }
        return false;        
    }
    
}
