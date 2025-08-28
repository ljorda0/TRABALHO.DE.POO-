package agencia.negocio;

public class PoderesVazioException extends RuntimeException{
    public PoderesVazioException(){
        super("Poderes do heroi nao pode ser vazio!");
    }
}
