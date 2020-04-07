package lab2;

public class Estudo {
		
	private String nome;
	private int minutos;
	
	public Estudo(String nome) {
		this.nome = nome;
		this.minutos = 0;
	}
	
	public int getMinutos() {
		return this.minutos;
	}
	
	public void adicionaMinutos(int minutos) {
		this.minutos += minutos;
	}
	
	public boolean deveDescansar() {
		if (this.minutos >= 120) {
			return true;
		}
		return false;
	}	
	@Override
	public String toString() {
		return this.nome + " (" + this.minutos + " min)";
	}
	
}
