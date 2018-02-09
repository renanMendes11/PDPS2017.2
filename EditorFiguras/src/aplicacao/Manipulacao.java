package aplicacao;
import exercicioComposite.*;
public class Manipulacao {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(1);
		Circulo c2 = new Circulo(2);

		
		Reta r1 = new Reta(1.2);
		Reta r2 = new Reta(2);
		Reta r3 = new Reta(1.5);
		
		Triangulo t1 = new TrianguloEquilatero(r1);
		t1.setAltura(2);
		t1.setBase(3);
		Triangulo t2 = new TrianguloIsosceles(r1, r3);
		Triangulo t3 = new TrianguloEscaleno(r1, r2, r3);
		Triangulo t4 = new TrianguloEquilatero(r2);
		
		FiguraComposta f1 = new FiguraComposta();
		f1.getCirculos().add(c1);
		f1.getCirculos().add(c2);
		f1.getTriangulos().add(t1);
		
		System.out.println("\nCirculo 1:\n");
		System.out.println(c1);
		System.out.println(c1.area());
		System.out.println(c1.perimetro());
		c1.desenha();
		
		System.out.println("\nCirculo 2:\n");
		System.out.println(c2);
		System.out.println(c2.area());
		System.out.println(c2.perimetro());
		c2.desenha();
		
		System.out.println("\nTriangulo 1:\n");
		System.out.println(t1);
		System.out.println(t1.area());
		System.out.println(t1.perimetro());
		t1.desenha();
		
		System.out.println("\nFigura Composta 1:\n");
		System.out.println(f1);
		System.out.println(f1.area());
		System.out.println(f1.perimetro());
		f1.desenha();
		

	}

}
