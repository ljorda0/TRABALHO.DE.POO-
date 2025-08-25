package agencia;

import agencia.heroi;
import agencia.vilao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cadastro {
	private final List<heroi> herois = new ArrayList<>();
	private final List<vilao> viloes = new ArrayList<>();
	
	public void adicionarHeroi(heroi h) {
		if (h == null) throw new illegalArgumentException("Herói invalidao.");
		boolean duplicado = herois.steam()
				.anyMatch(x -> x.getNome().equalsIgnoreCase(h.getNome()));
		if (duplicado) throw new IllegalArgumentException("Já existe herói com esse nome.");
		herois.add(h);
		
	}
	
	public void adicionarVilao(vilao v) {
		if (v == null) throw new illegalArgumentException("Vilão invalidao.");
		boolean duplicado = viloes.steam()
				.anyMatch(x -> x.getNome().equalsIgnoreCase(h.getNome()));
		if (duplicado) throw new IllegalArgumentException("Já existe Vilão com esse nome.");
		viloes.add(h);
	}
	
	public List<heroi> getHerois(){
		return Collections.unmodifiableList(herois);
	}
	
	public List<vilao> getviloes(){
		return Collections.unmodifiableList(viloes);
	
		}
	
	}
