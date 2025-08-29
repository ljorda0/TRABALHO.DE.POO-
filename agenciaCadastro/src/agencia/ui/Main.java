package agencia.ui;

import java.util.Scanner;

import agencia.negocio.Agencia;
import agencia.negocio.Alienigena;
import agencia.negocio.Ciborgue;
import agencia.negocio.Heroi;
import agencia.negocio.MetaHumano;
import agencia.negocio.Mutante;
import agencia.negocio.Vilao;
import agencia.negocio.Habilidade;

public class Main {
	private static final Scanner entrada = new Scanner(System.in);
	private static final Agencia agencia = new Agencia();
	
	public static void main(String args[]) {
		while (true) {
			System.out.println("\n=== Agencia Interplanetária (Somente cadastro)===");
			System.out.println("1) Cadastrar Herói");
			System.out.println ("2) Cadastrar Vilao");
			System.out.println ("3) Listar heóis ");
			System.out.println ("4) Listar viloes");
			System.out.println("4) Listar viloes");
			System.out.println ("0) sair");
			System.out.println ("Escolha: ");
			String op = entrada.nextLine().trim();
			
			try {
				switch (op) {
				case "1" -> cadastrarHeroi();
				case "2" -> cadastrarVilao();
				case "3" -> agencia.getHerois().forEach(System.out::println);
				case "4" -> agencia.getviloes().forEach(System.out::println);
				case "0" -> {System.out.println("Até mais!"); return; }
				default -> System.out.println("Opçao inválida!"); 
				}
			} catch (Exception e) {
				System.out.println(" Erro: "+ e.getMessage()); 
			}
		}
	}
	
	// ======CADASTRO DE HERÓI======
	private static void cadastrarHeroi() {
		System.out.print("Nome: "); String nome = entrada.nextLine();
		System.out.print("Tipo: "); String tipo = entrada.nextLine();
		System.out.print("Poder Principal: "); String poder = entrada.nextLine();
		System.out.print("Sexo: "); String sexo = entrada.nextLine();
		System.out.print("Nivel de poder (1 a 5): "); int nivelPoder = Integer.parseInt(entrada.nextLine());
		System.out.print("Nivel de Ameaça (0 a 5): "); int nivelAmeaca = Integer.parseInt(entrada.nextLine());
		String localidade;
		
		switch (tipo) {
		case "mutante" :
			System.out.print("Cidade: "); localidade = entrada.nextLine();
			System.out.print("Idade de descoberta dos poderes: "); int idadeDescobertaPoderes = entrada.nextInt();
			new Mutante(nome, poder, sexo, localidade, nivelAmeaca, nivelPoder, idadeDescobertaPoderes);
			break;
		case "alienigena" :
			System.out.print("Planeta natal: "); localidade = entrada.nextLine();
			System.out.print("Causa da vinda do alien: "); String causaVinda = entrada.nextLine();
			new Alienigena(nome, poder, sexo, localidade, nivelAmeaca, nivelPoder, causaVinda);
		case "ciborgue" :
			System.out.print("Cidade: "); localidade = entrada.nextLine();
			System.out.print("Partes modificadas do corpo do ciborgue: "); String partesModificadas = entrada.nextLine();
			new Ciborgue(nome, poder, sexo, localidade, nivelAmeaca, nivelPoder, partesModificadas);
			break;
		case "metaHumano" :
			System.out.print("Cidade: "); localidade = entrada.nextLine();
			System.out.print("Causa dos poderes do meta-humano"); String causaPoderes = entrada.nextLine();
			new MetaHumano(nome, poder, sexo, localidade, nivelAmeaca, nivelPoder, causaPoderes);	
			break;
	}
		
	while (true){
		System.out.print("Adicionar habilidade? (s/n): ");
		String resp = entrada.nextLine().trim().toLowerCase();
		if (!resp.equals("s")) break;
		
		System.out.print("Nome da habilidade: ");
		String nomeHab = entrada.nextLine();
		System.out.print("Dano (0 a 100): ");
		int dano = Integer.parseInt(entrada.nextLine());
		
		heroi.adicinarHabilidade(new habilidade(nomeHab, dano));
	}
	
	agencia.adicionarheroi(heroi);
	System.out.println("Herói cadastrado com sucesso: " + heroi);
	if (heroi.getNivelAmeaca() >= 2)
		System.out.println("Entrou na lista de monitoramento.");
	else
		System.out.println("Entrou na lista de pronto para missao");
	}
	
	
	///====== CADASTRO DE VILAO ======
	
	private static void cadastrarVilao() {
		System.out.println("=== Cadastro de Vilao ===");
		System.out.print("Nome: "); String nome = entrada.nextLine();
		System.out.print("Poder Principal: "); String poder = entrada.nextLine();
		System.out.print("Localidade: "); String localidade = entrada.nextLine();
		System.out.print("Fraqueza: "); String fraqueza = entrada.nextLine();
		System.out.print("Nivel de poder (1 a 5): "); int nivelPoder = Integer.parseInt(entrada.nextLine());
		System.out.print("Nivel de Ameaça (0 a 5): "); int nivelAmeaca = Integer.parseInt(entrada.nextLine());
		
		Vilao vilao = new vilao(nome, poder, localidade, fraqueza, nivelPoder nivelAmeaca);
		
	while (true) {
		System.out.print("Adicionar habilidade? (s/n): ");
		String resp = entrada.nextLine().trim().toLowerCase();
		if (!resp.equals("s")) break;
		
		System.out.print("Nome da habilidade: ");
		String nomeHab = entrada.nextLine();
		System.out.print("Dano (0 a 100): ");
		int dano = Integer.parseInt(entrada.nextLine());
		
		vilao.adicinarHabilidade(new habilidade(nomeHab, dano));
	}
		
	agencia.adicionarVilao(vilao);
	System.out.println("vilao cadastrado com sucesso: " + vilao);
	if (vilao.getNivelAmeaca() >= 3)
		System.out.println("Nivel de ameça alto - PERIGO.");
	}
	
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
