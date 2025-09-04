package agencia.ui;

import java.util.Scanner;
import agencia.fachada.Fachada;
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
	private static final Fachada fachada = new Fachada();
	
	public static void main(String args[]) {
		while (true) {
			
			System.out.println("\n=== Agencia Interplanetária (Somente cadastro)===");
			System.out.println("1) Cadastrar Herói");
			System.out.println ("2) Cadastrar Vilao");
			System.out.println ("3) Listar Heróis");
			System.out.println ("4) Listar Vilões");
			System.out.println ("5) Fazer Missão");
			System.out.println ("0) sair");
			System.out.println ("Escolha: ");
			String op = entrada.nextLine().trim();
			
			try {
				switch (op) {
					case "1" -> cadastrarHeroi();
					case "2" -> cadastrarVilao();
					case "3" -> {
						fachada.listarHerois().forEach(System.out::println);
						System.out.println("\nPressione ENTER para continuar...");
						entrada.nextLine();
					}
					case "4" -> {
						fachada.listarViloes().forEach(System.out::println);
						System.out.println("\nPressione ENTER para continuar...");
						entrada.nextLine();
					}
					case "0" -> {System.out.println("Até mais!"); return; }
					default -> System.out.println("Opçao inválida!");
				}
				
			} catch (Exception e) {
				System.out.println(" Erro: "+ e.getMessage()); 
			}
		}
	}
	
	//Cadastro HERÓI
	
	private static void cadastrarHeroi() {
		System.out.println("=== Cadastro de Heroi ===");
		System.out.print("Nome: "); String nome = entrada.nextLine();
		System.out.print("Tipo: "); String tipo = entrada.nextLine();
		System.out.print("Cidade: "); String cidade = entrada.nextLine();
		System.out.print("Poder Principal: "); String poder = entrada.nextLine();
		System.out.print("Sexo: "); String sexo = entrada.nextLine();
		System.out.print("Nivel de poder (1 a 5): "); int nivelPoder = Integer.parseInt(entrada.nextLine());
		System.out.print("Nivel de Ameaça (0 a 5): "); int nivelAmeaca = Integer.parseInt(entrada.nextLine());
		
		//modificações nas clases de heróis
		switch (tipo.toLowerCase()) {
		    case "mutante": 
		        System.out.print("Idade de descoberta dos poderes: ");
		        int idadeDescobertaPoderes = Integer.parseInt(entrada.nextLine());
		        fachada.cadastrarHeroi(nome, tipo, cidade, poder, sexo, nivelPoder, nivelAmeaca, idadeDescobertaPoderes);
		        break;
		    case "alienigena": 
		        System.out.print("Planeta natal: "); String planetaNatal = entrada.nextLine();
		        System.out.print("Causa da vinda do alien: "); String causaVinda = entrada.nextLine();
		        fachada.cadastrarHeroi(nome, tipo, cidade, poder, sexo, nivelPoder, nivelAmeaca, planetaNatal, causaVinda);
		        break;
		    case "ciborgue": 
		        System.out.print("Partes modificadas do corpo do ciborgue: "); String partesModificadas = entrada.nextLine();
		        fachada.cadastrarHeroi(nome, tipo, cidade, poder, sexo, nivelPoder, nivelAmeaca, partesModificadas);
		        break;
		    case "metahumano": 
		        System.out.print("Causa dos poderes do meta-humano: "); String causaPoderes = entrada.nextLine();
		        fachada.cadastrarHeroi(nome, tipo, cidade, poder, sexo, nivelPoder, nivelAmeaca, causaPoderes);
		        break;
		}

		
		
	}
	
	//Cadastro VILÃO
	
	private static void cadastrarVilao() {
		System.out.println("=== Cadastro de Vilao ===");
		System.out.print("Nome: "); String nome = entrada.nextLine();
		System.out.print("Cidade: "); String localidade = entrada.nextLine();
		System.out.print("Poder Principal: "); String poder = entrada.nextLine();
		System.out.print("Sexo: "); String sexo = entrada.nextLine();
		System.out.print("Nivel de poder (1 a 5): "); int nivelPoder = Integer.parseInt(entrada.nextLine());
		 		
		fachada.cadastrarVilao(nome, localidade, poder, sexo, nivelPoder);
		System.out.println("Vilão cadastrado com sucesso: ");
		
	}
	
}
