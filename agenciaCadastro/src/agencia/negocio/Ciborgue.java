package agencia.negocio;

public class Ciborgue extends Heroi{
    private String cidade;
    // inserir quais partes do corpo foram modificadas ou o0s upgrades tecnologicos.
    private String modificacoes;
    public Ciborgue(String nome, String habilidades, String sexo, int nivelAmeaca, int nivelPoder, String cidade, String modificacoes) {
        super(nome, habilidades, sexo, nivelAmeaca, nivelPoder);
        this.cidade = cidade;
        this.modificacoes = modificacoes;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getModificacoes() {
        return modificacoes;
    }

    public void setModificacoes(String modificacoes) {
        this.modificacoes = modificacoes;
    }
    @Override
    public String toString(){
        return super.toString()
                +"\nCidade: "+cidade+
                "\nModificacoes tecnologicas: "+modificacoes;
    }
}
