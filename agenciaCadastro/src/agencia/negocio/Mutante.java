package agencia.negocio;

public class Mutante extends Heroi{
    //Mutante ja nasce com as devidas habilidades, mas eh importante saber quando os mesmos surgiram.
    private int idadePoderes;

    public Mutante(String nome, String habilidades, String sexo, String cidade, int nivelAmeaca, int nivelPoder, int idadePoderes){
        super(nome,  habilidades, sexo, cidade, nivelAmeaca, nivelPoder);
        this.idadePoderes = idadePoderes;
    }

    public int getIdadePoderes() {
        return idadePoderes;
    }

    public void setIdadePoderes(int idadePoderes) {
        this.idadePoderes = idadePoderes;
    }

    public String getCidade() {
        return localidade;
    }

    public void setCidade(String cidade) {
        this.localidade = cidade;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nCidade: "+localidade+
                "\nIdade do surgimento dos poderes: "+idadePoderes;
    }
}
