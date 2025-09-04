package agencia.fachada;

import agencia.negocio.Agencia;
import agencia.negocio.Heroi;
import agencia.negocio.Vilao;
import agencia.negocio.Alienigena;
import agencia.negocio.Ciborgue;
import agencia.negocio.MetaHumano;
import agencia.negocio.Mutante;
import agencia.negocio.MinigameHerois;
import agencia.negocio.Missao;
import java.util.List;
import java.util.ArrayList;

public class Fachada {
    private Agencia agencia = new Agencia();
    private List<Missao> missoes = new ArrayList<>();

    // Cadastrar herói com base no tipo
    public void cadastrarHeroi(String nome, String tipo, String cidade, String poder, String sexo, 
                               int nivelPoder, int nivelAmeaca, Object... args) {
        Heroi heroi = null;

        switch (tipo.toLowerCase()) {
            case "mutante":
                int idadePoderes = (int) args[0];
                heroi = new Mutante(nome, poder, sexo, cidade, nivelAmeaca, nivelPoder, idadePoderes);
                break;
            case "alienigena":
                String planetaNatal = (String) args[0];
                String causaVinda = (String) args[1];
                heroi = new Alienigena(nome, poder, sexo, cidade, nivelAmeaca, nivelPoder, causaVinda, planetaNatal);
                break;
            case "ciborgue":
                String modificacoes = (String) args[0];
                heroi = new Ciborgue(nome, poder, sexo, cidade, nivelAmeaca, nivelPoder, modificacoes);
                break;
            case "metahumano":
                String causaPoderes = (String) args[0];
                heroi = new MetaHumano(nome, poder, sexo, cidade, nivelAmeaca, nivelPoder, causaPoderes);
                break;
            default:
                throw new IllegalArgumentException("Tipo de herói inválido: " + tipo);
        }

        agencia.adicionarHeroi(heroi);
    }

    //Cadastrar vilão
    public void cadastrarVilao(String nome, String localidade, String poder, String sexo, int nivelPoder) {
        Vilao vilao = new Vilao(nome, poder, sexo, localidade, nivelPoder);
        agencia.adicionarVilao(vilao);
    }

    //Listar heróis
    public List<Heroi> listarHerois() {
        return agencia.getHerois();
    }

    //Listar viloes
    public List<Vilao> listarViloes() {
        return agencia.getViloes();
    }
    
    public void criarMissao(String nomeHeroi, String nomeVilao, String cidade) {
        Heroi heroi = buscarHeroiPorNome(nomeHeroi);
        Vilao vilao = buscarVilaoPorNome(nomeVilao);

        if (heroi == null) {
            throw new IllegalArgumentException("Herói não encontrado: " + nomeHeroi);
        }
        if (vilao == null) {
            throw new IllegalArgumentException("Vilão não encontrado: " + nomeVilao);
        }

        Missao missao = new Missao(heroi, vilao, cidade);
        missoes.add(missao);
        
        System.out.println("--- MISSÃO CRIADA ---");
        System.out.println(missao);
        System.out.println("---------------------");
        
        iniciarBatalhaMissao(heroi, vilao);
    }

    // Listar as missões
    public List<Missao> listarMissoes() {
        return missoes;
    }

    
    
    // Método privado para iniciar batalha na missão
    private void iniciarBatalhaMissao(Heroi heroi, Vilao vilao) {
        System.out.println("Iniciando batalha entre " + heroi.getNome() + " e " + vilao.getNome() + "!");
        
        // Usando o MinigameHerois para a batalha
        MinigameHerois jogo = new MinigameHerois(heroi, vilao);
        jogo.iniciar();
    }

    // Método auxiliar para buscar vilão pelo nome
    private Vilao buscarVilaoPorNome(String nome) {
        return agencia.getViloes().stream()
                .filter(v -> v.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    
    // Método auxiliar para buscar herói pelo nome
    private Heroi buscarHeroiPorNome(String nome) {
        return agencia.getHerois().stream()
                .filter(h -> h.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
