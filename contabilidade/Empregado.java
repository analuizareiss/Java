package contabilidade;

public abstract class Empregado implements Passivo{
    protected String nome;
    protected String sobrenome;
    protected int numIdentidade;

    public Empregado(String nome, String sobrenome, int numIdentidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numIdentidade = numIdentidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumIdentidade() {
        return numIdentidade;
    }

    public void setNumIdentidade(int numIdentidade) {
        this.numIdentidade = numIdentidade;
    }
    
    
    
}