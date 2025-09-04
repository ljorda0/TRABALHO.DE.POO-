package agencia.negocio;


// Essa classe herda de Entidade e adiciona o nivel de poder do heroi.
public class Heroi extends Entidade{
	protected int nivelAmeaca;

    public Heroi(String nome, String habilidades, String sexo, String cidade, int nivelAmeaca, int nivelPoder) {
        super (nome, habilidades, sexo, cidade, nivelPoder);
        this.nivelAmeaca = nivelAmeaca; // Ameaça do heroi, vai de 0 a 5.
    }

    public int getNivelAmeaca() {
        return nivelAmeaca;
    }

    public void setNivelAmeaca(int nivelAmeaca) {
        this.nivelAmeaca = nivelAmeaca;
    }
    
    
    
    // Aqui verifica se dois herois são iguais, retorna true se eles forem iguais.
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
