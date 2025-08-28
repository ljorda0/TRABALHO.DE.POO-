package agencia.negocio;

public class Mutante extends Heroi{
    private String cidade;
    //Mutante ja nasce com as devidas habilidades, mas eh importante saber quando os mesmos surgiram.
    private int idadePoderes;

    public Mutante(String nome, String habilidades, String sexo, int nivelAmeaca, int nivelPoder, String cidade, int idadePoderes){
        super(nome,  habilidades, sexo, nivelAmeaca, nivelPoder);
        this.cidade = cidade;
        this.idadePoderes = idadePoderes;
    }

    public int getIdadePoderes() {
        return idadePoderes;
    }

    public void setIdadePoderes(int idadePoderes) {
        this.idadePoderes = idadePoderes;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nCidade: "+cidade+
                "\nIdade do surgimento dos poderes: "+idadePoderes;
    }
}
