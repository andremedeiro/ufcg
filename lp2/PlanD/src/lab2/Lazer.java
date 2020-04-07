package lab2;

public class Lazer {
	
	private String tipo;
	private int limiteMinutos;
	private String[] atividades;
	
	public Lazer(String tipo) {
		this.tipo = tipo;
		this.limiteMinutos = 60;
		this.atividades = new String[this.limiteMinutos];
	}
	
	public Lazer(String tipo, int minutos) {
		this.tipo = tipo;
		this.limiteMinutos = minutos;
		this.atividades = new String[this.limiteMinutos];
	}
	
	public void cadastraAtividade(String nome, int minutos) {
		if(this.limiteMinutos > this.tempoTotal() + minutos) {
			boolean pode = false;
			
			for(String atividade : this.atividades) {
				pode = atividade.contains(nome);
			}
			
			if (pode) {
				this.atividades[this.totalAtividades()] = nome + "/" + minutos;
			}
		}
	}
	
	public int totalAtividades() {
		int total = 0;
		for (int i = 0; i < this.atividades.length; i++) {
			if (this.atividades[i] != null) {
				total += 1;
			} else break;
		}
		return total;
	}
	
	public int tempoTotal() {
		int total = 0;
		for (int i = 0; i < this.totalAtividades(); i++) {
			String atividade = this.atividades[i];
			total += Integer.parseInt(atividade.split("/")[1]);
			
		}
		return total;
	}
	
	public String menorAtividade() {
		String menor = this.atividades[0];
		for (String atividade : this.atividades) {
			if(Integer.parseInt(atividade.split("/")[1]) <= Integer.parseInt(menor.split("/")[1])) {
				menor = atividade;
			}
		}
		return menor;
	}
	
	public String maiorAtividade() {
		String maior = this.atividades[0];
		for (String atividade : this.atividades) {
			if(Integer.parseInt(atividade.split("/")[1]) >= Integer.parseInt(maior.split("/")[1])) {
				maior = atividade;
			}
		}
		return maior;
	}
	
	@Override
	public String toString() {
		String resultado = "";
		for(int i = 0; i < this.totalAtividades(); i++ ) {
			String atividade = this.atividades[i].split("/")[0];
			if (!resultado.equals("")) {
				resultado += ", " + atividade;
			} else {
				resultado += atividade;
			}
			
		}
		return this.tipo + ": " + resultado;
	}
	
}
