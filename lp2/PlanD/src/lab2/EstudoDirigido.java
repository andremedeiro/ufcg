package lab2;

public class EstudoDirigido {
	private Estudo[] estudos;
	
	public EstudoDirigido() {
		this.estudos = new Estudo[5];
	}
	
	public void cadastraEstudo(Estudo estudo) {
		for (int i = 0; i < 5; i++) {
			if(this.estudos[i] == null) {
				this.estudos[i] = estudo;
				break;
			} else {
				if(this.estudos[i].deveDescansar()) {
					this.estudos[i] = estudo;
					break;
				}
			}
		}
	}
	
	public int contaTempoEstudo() {
		int total = 0;
		for (Estudo estudo : this.estudos) {
			total += estudo.getMinutos();
		}
		return total;
	}
	
	public String toString() {
		String resultado = "";
		for (Estudo estudo : this.estudos) {
			if(estudo != null) {
				if (resultado.equals("")) {
					resultado += estudo.toString();
				} else resultado += "\n" + estudo.toString();
			}
		}
		return resultado;
	}	
}
