package agencia.negocio;

import java.util.ArrayList;
import java.util.List;

public class Vilao {

	private String nome;
	private String poderPrincipal;
	private String localidade;
	private String fraqueza;
	private int nivelPoder; // 1..5
	private int nivelAmeaca; // 0..5
	private List<Habilidade> habilidades = new ArrayList<>(); 
	
	public Vilao(String nome, String poderPrincipal, String localidade, String fraqueza, int nivelPoder, int nivelAmeaca) {
		this.nome = nome;
		this.poderPrincipal = poderPrincipal;
		this.localidade = localidade;
		this.fraqueza = fraqueza;
		this.nivelPoder = nivelPoder;
		this.nivelAmeaca = nivelAmeaca;
	}

	public String getNome() {return nome;}
	public int getNivelAmeaca() {return nivelAmeaca;}
	public void adicionarHabilidade(Habilidade hab) { if (hab != null) habilidades.add(hab);}
	
	public String toString() {
		return "vilao" + nome + "[" + poderPrincipal +"] - nivel" + nivelPoder + ", Ameaca " + nivelAmeaca + ", localidade " + localidade + ", habs: " + habilidades;	
	}
	
}

