package agencia.negocio;

public class MetaHumano extends Heroi{
    private String cidade;
    //Meta-Humanos adquirem seus poderes apos o nascimento, acidente, picada de inseto radiotivo etc.
    private String causaPoderes;

    public MetaHumano(String nome, String habilidades, String sexo, int nivelAmeaca, int nivelPoder, String cidade, String causaPoderes) {
        super(nome, habilidades, sexo, nivelAmeaca, nivelPoder);
        this.cidade = cidade;
        this.causaPoderes = causaPoderes;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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
                "\nCidade: " + cidade +
                "\nCausa: " + causaPoderes;
    }
}

