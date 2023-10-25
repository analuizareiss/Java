package leilao;

public class Leilao {
    private Lote[] lote;
    private int limite;
    private int inseridos;
    
    public Leilao(){
        limite = 30;
        inseridos =0;
        lote = new Lote[limite];
    }
    
    public Leilao(Lote[] lote) {
        this.lote = lote;
    }
    public Lote[] getLote() {
        return lote;
    }
    public void setLote(Lote[] lote) {
        this.lote = lote;
    }
    public int getLimite() {
        return limite;
    }
    public void setLimite(int limite) {
        this.limite = limite;
    }

    public boolean addLote(Lote novoLote){
        if (inseridos < limite){
            lote[inseridos] = novoLote;
            inseridos++;
            return true;
        }
        return false;
    }

    public boolean receberLance(int numLot,String descricaoProduto, Lance lance){
        for(int i=0; i<lote.length ;i++){
            for(int j=0;j<lote[i].getProdutos().length;i++){
                if(lote[i].getProdutos()[j].getDescricao().equalsIgnoreCase(descricaoProduto)){
                    if(lote[i].getProdutos()[j].verificarMaiorLance(lance)){
                        System.out.println("Lance finalizado com sucesso. :) ");
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public boolean listarProdutos(){
        System.out.println("Os produtos dispiníveis são: ");
        for(int i=0;i<lote.length;i++){
            for(int j=0;j<lote[i].getProdutos().length;j++){
                System.out.print("O produto : "+lote[i].getProdutos()[j].getDescricao() + ".");
                System.out.println(" Com lance atual de:"+lote[i].getProdutos()[j].getMaiorLance().getValor());
            }
        }
        return false;
    }
    
}
