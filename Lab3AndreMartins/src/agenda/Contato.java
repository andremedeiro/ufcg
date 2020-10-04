package agenda;

/**
 * Representa��o de um contato na agenda
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
	 * Secundario, telefone secundario. N�o � obrigat�rio e por padr�o � feito com o n�mero 3
	 */
	private String secundario;
	
	
	/**
	 * Cria um contato
	 * 
	 * @param posicao Posi��o do contato.
	 * @param nome Nome do contato.
	 * @param sobrenome sobrenome do contato.
	 * @param telefone1 Telefone 1 do contato.
	 * @param telefone2 Telefone 2 do contato.
	 * @param telefone3 Telefone 3 do contato. 
	 * @param telefone_prioritario N�mero que representa qual dos telefones � o priorit�rio.
	 * @param numero_zap N�mero que representa qual dos telefones � o do whatsapp.
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
	 * Verifica se dois contato s�o iguais. CAso o nome e sobrenome sejam igual ent�o � o mesmo contato
	 * 
	 * @param contato, o contato de compara��o
	 * @return Booleano informando se a condi��o de igualdade � verdadeira ou n�o.
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
	 * Retorna o hashcode da chave de identifica��o de um Contato, ou seja, a soma do hashCode do nome e do sobrenome.
	 * 
	 * @return Inteiro com a soma dos hashCode de nome e sobrenome.
	 */
	public int hashCode() {
		return this.nome.hashCode() + this.sobrenome.hashCode();
	}
	
	/**
	 * Exibe as informa��es do contato.
	 * @return Retorna uma representa��o textual do contato. Informando seu nome e sobrenome e tamb�m todos os seus contatos.
	 */
	public String exibir() {
		String retorno = "\n" + this.nome + " " + this.sobrenome + "\n " + this.principal + " (priorit�rio)\n " + this.whatsapp + " (zap)";
		
		if (!this.secundario.equals("")) {
			retorno += "\n " + this.secundario + " (contato secund�rio)"; 
		}
		
		return retorno;
	}
	
	
	/**
	 * Representa o contato em forma de texto, mostrando suas posi��o na agenda e seu nome
	 * @return String informando posi��o e nome.
	 */
	public String toString() {
		return this.posicao + " - " + this.nome + " " + this.sobrenome;
	}
	
	
	/**
	 * Formula uma String informando o nome e sobrenome do usu�rio e tamb�m o seu contato priorit�rio.
	 * @return String com nome e telefone priorit�rio
	 */
	public String prioritario() {
		return this.nome + " " + this.sobrenome + " - " + this.principal;
	}
	
	
	/**
	 * Formula uma String informando o nome e sobrenome do usu�rio e tamb�m o seu contato do whatsapp.
	 * @return String com nome e telefone do whatsapp
	 */
	public String zap() {
		return this.nome + " " + this.sobrenome + " - " + this.whatsapp;
	}
	
}
