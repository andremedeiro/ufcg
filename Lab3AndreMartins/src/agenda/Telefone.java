package agenda;

public class Telefone {
	
	/**
	 * DDD, representa o código de área do estado.
	 */
	private String ddd;
	/**
	 * Código do País, representa o código do país.
	 */
	private String codPais;
	/**
	 * Número do telefone e também a parte mais importante
	 */
	private String numero;
	/**
	 * Tipo do telefone, pode ser CELULAR, TRABALHO ou CASA.
	 */
	private String tipo;
	
	/**
	 * Constrói um Telefone
	 * 
	 * @param ddd DDD do Telefone.
	 * @param codPais, código do país.
	 * @param numero, Número do telefone.
	 * @param tipo, Tipo do telefone.
	 */
	public Telefone(String ddd, String codPais, String numero, String tipo) {
		
		// Verifica se o numero ou tipo do contato é nulo
		if(numero == null || tipo == null) {
			throw new NullPointerException();
		}
		// Verifica se o número e o tipo do telefone são vazios
		if(numero.equals("") || numero.trim().length() == 0 || tipo.equals("") || tipo.trim().length() == 0) {
			throw new IllegalArgumentException();
		}
		
		this.ddd = ddd;
		this.codPais = codPais;
		this.numero = numero;
		this.tipo = tipo;
	}
	
	/**
	 * Representação textual do Telefone, segue o padrão +xxx (xx) xxxxxxxx. 
	 */
	public String toString() {
		return this.tipo.toUpperCase() + ": " + this.codPais + " " + this.ddd + " " + this.numero;
	}
	
	
	/**
	 * Verifica se um Telefone é igual outro
	 */
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		
		if (this.getClass() != o.getClass()) {
			return false;
		}
		
		Telefone t = (Telefone) o;
		return this.hashCode() == t.hashCode();
	}
	
	/**
	 * hashCode do Telefone
	 */
	public int hashCode() {
		return this.codPais.hashCode() + this.ddd.hashCode() + this.numero.hashCode();
	}
	
}
