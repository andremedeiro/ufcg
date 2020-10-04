package agenda;

/**
 * Representação de um contato na agenda
 * @author andre
 */
public class Contato {
	/**
	 * Nome, nome do contato.
	 */
	private String nome;
	/**
	 * Sobrenome, sobrenome do contato.
	 */
	private String sobrenome;
	/**
	 * Posicao, posicao do contato na agenda. Pode ser entre 1 e 100.
	 */
	private int posicao;
	/**
	 * Principal, telefone principal do contato.
	 */
	private String principal;
	/**
	 * Whatsapp, telefone do whatsapp do contato.
	 */
	private String whatsapp;
	/**
	 * Secundario, telefone secundario. Não é obrigatório e por padrão é feito com o número 3
	 */
	private String secundario;
	
	
	/**
	 * Cria um contato
	 * 
	 * @param posicao Posição do contato.
	 * @param nome Nome do contato.
	 * @param sobrenome sobrenome do contato.
	 * @param telefone1 Telefone 1 do contato.
	 * @param telefone2 Telefone 2 do contato.
	 * @param telefone3 Telefone 3 do contato. 
	 * @param telefone_prioritario Número que representa qual dos telefones é o prioritário.
	 * @param numero_zap Número que representa qual dos telefones é o do whatsapp.
	 */
	public Contato(int posicao, String nome, String sobrenome, String telefone1, String telefone2, String telefone3, int telefone_prioritario, int numero_zap) {
		
		if(nome == null) {
			throw new NullPointerException();
		}
		
		if(nome.equals("") || nome.trim().length() == 0) {
			throw new IllegalArgumentException();
		}
	
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.posicao = posicao;
		
		String[] contatos = {telefone1, telefone2, telefone3};
		this.principal = contatos[telefone_prioritario -1];
		this.whatsapp = contatos[numero_zap -1];
		this.secundario = contatos[2];
	}

	
	/**
	 * Verifica se dois contato são iguais. CAso o nome e sobrenome sejam igual então é o mesmo contato
	 * 
	 * @param contato, o contato de comparação
	 * @return Booleano informando se a condição de igualdade é verdadeira ou não.
	 */
	public boolean equals(Object o) {

		if(o == null) {
			return false;
		}
		
		if (this.getClass() != o.getClass()) {
			return false;
		}
		
		Contato contato = (Contato) o;
		return this.nome.equals(contato.nome) && this.sobrenome.equals(contato.sobrenome);
	}
	
	/**
	 * Retorna o hashcode da chave de identificação de um Contato, ou seja, a soma do hashCode do nome e do sobrenome.
	 * 
	 * @return Inteiro com a soma dos hashCode de nome e sobrenome.
	 */
	public int hashCode() {
		return this.nome.hashCode() + this.sobrenome.hashCode();
	}
	
	/**
	 * Exibe as informações do contato.
	 * @return Retorna uma representação textual do contato. Informando seu nome e sobrenome e também todos os seus contatos.
	 */
	public String exibir() {
		String retorno = "\n" + this.nome + " " + this.sobrenome + "\n " + this.principal + " (prioritário)\n " + this.whatsapp + " (zap)";
		
		if (!this.secundario.equals("")) {
			retorno += "\n " + this.secundario + " (contato secundário)"; 
		}
		
		return retorno;
	}
	
	
	/**
	 * Representa o contato em forma de texto, mostrando suas posição na agenda e seu nome
	 * @return String informando posição e nome.
	 */
	public String toString() {
		return this.posicao + " - " + this.nome + " " + this.sobrenome;
	}
	
	
	/**
	 * Formula uma String informando o nome e sobrenome do usuário e também o seu contato prioritário.
	 * @return String com nome e telefone prioritário
	 */
	public String prioritario() {
		return this.nome + " " + this.sobrenome + " - " + this.principal;
	}
	
	
	/**
	 * Formula uma String informando o nome e sobrenome do usuário e também o seu contato do whatsapp.
	 * @return String com nome e telefone do whatsapp
	 */
	public String zap() {
		return this.nome + " " + this.sobrenome + " - " + this.whatsapp;
	}
	
}
