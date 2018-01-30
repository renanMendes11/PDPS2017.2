package factorys;

import model.Comodo;
import model.LoucaBasica;
import model.MetalBasico;
import model.ParedeBasica;
import model.PisoBasico;
import model.PortaBasica;
import model.TintaBasica;

public class CasaBasicaFactory extends CasaFactory{

	public Comodo montarComodo(String nome) {
		Comodo c = new Comodo(nome);
		c.setPiso(new PisoBasico());
		c.setLouca(new LoucaBasica());
		c.setMetal(new MetalBasico());
		c.setParede(new ParedeBasica());
		c.setPorta(new PortaBasica());
		c.setTinta(new TintaBasica());
		
		return c;
	}

}