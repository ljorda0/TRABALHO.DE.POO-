package agencia.negocio;

public class MetaHumano extends Heroi{
    //Meta-Humanos adquirem seus poderes apos o nascimento, acidente, picada de inseto radiotivo etc.
    private String causaPoderes;

    public MetaHumano(String nome, String habilidades, String sexo, String cidade, int nivelAmeaca, int nivelPoder, String causaPoderes) {
        super(nome, habilidades, sexo, cidade, nivelAmeaca, nivelPoder);
        this.causaPoderes = causaPoderes;
    }

    public String getCidade() {
        return localidade;
    }

    public void setCidade(String cidade) {
        this.localidade = cidade;
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
                "\nCidade: " + localidade +
                "\nCausa: " + causaPoderes;
    }
}

