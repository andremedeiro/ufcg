package agenda;

/**
 * Uma agenda que mantém uma lista de contatos com posições. Podem existir 100 contatos. 
 * 
 * @author nazareno e André Martins
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
	 * @return Um array com as representações textuais dos usuários.
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
	 * Acessa a lista de contatos mantida e trás somente o nome e telefone prioritário do contato.
	 * @return Um array com cada representação informando o nome e telefone prioritário do contato.
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
	 * Acessa a lista de contatos mantida e trás somente o nome e telefone do whatsapp do contato.
	 * @return Um array com cada representação informando o nome e telefone do whatsapp do contato.
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
	 * Acessa os dados de um contato específico.
	 * @param posicao Posição do contato na agenda.
	 * @return Dados do contato. Null se não há contato na posição.
	 */
	public String getContato(int posicao) {
		if(contatos[posicao -1] != null) {
			return contatos[posicao - 1].exibir();
		}
		return null;
	}
	
	/**
	 * Verifica se duas agendas são iguais. A definição é feita observando se as listas possuem os mesmos contatos nas mesmas posições
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
	 * Cadastra um contato em uma posição. Um cadastro em uma posição que já existe sobrescreve o anterior. 
	 * @param posicao Posição do contato.
	 * @param nome Nome do contato.
	 * @param sobrenome sobrenome do contato.
	 * @param telefone1 Telefone 1 do contato.
	 * @param telefone2 Telefone 2 do contato.
	 * @param telefone3 Telefone 3 do contato. 
	 * @param telefone_prioritario Número que representa qual dos telefones é o prioritário.
	 * @param numero_zap Número que representa qual dos telefones é o do whatsapp.
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
