package agencia.negocio;

public class Alienigena extends Heroi{
    //Saber pq um alienigena esta no nosso planeta eh sempre importante
	//Herda da classe Heroi e adiciona o planeta natal do alien e o motivo da vinda pra terra
	private String planetaNatal;
    private String causaDaVinda;

    public Alienigena(String nome, String habilidades, String sexo, String cidade,int nivelAmeaca, int nivelPoder, String causaDaVinda,String planetaNatal){
        super(nome, habilidades, sexo, cidade, nivelAmeaca, nivelPoder);
        this.causaDaVinda = causaDaVinda;
        this.planetaNatal = planetaNatal;
    }

    public String getCausaDaVinda() {
        return causaDaVinda;
    }

    public void setCausaDaVinda(String causaDaVinda) {
        this.causaDaVinda = causaDaVinda;
    }

    public String getPlanetaNatal() {
        return planetaNatal;
    }

    public void setPlanetaNatal(String planetaNatal) {
        this.planetaNatal = planetaNatal;
    }
    @Override
    public String toString(){
        return super.toString() +
        		"\nPlaneta de origem: "+planetaNatal+
                "\nMotivo de sua vinda a Terra: "+causaDaVinda;
    }

}
