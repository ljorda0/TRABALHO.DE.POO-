package agencia.negocio;

public class StringVaziaException extends RuntimeException {

	public StringVaziaException(String nomeCampo) {
		super("O campo '" + nomeCampo + "' não pode ser vazio!");
	}
	
	
	public StringVaziaException() {
		super("O campo não pode ser vazio.");
	}
}
