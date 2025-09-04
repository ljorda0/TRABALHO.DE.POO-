package agencia.negocio;

public class Heroi extends Entidade{
	protected int nivelAmeaca;

    public Heroi(String nome, String habilidades, String sexo, String cidade, int nivelAmeaca, int nivelPoder) {
        super (nome, habilidades, sexo, cidade, nivelPoder);
        this.nivelAmeaca = nivelAmeaca;
    }

    public int getNivelAmeaca() {
        return nivelAmeaca;
    }

    public void setNivelAmeaca(int nivelAmeaca) {
        this.nivelAmeaca = nivelAmeaca;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == this){return true;}
        if(!(obj instanceof Heroi h)){return false;}
        return nome.equals(h.nome) &&
               habilidades.equals(h.habilidades) &&
               sexo.equals(h.sexo);
    }

    @Override
    public String toString(){
        return super.toString()+
                "\nNivel de ameaca: "+nivelAmeaca;
    }
}
