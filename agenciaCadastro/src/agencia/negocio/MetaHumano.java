package agencia.negocio;

public class MetaHumano extends Heroi{
	// Herda da classe Heroi
    // Meta-Humanos adquirem seus poderes apos o nascimento, acidente, picada de inseto radiotivo etc.
    private String causaPoderes;

    public MetaHumano(String nome, String habilidades, String sexo, String cidade, int nivelAmeaca, int nivelPoder, String causaPoderes) {
        super(nome, habilidades, sexo, cidade, nivelAmeaca, nivelPoder);
        validarString(causaPoderes, "causa dos poderes");
        this.causaPoderes = causaPoderes;
    }

    public String getCausaPoderes() {
        return causaPoderes;
    }

    public void setCausaPoderes(String causaPoderes) {
        this.causaPoderes = causaPoderes;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "\nCausa: " + causaPoderes;
    }
}

