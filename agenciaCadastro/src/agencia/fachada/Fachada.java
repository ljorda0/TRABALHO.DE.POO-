package agencia.fachada;

import agencia.negocio.Agencia;
import agencia.negocio.Heroi;
import agencia.negocio.Vilao;
import agencia.negocio.MinigameHerois;
import agencia.negocio.Missao;
import java.util.List;

public class Fachada {
    private Agencia agencia;

    public Fachada(){
        this.agencia = new Agencia();
    }

    public void cadastrarHeroi(String nome,  String tipo, String cidade, String poder, String sexo, 
            int nivelPoder, int nivelAmeaca, Object... args){
        agencia.adicionarHeroi(nome, tipo, cidade, poder, sexo, nivelPoder, nivelAmeaca, args);
    }

    public void cadastrarVilao(String nome, String cidade, String poder, String sexo, int nivelPoder){
        agencia.adicionarVilao(nome, cidade, poder, sexo, nivelPoder);
    }

    public List<Heroi> listarHerois(){
        return agencia.listarHerois();
    }
    
    public List<Vilao> listarViloes(){
        return agencia.listarViloes();
    }

    public void criarMissao(String nomeHeroi, String nomeVilao){
        agencia.criarMissao(nomeHeroi, nomeVilao);
    }



}
