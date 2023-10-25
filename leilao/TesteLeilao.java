package leilao;

public class TesteLeilao {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Roberta", "38427984");
        Pessoa pessoa2 = new Pessoa("Claudio", "986859993");
        
        Lance lance1 = new Lance(pessoa1, 5000);
        Lance lance2 = new Lance(pessoa2, 30000);
        
        Produto barco = new Produto("Barco",lance1);
        Produto iate = new Produto("Iate",lance2);

        barco.verificarMaiorLance(lance2);

        System.out.println(" "+barco.getMaiorLance().getValor());

        Lote lote = new Lote();
        lote.addProduto(iate);

        Leilao leilao = new Leilao();
        leilao.addLote(lote);

        leilao.listarProdutos();


    }

    
}
