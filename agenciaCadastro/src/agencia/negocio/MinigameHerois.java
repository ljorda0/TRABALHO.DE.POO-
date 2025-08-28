import java.util.Random;
import java.util.Scanner;

public class minigameHerois {
    private heroi h1;
    private heroi h2;
    private int vidaH1;
    private int vidaH2;
    private boolean defendendoH1 = false;
    private boolean defendendoH2 = false;

    public minigameHerois(heroi h1, heroi h2) {
        this.h1 = h1;
        this.h2 = h2;
        this.vidaH1 = h1.getNivelPoder() * 20;
        this.vidaH2 = h2.getNivelPoder() * 20;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Batalha entre " + h1.getNome() + " e " + h2.getNome() + "!");

        while (vidaH1 > 0 && vidaH2 > 0) {
            System.out.println("\n--- STATUS ---");
            System.out.println(h1.getNome() + ": " + vidaH1 + " HP");
            System.out.println(h2.getNome() + ": " + vidaH2 + " HP");

            // Turno do jogador 1
            System.out.println("\nTurno de " + h1.getNome());
            System.out.println("1 - Atacar\n2 - Defender\n3 - Descansar");
            int acao1 = sc.nextInt();

            // Turno do jogador 2
            int acao2 = rand.nextInt(3) + 1; // CPU joga aleatório
            System.out.println("Oponente escolheu a opção " + acao2);

            processarAcoes(acao1, acao2);
        }

        if (vidaH1 <= 0 && vidaH2 <= 0) {
            System.out.println("Empate! Ambos caíram!");
        } else if (vidaH1 <= 0) {
            System.out.println(h2.getNome() + " venceu!");
        } else {
            System.out.println(h1.getNome() + " venceu!");
        }
    }

    private void processarAcoes(int acao1, int acao2) {
        // Jogador 1
        if (acao1 == 1) { // Atacar
            int dano = h1.getNivelPoder() * 2;
            if (defendendoH2) {
                dano /= 2;
                defendendoH2 = false;
            }
            vidaH2 -= dano;
            System.out.println(h1.getNome() + " atacou causando " + dano + " de dano!");
        } else if (acao1 == 2) { // Defender
            defendendoH1 = true;
            System.out.println(h1.getNome() + " está defendendo!");
        } else if (acao1 == 3) { // Descansar / Healar
            int cura = h1.getNivelPoder() * 2;
            vidaH1 = Math.min(vidaH1 + cura, h1.getNivelPoder() * 10);
            System.out.println(h1.getNome() + " descansou e recuperou " + cura + " de vida!");
        }

        // Jogador 2
        if (acao2 == 1) { // Atacar 
            int dano = h2.getNivelPoder() * 2;
            if (defendendoH1) {
                dano /= 2;
                defendendoH1 = false;
            }
            vidaH1 -= dano;
            System.out.println(h2.getNome() + " atacou causando " + dano + " de dano!");
        } else if (acao2 == 2) { // Defender
            defendendoH2 = true;
            System.out.println(h2.getNome() + " está defendendo!");
        } else if (acao2 == 3) { // Descansar / Healar
            int cura = h2.getNivelPoder() * 2;
            vidaH2 = Math.min(vidaH2 + cura, h2.getNivelPoder() * 10);
            System.out.println(h2.getNome() + " descansou e recuperou " + cura + " de vida!");
        }
    }
}
