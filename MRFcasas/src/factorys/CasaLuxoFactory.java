package factorys;

import model.Comodo;
import model.LoucaLuxo;
import model.MetalLuxo;
import model.ParedeLuxo;
import model.PisoLuxo;
import model.PortaLuxo;
import model.TintaLuxo;

public class CasaLuxoFactory extends CasaFactory{

	public Comodo montarComodo(String nome) {
		Comodo c = new Comodo(nome);
		c.setLouca(new LoucaLuxo());
		c.setMetal(new MetalLuxo());
		c.setParede(new ParedeLuxo());
		c.setPiso(new PisoLuxo());
		c.setPorta(new PortaLuxo());
		c.setTinta(new TintaLuxo());
		
		return c;
		
	}

}
