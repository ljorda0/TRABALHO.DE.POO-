package agencia.negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agencia {
	private final List<Heroi> herois = new ArrayList<>();
	private final List<Vilao> viloes = new ArrayList<>();
	
	public void adicionarHeroi(Heroi h) {
		if (h == null) throw new IllegalArgumentException("Herói invalidao.");
		boolean duplicado = herois.stream()
				.anyMatch(x -> x.getNome().equalsIgnoreCase(h.getNome()));
		if (duplicado) throw new IllegalArgumentException("Já existe herói com esse nome.");
		herois.add(h);
		
	}
	
	public void adicionarVilao(Vilao v) {
		if (v == null) throw new IllegalArgumentException("Vilão invalidao.");
		boolean duplicado = viloes.stream()
				.anyMatch(x -> x.getNome().equalsIgnoreCase(v.getNome()));
		if (duplicado) throw new IllegalArgumentException("Já existe Vilão com esse nome.");
		viloes.add(v);
	}
	
	public List<Heroi> getHerois(){
		return Collections.unmodifiableList(herois);
	}
	
	public List<Vilao> getviloes(){
		return Collections.unmodifiableList(viloes);
	
		}
	
	}
