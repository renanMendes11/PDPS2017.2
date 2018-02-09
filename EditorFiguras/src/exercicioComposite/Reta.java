package exercicioComposite;

public class Reta {
	private double tamanho;
	
	public Reta(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "Reta [tamanho=" + tamanho + "]";
	}

}
