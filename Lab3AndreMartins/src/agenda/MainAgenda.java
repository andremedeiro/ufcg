package agenda;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Interface com menus texto para manipular uma agenda de contatos.
 * 
 * @author nazarenoandrade e Andr� Martins
 *
 */
public class MainAgenda {
	
	/**
	 * Inicia o c�digo
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		System.out.println("Carregando agenda inicial");
		try {
			/*
			 * Essa � a maneira de lidar com poss�veis erros por falta do arquivo. 
			 */
			carregaAgenda("agenda_inicial.csv", agenda);
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo n�o encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Erro lendo arquivo: " + e.getMessage());
		}

		Scanner scanner = new Scanner(System.in);
		String escolha = "";
		while (true) {
			escolha = menu(scanner);
			comando(escolha, agenda, scanner);
		}

	}

	/**
	 * Exibe o menu e captura a escolha do/a usu�rio/a.
	 * 
	 * @param scanner Para captura da op��o do usu�rio.
	 * @return O comando escolhido.
	 */
	private static String menu(Scanner scanner) {
		System.out.print("\n(C)adastrar Contato\n" + 
						"(L)istar Contatos\n" + 
						"(E)xibir Contato\n" + 
						"(T)elefones preferidos\n" + 
						"(Z)aps\n" + 
						"(S)air\n" + 
						"\n" + 
						"Op��o> ");
		return scanner.next().toUpperCase();
	}

	/**
	 * Interpreta a op��o escolhida por quem est� usando o sistema.
	 * 
	 * @param opcao   Op��o digitada.
	 * @param agenda  A agenda que estamos manipulando.
	 * @param scanner Objeto scanner para o caso do comando precisar de mais input.
	 */
	private static void comando(String opcao, Agenda agenda, Scanner scanner) {
		switch (opcao) {
		case "C":
			cadastraContato(agenda, scanner);
			break;
		case "L":
			listaContatos(agenda);
			break;
		case "E":
			exibeContato(agenda, scanner);
			break;
		case "T":
			listaPrioritarios(agenda);
			break;
		case "Z":
			listaZaps(agenda);
			break;
		case "S":
			sai();
			break;
		default:
			System.out.println("Op��o inv�lida!");
		}
	}

	/**
	 * Imprime lista de contatos da agenda.
	 * 
	 * @param agenda A agenda sendo manipulada.
	 */
	private static void listaContatos(Agenda agenda) {
		System.out.println("\nLista de contatos: ");
		String[] contatos = agenda.getContatos();
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				System.out.println(contatos[i]);
			}
		}
	}
	
	/**
	 * Imprime os telefones priorit�rios.
	 * 
	 * @param agenda A agenda sendo manipulada.
	 */
	private static void listaPrioritarios(Agenda agenda) {
		System.out.println("");
		String[] contatos = agenda.prioritarios();
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				System.out.println(contatos[i]);
			}
		}
	}
	
	/**
	 * Imprime os telefones de whatsapp.
	 * 
	 * @param agenda A agenda sendo manipulada.
	 */
	private static void listaZaps(Agenda agenda) {
		System.out.println("");
		String[] contatos = agenda.zaps();
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				System.out.println(contatos[i]);
			}
		}
	}

	/**
	 * Imprime os detalhes de um dos contatos da agenda. 
	 * 
	 * @param agenda A agenda.
	 * @param scanner Scanner para capturar qual contato.
	 */
	private static void exibeContato(Agenda agenda, Scanner scanner) {
		System.out.print("Contato> ");
		int posicao = scanner.nextInt();
		
		if(posicao < 1 || posicao > 100) {
			System.out.println("\nPOSI��O INV�LIDA!");
		} else {
			String contato = agenda.getContato(posicao);
			if(contato != null) {
				System.out.println("\n" + contato);
			} else System.out.println("NENHUM CONTATO NESTA POSI��O!");
		}
	}


	/**
	 * Cadastra um contato na agenda. 
	 * 
	 * @param agenda A agenda.
	 * @param scanner Scanner para pedir informa��es do contato.
	 */
	private static void cadastraContato(Agenda agenda, Scanner scanner) {
		System.out.print("\nPosi��o na agenda> ");
		int posicao = scanner.nextInt();
		scanner.nextLine();
		
		if(posicao < 1 || posicao > 100) {
			System.out.println("\nPOSI��O INV�LIDA!");
		} else {
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			if (nome == null || nome.equals("") || nome.trim().length() == 0) {
				System.out.println("\nNOME INV�LIDO!");
			} else {
				System.out.print("Sobrenome: ");
				String sobrenome = scanner.nextLine();
				System.out.print("Telefone1: ");
				String telefone1 = scanner.nextLine();
				System.out.print("Telefone2: ");
				String telefone2 = scanner.nextLine();
				System.out.print("Telefone3: ");
				String telefone3 = scanner.nextLine();
				System.out.print("Telefone priorit�rio: ");
				int telefone_priorit�rio = scanner.nextInt();
				System.out.print("Contato Whatsapp: ");
				int numero_zap = scanner.nextInt();
				agenda.cadastraContato(posicao, nome, sobrenome, telefone1, telefone2, telefone3, telefone_priorit�rio, numero_zap);
				System.out.println("CADASTRO REALIZADO");
			}
		}
	}

	/**
	 * Sai da aplica��o.
	 */
	private static void sai() {
		System.exit(0);
	}

	/**
	 * L� uma agenda de um arquivo csv. 
	 * 
	 * @param arquivoContatos O caminho para o arquivo.
	 * @param agenda A agenda que deve ser populada com os dados. 
	 * @throws IOException Caso o arquivo n�o exista ou n�o possa ser lido.
	 */
	private static void carregaAgenda(String arquivoContatos, Agenda agenda) throws FileNotFoundException, IOException {
		LeitorDeAgenda leitor = new LeitorDeAgenda();
		
		int carregados =  leitor.carregaContatos(arquivoContatos, agenda) -1;
		System.out.println("Carregamos " + carregados + " registros.");
	}
}
