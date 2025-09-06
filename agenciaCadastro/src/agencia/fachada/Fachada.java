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
    private Agencia agencia;

    public Fachada(){
        this.agencia = new Agencia();
    }

    public void cadastrarHeroi(Heroi heroi){
        agencia.adicionarHeroi(heroi);
    }

    public void cadastrarVilao(Vilao vilao){
        agencia.adicionarVilao(vilao);
    }

    public List<Heroi> listarHerois(){
        return agencia.listarHerois();
    }

    public void criarMissao(Heroi heroi, Vilao vilao){
        if(!(agencia.listarHerois().contains(heroi))){
            throw new IllegalArgumentException("Heroi nao encontrado na agencia!");
        }
        if(!(agencia.listarViloes().contains(vilao))){
            throw new IllegalArgumentException("Vilao nao encontrado na agencia!");
        }

        Missao missao = new  Missao(heroi, vilao, heroi.getCidade());
        System.out.println(missao);

        MinigameHerois minigame = new MinigameHerois(heroi, vilao);
        minigame.iniciar();
    }



}
