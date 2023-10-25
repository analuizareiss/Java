package leilao;

public class Produto {
    private String descricao;
    private Lance maiorLance;
    
    
    public Produto(){
        descricao = " ";
        maiorLance = new Lance();
    }

    public Produto(String descricao, Lance maiorLance) {
        this.descricao = descricao;
        this.maiorLance = maiorLance;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lance getMaiorLance() {
        return maiorLance;
    }

    public void setMaiorLance(Lance maiorLance) {
        this.maiorLance = maiorLance;
    }

    public boolean verificarMaiorLance(Lance novoLance){
        if(novoLance.getValor() > maiorLance.getValor()){
            maiorLance.setValor(novoLance.getValor());
            maiorLance.setPessoa(novoLance.getPessoa());
            return true;
        }

        return false;
    }
    

    
}
