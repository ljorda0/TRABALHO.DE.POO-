package agencia.negocio;

public class Heroi {
    protected String nome;
    protected String habilidades;
    protected String sexo;
    protected String localidade;
    protected int nivelAmeaca;
    protected int nivelPoder;

    public Heroi(String nome, String habilidades, String sexo, String localidade, int nivelAmeaca, int nivelPoder) {
        this.nome = nome;
        this.habilidades = habilidades;
        this.sexo = sexo;
        this.localidade = localidade;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public void setNome(String nome) {
        this.nome = nome;
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
               "\nSexo:  "+sexo+
               "\nNivel de ameaca: "+nivelAmeaca+
                "\nNivel de poder: "+nivelPoder;
    }
}
