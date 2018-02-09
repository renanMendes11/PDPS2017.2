package exercicioComposite;

public class Triangulo implements Figura{
	private Reta l1;
	private Reta l2;
	private Reta l3;
	private float base;
	private float altura;
	
	public Triangulo(Reta l1, Reta l2, Reta l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	public Reta getL1() {
		return l1;
	}


	public void setL1(Reta l1) {
		this.l1 = l1;
	}


	public Reta getL2() {
		return l2;
	}


	public void setL2(Reta l2) {
		this.l2 = l2;
	}


	public Reta getL3() {
		return l3;
	}


	public void setL3(Reta l3) {
		this.l3 = l3;
	}


	public float getBase() {
		return base;
	}


	public void setBase(float base) {
		this.base = base;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}



	@Override
	public String toString() {
		return "Triangulo [r1=" + l1 + ", r2=" + l2 + ", r3=" + l3 + "]";
	}
	
	@Override
	public double perimetro() {
		return this.l1.getTamanho() + this.l2.getTamanho() + this.l3.getTamanho();
	}

	@Override
	public double area() {
		return (this.base*this.altura)/2	;
	}

	@Override
	public void desenha() {
		System.out.println("Desenhando triangulo!\n");
		
	}
	
	

}