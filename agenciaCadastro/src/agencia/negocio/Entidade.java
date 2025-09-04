package agencia.negocio;

public abstract class Entidade {

	
	// Atributos que todas as entidades tem
	protected String nome;
    protected String habilidades;
    protected String sexo;
    protected String cidade;
    protected int nivelPoder;
    
    public Entidade (String nome, String habilidades, String sexo, String cidade, int nivelPoder) {
        this.nome = nome;
        this.habilidades = habilidades;
        this.sexo = sexo;
        this.cidade = cidade;
        this.nivelPoder = nivelPoder;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
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
<<<<<<< Updated upstream

=======
	
>>>>>>> Stashed changes
    public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
<<<<<<< Updated upstream
	
	// Verifica se duas entidades são iguais (baseado no nome, habilidades e sexo)
	// Retorna true se as entidades forem iguais
=======
>>>>>>> Stashed changes

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
                "\nNivel de poder: "+nivelPoder;
    }
	
}
