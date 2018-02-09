package exercicioComposite;
import java.util.ArrayList;

public class FiguraComposta implements Figura{
	private ArrayList<Circulo> circulos;
	private ArrayList<Triangulo> triangulos;
	private ArrayList<Figura> figuras;
	
	public FiguraComposta() {
		this.circulos = new ArrayList<Circulo>();
		this.triangulos = new ArrayList<Triangulo>();
	}

	
	
	@Override
	public String toString() {
		return "FiguraComposta [circulos=" + circulos + ", triangulos=" + triangulos +"]";
	}



	public ArrayList<Circulo> getCirculos() {
		return circulos;
	}

	public void setCirculos(ArrayList<Circulo> circulos) {
		this.circulos = circulos;
	}

	public ArrayList<Triangulo> getTriangulos() {
		return triangulos;
	}

	public void setTriangulos(ArrayList<Triangulo> triangulos) {
		this.triangulos = triangulos;
	}

	public ArrayList<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(ArrayList<Figura> figuras) {
		this.figuras = figuras;
	}

	@Override
	public double perimetro() {
		double perCirculos = 0;
		double perTriangulos = 0;
		for (Circulo c : this.circulos) {
			perCirculos += c.perimetro();
		}
		for (Triangulo t : this.triangulos) {
			perTriangulos += t.perimetro();
		}
		return perCirculos + perTriangulos;
	}

	@Override
	public double area() {
		double areaCirculos = 0;
		double areaTriangulos = 0;
		for (Circulo c : this.circulos) {
			areaCirculos += c.area();
		}
		for (Triangulo t : this.triangulos) {
			areaTriangulos += t.area();
		}
		return areaCirculos + areaTriangulos;
	}

	@Override
	public void desenha() {
		System.out.println("Desenhando figura composta!\n");
		
	}
}
