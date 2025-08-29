package agencia.negocio;

public class Habilidade {
	private String nome;
	private int dano; //0..100
	
	public Habilidade(String nome, int dano) {
		this.nome = nome;
		this.dano = dano;
	}
	
	public String getNome() { return nome; } 
	public int getDano() { return dano;}
	
	public String toString() {
		return nome + " (" + dano + ")";
		
	}

}
