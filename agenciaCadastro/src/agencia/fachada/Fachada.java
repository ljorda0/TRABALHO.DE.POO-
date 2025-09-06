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

    public AgenciaFachada(){
        this.agencia = new Agencia();
    }

    public void adicionarHeroi(Heroi heroi){
        agencia.adicionarHeroi(heroi);
    }

    public void adicionarVilao(Vilao vilao){
        agencia.adicionarVilao(vilao);
    }

    public void iniciarMissao(Heroi heroi, Vilao vilao){
        if(!(agencia.ListarHerois().contains(heroi))){
            throw new IllegalArgumentExeption("Heroi nao encontrado na agencia!");
        }
        if(!(agencia.ListarViloes().contains(vilao))){
            throw new IllegalArgumentException("Vilao nao encontrado na agencia!");
        }

        Missao missao = new  Missao(heroi, vilao, heroi.getCidade());
        System.out.println(missao);

        MinigameHerois minigame = new MinigameHerois(heroi, vilao);
        minigame.iniciar();
    }

}
