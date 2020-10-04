package agenda;

/**
 * Uma agenda que mant�m uma lista de contatos com posi��es. Podem existir 100 contatos. 
 * 
 * @author nazareno e Andr� Martins
 *
 */
public class Agenda {
	
	private static final int TAMANHO_AGENDA = 100;
	
	private Contato[] contatos;

	/**
	 * Cria uma agenda.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
	}
	
	/**
	 * Acessa a lista de contatos mantida.
	 * @return Um array com as representa��es textuais dos usu�rios.
	 */
	public String[] getContatos() {
		
		String[] retorno = new String[100];
		
		for(int i = 0; i < this.contatos.length; i++) {
			if(this.contatos[i] != null) {
				retorno[i] = this.contatos[i].toString(); 
			}
		}
		
		return retorno;
	}
	
	/**
	 * Acessa a lista de contatos mantida e tr�s somente o nome e telefone priorit�rio do contato.
	 * @return Um array com cada representa��o informando o nome e telefone priorit�rio do contato.
	 */
	public String[] prioritarios() {
		
		String[] retorno = new String[100];
		
		for(int i = 0; i < this.contatos.length; i++) {
			if(this.contatos[i] != null) {
				retorno[i] = this.contatos[i].prioritario(); 
			}
		}
		
		return retorno;
	}
	
	/**
	 * Acessa a lista de contatos mantida e tr�s somente o nome e telefone do whatsapp do contato.
	 * @return Um array com cada representa��o informando o nome e telefone do whatsapp do contato.
	 */
	public String[] zaps() {
		
		String[] retorno = new String[100];
		
		for(int i = 0; i < this.contatos.length; i++) {
			if(this.contatos[i] != null) {
				retorno[i] = this.contatos[i].zap(); 
			}
		}
		
		return retorno;
	}
	

	/**
	 * Acessa os dados de um contato espec�fico.
	 * @param posicao Posi��o do contato na agenda.
	 * @return Dados do contato. Null se n�o h� contato na posi��o.
	 */
	public String getContato(int posicao) {
		if(contatos[posicao -1] != null) {
			return contatos[posicao - 1].exibir();
		}
		return null;
	}
	
	/**
	 * Verifica se duas agendas s�o iguais. A defini��o � feita observando se as listas possuem os mesmos contatos nas mesmas posi��es
	 * @return Retorna um booleano informando verdadeiro ou falso
	 */
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		
		if (this.getClass() != o.getClass()) {
			return false;
		}
		
		boolean resultado = true;
		Agenda agenda = (Agenda) o;
		
		for(int i = 0; i < this.contatos.length; i++) {
			
			if (this.contatos[i] == null && agenda.contatos[i] != null) {
				resultado = false;
				break;
			} else if(this.contatos[i] != null && !this.contatos[i].exibir().equals(agenda.contatos[i].exibir())) {
				resultado = false;
				break;
			}
		}
		
		return resultado;
	}
	
	/**
	 * Retorna o hashCode da lista de contatos.
	 * @return Um valor inteiro informando a lista de contatos.
	 */
	public int hashCode() {
		return this.contatos.hashCode();
	}
	
	
	/**
	 * Cadastra um contato em uma posi��o. Um cadastro em uma posi��o que j� existe sobrescreve o anterior. 
	 * @param posicao Posi��o do contato.
	 * @param nome Nome do contato.
	 * @param sobrenome sobrenome do contato.
	 * @param telefone1 Telefone 1 do contato.
	 * @param telefone2 Telefone 2 do contato.
	 * @param telefone3 Telefone 3 do contato. 
	 * @param telefone_prioritario N�mero que representa qual dos telefones � o priorit�rio.
	 * @param numero_zap N�mero que representa qual dos telefones � o do whatsapp.
	 */
	public void cadastraContato(int posicao, String nome, String sobrenome, String telefone1, String telefone2, String telefone3, int telefone_prioritario, int numero_zap) {
		
		if(nome == null) {
			throw new NullPointerException();
		}
		
		if(nome.equals("") || nome.trim().length() == 0) {
			throw new IllegalArgumentException();
		}
		
		this.contatos[posicao-1] = new Contato(posicao, nome, sobrenome, telefone1, telefone2, telefone3, telefone_prioritario, numero_zap);
	}

}
