package agencia.negocio;

public class Heroi {
    protected String nome;
    protected String habilidades;
    protected String sexo;
    protected String cidade;
	protected int nivelAmeaca;
    protected int nivelPoder;

    public Heroi(String nome, String habilidades, String sexo, String cidade, int nivelAmeaca, int nivelPoder) {
        this.nome = nome;
        this.habilidades = habilidades;
        this.sexo = sexo;
        this.cidade = cidade;
        this.nivelAmeaca = nivelAmeaca;
        this.nivelPoder = nivelPoder;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public int getNivelAmeaca() {
        return nivelAmeaca;
    }

    public void setNivelAmeaca(int nivelAmeaca) {
        this.nivelAmeaca = nivelAmeaca;
    }
    
    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }
    
    public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
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
        return "Nome: "+nome+
               "\nHabilidades: "+habilidades+
               "\nSexo: "+sexo+
               "\nCidade: "+cidade+
               "\nNivel de ameaca: "+nivelAmeaca+
                "\nNivel de poder: "+nivelPoder;
    }
}
