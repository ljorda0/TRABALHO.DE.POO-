package agencia.negocio;

// Exceção para nome vazio, é lançada quando um herói com nome vazio é criado
public class NomeVazioExeception extends RuntimeException{
    public NomeVazioExeception(){
        super("Nome do heroi nao pode ser vazio!");
    }
}
