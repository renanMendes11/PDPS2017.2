package factorys;

import model.Comodo;
import model.LoucaConforto;
import model.MetalConforto;
import model.ParedeConforto;
import model.PisoConforto;
import model.PortaConforto;
import model.TintaConforto;

public class CasaConfortoFactory extends CasaFactory{

	public Comodo montarComodo(String nome) {
		Comodo c = new Comodo(nome);
		c.setLouca(new LoucaConforto());
		c.setMetal(new MetalConforto());
		c.setParede(new ParedeConforto());
		c.setPiso(new PisoConforto());
		c.setPorta(new PortaConforto());
		c.setTinta(new TintaConforto());
		
		return c;
	}

}
