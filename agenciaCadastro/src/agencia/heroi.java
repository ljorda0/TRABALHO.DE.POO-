package agencia;

import java.util.ArrayList;
import java.util.List;

public abstract class heroi {
	public String nome;
	public String poderPrincipal;
	public String localidade;
	public String fraqueza;
	public int nivelPoder;  // 1..5
	public int nivelAmeaca; // 0..5
	public List<habilidade> habilidades = new ArrayList<>();
	
	public heroi (String nome, String poderPrincipal, String localidade, String fraqueza, int nivelPoder, int nivelAmeaca) {
		this.nome = nome;
		this.poderPrincipal = poderPrincipal;
		this.localidade = localidade;
		this.fraqueza = fraqueza;
		this.nivelPoder = nivelPoder;
		this.nivelAmeaca = nivelAmeaca;
	}
	
	public String getNome() {return nome;}
	public String getPoderPrincipal() {return poderPrincipal ;}
	public String getLocalidade() {return localidade;}
	public String getFraqueza() {return fraqueza;}
	public int getNivelPoder() {return nivelPoder;}
	public int getNivelAmeaca() {return nivelAmeaca;}
	
	public void adicinarHabilidade(habilidade hab) {
		if (hab != null) habilidades.add(hab);
	}
	
	public List<habilidade> gethabilidade(){ return habilidades; }
	
	public String toString() {
		return "heroi" + nome + "[" + poderPrincipal + "] - Nivel" + nivelPoder + ", Ameaca " + nivelAmeaca + ",  Localidade " + localidade + ", Habs: " + habilidades;
				
	}
	
}
