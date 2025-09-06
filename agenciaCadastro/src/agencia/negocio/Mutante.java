package agencia.negocio;

public class Mutante extends Heroi{
	// Herda da classe Heroi e adiciona informações sobre em que idade surgiram os poderes.
    //Mutante ja nasce com as devidas habilidades, mas eh importante saber quando os mesmos surgiram.
    private int idadePoderes;

    public Mutante(String nome, String habilidades, String sexo, String cidade, int nivelAmeaca, int nivelPoder, int idadePoderes){
        super(nome,  habilidades, sexo, cidade, nivelAmeaca, nivelPoder);
        if (idadePoderes < 0) { // Validação da idade de poder adquirido
        	throw new IllegalArgumentException("A idade em que os poderes foram adquiridos não pode ser menor que 0! E ganhou poder antes de nascer foi?");
        }
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
