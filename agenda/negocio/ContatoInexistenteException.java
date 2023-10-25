package agenda.negocio;

public class ContatoInexistenteException extends Exception {
        public ContatoInexistenteException() {
            super("Contato não encontrado na agenda.");
        }
    
        public ContatoInexistenteException(String mensagem) {
            super(mensagem);
        }
}
    
 