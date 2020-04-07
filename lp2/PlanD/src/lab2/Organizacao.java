package lab2;

public class Organizacao {
	
	private String local;
	private String[] numTarefas;
	private int minutos;
	
	public Organizacao(String local, int numTarefas) {
		this.local = local;
		this.numTarefas = new String[numTarefas];
		this.minutos = 0;
	}
	
	public void cadastraTarefa(int idTarefa, int minutos) {
		this.numTarefas[idTarefa] = minutos + "/";
		this.minutos = 0;
		for (int i = 0; i<this.numTarefas.length; i++) {
			this.minutos += Integer.parseInt(this.numTarefas[i].split("/")[0]);
		}
	}
	
	public void cadastraTarefa(int idTarefa, String descricao, int minutos) {
		this.numTarefas[idTarefa] = minutos + "/" + descricao;
		this.minutos = 0;
		for (int i = 0; i<this.numTarefas.length; i++) {
			this.minutos += Integer.parseInt(this.numTarefas[i].split("/")[0]);
		}
	}
	
	public int getDuracaoTarefa(int idTarefa) {
		return Integer.parseInt(this.numTarefas[idTarefa].split("/")[0]);
	}
	
	public int mediaTarefa() {
		return this.minutos/this.numTarefas.length;
	}
	
	public String getDescricao(int idTarefa) {
		String descricao = "";
		descricao = this.numTarefas[idTarefa].split("/")[1];
		if (descricao.equals("")) {
			return null;
		} else
			return descricao;
	
	}
	
	@Override
	public String toString() {
		int cadastradas = 0;
		for(int i = 0; i < this.numTarefas.length; i++) {
			if (this.numTarefas[i] != null) {
				cadastradas++;
			}
		}
		return this.local + " (" + cadastradas + " tarefas, " + this.mediaTarefa() + "min/tarefa)";
	}
	
}
