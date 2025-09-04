package agencia.negocio;

public class Ciborgue extends Heroi{
    // inserir quais partes do corpo foram modificadas ou o0s upgrades tecnologicos.
    private String modificacoes;
    
    public Ciborgue(String nome, String habilidades, String sexo, String cidade, int nivelAmeaca, int nivelPoder, String modificacoes) {
        super(nome, habilidades, sexo, cidade, nivelAmeaca, nivelPoder);
        this.modificacoes = modificacoes;
    }

    public String getModificacoes() {
        return modificacoes;
    }

    public void setModificacoes(String modificacoes) {
        this.modificacoes = modificacoes;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nModificacoes tecnologicas: "+modificacoes;
    }
}
