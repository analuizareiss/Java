
package dominio;


public class DecifragemInvalidaException extends Exception{
    public DecifragemInvalidaException(){
        super("Não está correta a decifragem feita!");
    }
    public DecifragemInvalidaException(String mensagem) {
        super(mensagem);
    }
}

