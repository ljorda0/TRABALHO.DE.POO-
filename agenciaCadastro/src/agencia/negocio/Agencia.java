package agencia.negocio;

import agencia.dados.SalvarHeroiCSV;
import agencia.dados.SalvarVilaoCSV;

import java.util.Collections;
import java.util.List;

public class Agencia {
    private final SalvarHeroiCSV salvarHeroi = new SalvarHeroiCSV();
    private final SalvarVilaoCSV salvarVilao = new SalvarVilaoCSV();

    // Add um herói e salva em CSV
    public void adicionarHeroi(Heroi h) {
        if (h == null) throw new IllegalArgumentException("Herói inválido.");

        boolean duplicado = listarHerois().stream()
                .anyMatch(x -> x.getNome().equalsIgnoreCase(h.getNome()));
        if (duplicado) throw new IllegalArgumentException("Já existe herói com esse nome.");

        salvarHeroi.inserirHeroi(h);
    }

    // Add um vilão e salva em CSV
    public void adicionarVilao(Vilao v) {
        if (v == null) throw new IllegalArgumentException("Vilão inválido.");

        boolean duplicado = listarViloes().stream()
                .anyMatch(x -> x.getNome().equalsIgnoreCase(v.getNome()));
        if (duplicado) throw new IllegalArgumentException("Já existe vilão com esse nome.");

        salvarVilao.inserirVilao(v);
    }

    // Retorna a lista de heróis carregada do CSV
    public List<Heroi> listarHerois() {
        return Collections.unmodifiableList(salvarHeroi.lerHeroi());
    }

    // Retorna a lista de vilões carregada do CSV
    public List<Vilao> listarViloes() {
        return Collections.unmodifiableList(salvarVilao.lerVilao());
    }
}
