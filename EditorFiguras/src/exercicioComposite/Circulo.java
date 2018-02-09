package exercicioComposite;

public class Circulo implements Figura{
	private float raio;
	
	public Circulo(float raio) {
		this.raio = raio;
	}
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

	@Override
	public double perimetro() {
		return (3.14*2)*this.raio;
	}

	@Override
	public double area() {
		return (3.14)*(this.raio*this.raio);
	}

	@Override
	public void desenha() {
		System.out.println("Desenhando circulo!\n");
		
	}
	
	
}
