package agencia.negocio;

import agencia.dados.SalvarHeroiCSV;
import agencia.dados.SalvarVilaoCSV;
import java.util.Collections;
import java.util.List;

public class Agencia {
    private final SalvarHeroiCSV salvarHeroi = new SalvarHeroiCSV();
    private final SalvarVilaoCSV salvarVilao = new SalvarVilaoCSV();

    // Add um herói e salva em CSV
    public void adicionarHeroi(String nome,  String tipo, String cidade, String poder, String sexo, int nivelPoder, int nivelAmeaca, Object... args) {
    	
    	Heroi h;
    	switch (tipo.toLowerCase()) {
	        case "mutante":
	            int idadePoderes = (int) args[0];
	            h = new Mutante(nome, poder, sexo, cidade, nivelAmeaca, nivelPoder, idadePoderes);
	            break;
	        case "alienigena":
	            String planetaNatal = (String) args[0];
	            String causaVinda = (String) args[1];
	            h = new Alienigena(nome, poder, sexo, cidade, nivelAmeaca, nivelPoder, causaVinda, planetaNatal);
	            break;
	        case "ciborgue":
	            String modificacoes = (String) args[0];
	            h = new Ciborgue(nome, poder, sexo, cidade, nivelAmeaca, nivelPoder, modificacoes);
	            break;
	        case "metahumano":
	            String causaPoderes = (String) args[0];
	            h = new MetaHumano(nome, poder, sexo, cidade, nivelAmeaca, nivelPoder, causaPoderes);
	            break;
	        default:
	            throw new IllegalArgumentException("Tipo de herói inválido: " + tipo);
    	}
    	
        if (h == null) throw new IllegalArgumentException("Herói inválido.");

        boolean duplicado = listarHerois().stream()
                .anyMatch(x -> x.getNome().equalsIgnoreCase(h.getNome()));
        if (duplicado) throw new IllegalArgumentException("Já existe herói com esse nome.");

        salvarHeroi.inserirHeroi(h);
    }

    // Add um vilão e salva em CSV
    public void adicionarVilao(String nome, String cidade, String poder, String sexo, int nivelPoder) {
    	Vilao v = new Vilao(nome, cidade, poder, sexo, nivelPoder);
    	
        if (v == null) throw new IllegalArgumentException("Vilão inválido.");

        boolean duplicado = listarViloes().stream()
                .anyMatch(x -> x.getNome().equalsIgnoreCase(v.getNome()));
        if (duplicado) throw new IllegalArgumentException("Já existe vilão com esse nome.");

        salvarVilao.inserirVilao(v);
    }

    // Retorna a lista de heróis carregada do CSV
    public List<Heroi> listarHerois() {
    	try {
        return Collections.unmodifiableList(salvarHeroi.lerHeroi());
    }	catch (Exception e) {
    	throw new RuntimeException("Erro ao carregar herói: " + e.getMessage(), e);
    }
}

    // Retorna a lista de vilões carregada do CSV
    public List<Vilao> listarViloes() {
        try {
            return Collections.unmodifiableList(salvarVilao.lerVilao());
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar vilão: " + e.getMessage(), e);
        }
    }
    
    public void criarMissao(String nomeHeroi, String nomeVilao){
    	
    	Heroi heroi = buscarHeroiPorNome(nomeHeroi);
    	Vilao vilao = buscarVilaoPorNome(nomeVilao);
    	
        if(!(listarHerois().contains(heroi))){
            throw new IllegalArgumentException("Heroi nao encontrado na agencia!");
        }
        if(!(listarViloes().contains(vilao))){
            throw new IllegalArgumentException("Vilao nao encontrado na agencia!");
        }

        Missao missao = new  Missao(heroi, vilao, heroi.getCidade());
        System.out.println(missao);

        MinigameHerois minigame = new MinigameHerois(heroi, vilao);
        minigame.iniciar();
    }
    
    
    
    private Vilao buscarVilaoPorNome(String nome) {
        return listarViloes().stream()
                .filter(v -> v.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    
    // Método auxiliar para buscar herói pelo nome
    private Heroi buscarHeroiPorNome(String nome) {
        return listarHerois().stream()
               .filter(h -> h.getNome().equalsIgnoreCase(nome))
               .findFirst()
               .orElse(null);
    }
    
}