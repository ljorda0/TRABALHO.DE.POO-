package agencia.negocio;

// Exceção para poder vazio, é lançada quando um heroi é criado com poder vazio.
public class PoderesVazioException extends RuntimeException{
    public PoderesVazioException(){
        super("Poderes do heroi nao pode ser vazio!");
    }
}
