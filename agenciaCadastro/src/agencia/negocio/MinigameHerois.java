package agencia.negocio;

import java.util.Random;
import java.util.Scanner;

	// Gerencia o minigame de batalha entre um heroi e um vilao implementando um sistema simples de turno.

public class MinigameHerois {
    private Heroi h;
    private Vilao v;
    private int vidaH;
    private int vidaV;
    private boolean defendendoH = false;
    private boolean defendendoV = false;

    public MinigameHerois(Heroi h, Vilao v) {
        this.h = h;
        this.v = v;
        // Pontos de vida baseado no nível de poder do personagem.
        this.vidaH = h.getNivelPoder() * 20;
        this.vidaV = v.getNivelPoder() * 20;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Batalha entre " + h.getNome() + " e " + v.getNome() + "!");

        while (vidaH > 0 && vidaV > 0) {
            System.out.println("\n--- STATUS ---");
            System.out.println(h.getNome() + ": " + vidaH + " HP");
            System.out.println(v.getNome() + ": " + vidaV + " HP");

            // Turno do herói
            System.out.println("\nTurno de " + h.getNome());
            System.out.println("1 - Atacar\n2 - Defender\n3 - Descansar");
            int acao1 = sc.nextInt();

            // Turno do vião
            int acao2 = rand.nextInt(3) + 1; // CPU joga aleatório
            System.out.println("Oponente escolheu a opção " + acao2);

            processarAcoes(acao1, acao2);
        }

        // Resultado final da batalha, quem tiver com a vida <= 0, o outro ganha.
        if (vidaH <= 0 && vidaV <= 0) {
            System.out.println("Empate! Ambos caíram!");
        } else if (vidaH <= 0) {
            System.out.println(v.getNome() + " venceu!");
        } else {
            System.out.println(h.getNome() + " venceu!");
        }
    }

    
    //Aqui processa as ações escolhidas pelo jogador e pela CPU (1 - Atacar, 2 - Defender, 3 - Descansar / Recuperar vida)
    private void processarAcoes(int acao1, int acao2) {
        // Ações do heroi
        if (acao1 == 1) { // Atacar
            int dano = h.getNivelPoder() * 2;
            if (defendendoV) { // Se o vilão tava defendendo, reduz o dano causado pelo herói
                dano /= 2;
                defendendoV = false;
            }
            vidaV -= dano;
            System.out.println(h.getNome() + " atacou causando " + dano + " de dano!");
        } else if (acao1 == 2) { // Defender
            defendendoH = true;
            System.out.println(h.getNome() + " está defendendo!");
        } else if (acao1 == 3) { // Descansar / Healar
            int cura = h.getNivelPoder() * 2;
            vidaH = Math.min(vidaH + cura, h.getNivelPoder() * 20); // Aqui impede de ultrapassar o maximo de vida quando descansando e recuperando HP
            System.out.println(h.getNome() + " descansou e recuperou " + cura + " de vida!");
        }

        // Ações do vilão
        if (acao2 == 1) { // Atacar 
            int dano = v.getNivelPoder() * 2;
            if (defendendoH) { // Se o heroi tava defendendo, reduz o dano causado pelo vilão
                dano /= 2;
                defendendoH = false;
            }
            vidaH -= dano;
            System.out.println(v.getNome() + " atacou causando " + dano + " de dano!");
        } else if (acao2 == 2) { // Defender
            defendendoV = true;
            System.out.println(v.getNome() + " está defendendo!");
        } else if (acao2 == 3) { // Descansar / Healar
            int cura = v.getNivelPoder() * 2;
            vidaV = Math.min(vidaV + cura, v.getNivelPoder() * 20); // Aqui impede de ultrapassar o maximo de vida quando descansando e recuperando HP
            System.out.println(v.getNome() + " descansou e recuperou " + cura + " de vida!");
        }
    }
}
