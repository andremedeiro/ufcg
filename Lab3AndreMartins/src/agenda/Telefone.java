package agenda;

public class Telefone {
	
	/**
	 * DDD, representa o c�digo de �rea do estado.
	 */
	private String ddd;
	/**
	 * C�digo do Pa�s, representa o c�digo do pa�s.
	 */
	private String codPais;
	/**
	 * N�mero do telefone e tamb�m a parte mais importante
	 */
	private String numero;
	/**
	 * Tipo do telefone, pode ser CELULAR, TRABALHO ou CASA.
	 */
	private String tipo;
	
	/**
	 * Constr�i um Telefone
	 * 
	 * @param ddd DDD do Telefone.
	 * @param codPais, c�digo do pa�s.
	 * @param numero, N�mero do telefone.
	 * @param tipo, Tipo do telefone.
	 */
	public Telefone(String ddd, String codPais, String numero, String tipo) {
		
		// Verifica se o numero ou tipo do contato � nulo
		if(numero == null || tipo == null) {
			throw new NullPointerException();
		}
		// Verifica se o n�mero e o tipo do telefone s�o vazios
		if(numero.equals("") || numero.trim().length() == 0 || tipo.equals("") || tipo.trim().length() == 0) {
			throw new IllegalArgumentException();
		}
		
		this.ddd = ddd;
		this.codPais = codPais;
		this.numero = numero;
		this.tipo = tipo;
	}
	
	/**
	 * Representa��o textual do Telefone, segue o padr�o +xxx (xx) xxxxxxxx. 
	 */
	public String toString() {
		return this.tipo.toUpperCase() + ": " + this.codPais + " " + this.ddd + " " + this.numero;
	}
	
	
	/**
	 * Verifica se um Telefone � igual outro
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
