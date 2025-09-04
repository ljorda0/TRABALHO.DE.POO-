package agencia.negocio;

public class Mutante extends Heroi{
	// Herda da classe Heroi e adiciona informações sobre em que idade surgiram os poderes.
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

    @Override
    public String toString(){
        return super.toString() +
                "\nIdade do surgimento dos poderes: "+idadePoderes;
    }
}
