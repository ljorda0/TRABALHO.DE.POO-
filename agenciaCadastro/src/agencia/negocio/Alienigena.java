package agencia.negocio;

public class Alienigena extends Heroi{
    //Saber pq um alienigena esta no nosso planeta eh sempre importante
    private String causaDaVinda;

    public Alienigena(String nome, String habilidades, String sexo, String planetaNatal,int nivelAmeaca, int nivelPoder, String causaDaVinda){
        super(nome, habilidades, sexo, planetaNatal, nivelAmeaca, nivelPoder);
        this.causaDaVinda = causaDaVinda;
    }

    public String getCausaDaVinda() {
        return causaDaVinda;
    }

    public void setCausaDaVinda(String causaDaVinda) {
        this.causaDaVinda = causaDaVinda;
    }

    public String getPlanetaNatal() {
        return localidade;
    }

    public void setPlanetaNatal(String planetaNatal) {
        this.localidade = planetaNatal;
    }
    @Override
    public String toString(){
        return super.toString() +
                "\nPlaneta de origem: "+localidade+
                "\notivo de sua vinda a Terra: "+causaDaVinda;
    }

}
