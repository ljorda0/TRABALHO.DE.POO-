package agencia.negocio;


// Essa classe herda de Entidade e adiciona o nivel de poder do heroi.
public class Heroi extends Entidade{
	protected int nivelAmeaca;

    public Heroi(String nome, String habilidades, String sexo, String cidade, int nivelAmeaca, int nivelPoder) {
        super (nome, habilidades, sexo, cidade, nivelPoder);
        
        if (nivelAmeaca < 0 || nivelAmeaca > 5) { // Validar o nivel de ameaça
        	throw new IllegalArgumentException("Nivel de ameaça deve estar entre 0 e 5");
        }
        if (nivelPoder < 1 || nivelPoder > 5) { // Validar o nivel de poder
        	throw new IllegalArgumentException("Nivel de poder deve estar entre 1 e 5");
        }
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
