package agencia.negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agencia {
	// Para armazenar heroi e vilao
	private final List<Heroi> herois = new ArrayList<>();
	private final List<Vilao> viloes = new ArrayList<>();
	
	
	// Add um heroi a agencia com validaçoes, usa a IllegalArgumentException se ja tiver um heroi com esse nome
	public void adicionarHeroi(Heroi h) {
		if (h == null) throw new IllegalArgumentException("Herói invalidao.");
		// Vê se ja tem heroi com esse nome, ignorando letras maiusculas/minusculas
		boolean duplicado = herois.stream()
				.anyMatch(x -> x.getNome().equalsIgnoreCase(h.getNome()));
		if (duplicado) throw new IllegalArgumentException("Já existe herói com esse nome.");
		herois.add(h);
	}
	
	// Add um vilao a agencia com validaçoes, usa a IllegalArgumentException se ja tiver um vilao com esse nome
	public void adicionarVilao(Vilao v) {
		if (v == null) throw new IllegalArgumentException("Vilão invalidao.");
		// Vê se ja tem vilao com esse nome, ignorando letras maiusculas/minusculas
		boolean duplicado = viloes.stream()
				.anyMatch(x -> x.getNome().equalsIgnoreCase(v.getNome()));
		if (duplicado) throw new IllegalArgumentException("Já existe Vilão com esse nome.");
		viloes.add(v);
	}
	
	
	//Retorna uma lista de heróis, apenas para leitura
	public List<Heroi> getHerois() {
		return Collections.unmodifiableList(herois);
	}
	
	//Retorna a lista de vilões, também apenas para leitura
	public List<Vilao> getViloes() {
		return Collections.unmodifiableList(viloes);
	}
	
}
