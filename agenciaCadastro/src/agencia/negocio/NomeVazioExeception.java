package agencia.negocio;

public class NomeVazioExeception extends RuntimeException{
    public NomeVazioExeception(){
        super("Nome do heroi nao pode ser vazio!");
    }
}
