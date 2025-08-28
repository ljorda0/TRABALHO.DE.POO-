package agencia.negocio;

public class Alienigena extends Heroi{
    private String planetaNatal;
    //Saber pq um alienigena esta no nosso planeta eh sempre importante :)
    private String causaDaVinda;

    public Alienigena(String nome, String habilidades, String sexo, int nivelAmeaca, int nivelPoder, String planetaNatal, String causaDaVinda){
        super(nome, habilidades, sexo, nivelAmeaca, nivelPoder);
        this.planetaNatal = planetaNatal;
        this.causaDaVinda = causaDaVinda;
    }

    public String getCausaDaVinda() {
        return causaDaVinda;
    }

    public void setCausaDaVinda(String causaDaVinda) {
        causaDaVinda = causaDaVinda;
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
                "\notivo de sua vinda a Terra: "+causaDaVinda;
    }

}
