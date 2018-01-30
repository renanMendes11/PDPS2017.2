package teste;

import factorys.CasaBasicaFactory;
import factorys.CasaConfortoFactory;
import factorys.CasaFactory;
import factorys.CasaLuxoFactory;
import model.Casa;

public class Teste {
		
	
	public static void main(String[] args) {
		//Montando casa basica: 1 piso, 4 paredes, 1 porta, 1 tinta, 1 metal e 0 louça
		Casa casa1 = new Casa("Antonio Targino", "415");
		CasaFactory cb = new CasaBasicaFactory();
		int casa1Size = casa1.getComodos().size();
		casa1.getComodos().add(cb.montarComodo("sala"));
		casa1.getComodos().get(casa1Size).getPiso().setQuantidade(1);
		casa1.getComodos().get(casa1Size).getParede().setQuantidade(4);
		casa1.getComodos().get(casa1Size).getPorta().setQuantidade(1);
		casa1.getComodos().get(casa1Size).getTinta().setQuantidade(1);
		casa1.getComodos().get(casa1Size).getMetal().setQuantidade(1);
		
		//Montando casa confortavel: 2 comodos
		// sala: 1 piso, 6 paredes, 1 porta, 1 tinta, 1 metal, 0 louça
		Casa casa2 = new Casa("Epitácio Pessoa", "520");
		CasaFactory cf = new CasaConfortoFactory();
		int casa2Size = casa2.getComodos().size();
		casa2.getComodos().add(cf.montarComodo("sala"));
		casa2.getComodos().get(casa2Size).getPiso().setQuantidade(1);
		casa2.getComodos().get(casa2Size).getParede().setQuantidade(6);
		casa2.getComodos().get(casa2Size).getPorta().setQuantidade(1);
		casa2.getComodos().get(casa2Size).getTinta().setQuantidade(1);
		casa2.getComodos().get(casa2Size).getMetal().setQuantidade(1);
		
		// cozinha: 1 piso, 4 paredes, 1 porta, 1 tinta,1 metal, 2 louças
		casa2Size = casa2.getComodos().size();
		casa2.getComodos().add(cf.montarComodo("cozinha"));
		casa2.getComodos().get(casa2Size).getPiso().setQuantidade(1);
		casa2.getComodos().get(casa2Size).getParede().setQuantidade(4);
		casa2.getComodos().get(casa2Size).getPorta().setQuantidade(1);
		casa2.getComodos().get(casa2Size).getTinta().setQuantidade(1);
		casa2.getComodos().get(casa2Size).getLouca().setQuantidade(2);
		casa2.getComodos().get(casa2Size).getMetal().setQuantidade(1);
		
		//Montando casa luxo: 3 comodos
		// sala: 2 pisos, 8 paredes, 2 portas, 2 tintas, 3 metais, 0 louças
		Casa casa3 =  new Casa("Rui carneiro", "112");
		CasaFactory cl = new CasaLuxoFactory();
		int casa3Size = casa3.getComodos().size();
		casa3.getComodos().add(cl.montarComodo("sala"));
		casa3.getComodos().get(casa3Size).getPiso().setQuantidade(2);
		casa3.getComodos().get(casa3Size).getParede().setQuantidade(8);
		casa3.getComodos().get(casa3Size).getPorta().setQuantidade(2);
		casa3.getComodos().get(casa3Size).getTinta().setQuantidade(2);
		casa3.getComodos().get(casa3Size).getMetal().setQuantidade(3);
		
		//cozinha: 1 piso, 6 paredes, 2 portas, 1 tinta, 4 metais, 3 louças
		casa3Size = casa3.getComodos().size();
		casa3.getComodos().add(cl.montarComodo("cozinha"));
		casa3.getComodos().get(casa3Size).getPiso().setQuantidade(1);
		casa3.getComodos().get(casa3Size).getParede().setQuantidade(6);
		casa3.getComodos().get(casa3Size).getPorta().setQuantidade(2);
		casa3.getComodos().get(casa3Size).getTinta().setQuantidade(1);
		casa3.getComodos().get(casa3Size).getMetal().setQuantidade(4);
		casa3.getComodos().get(casa3Size).getLouca().setQuantidade(3);
		
		//quarto: 2 pisos, 5 paredes, 1 porta, 1 tinta, 2 metais
		casa3Size = casa3.getComodos().size();
		casa3.getComodos().add(cl.montarComodo("quarto"));
		casa3.getComodos().get(casa3Size).getPiso().setQuantidade(2);
		casa3.getComodos().get(casa3Size).getParede().setQuantidade(5);
		casa3.getComodos().get(casa3Size).getPorta().setQuantidade(1);
		casa3.getComodos().get(casa3Size).getTinta().setQuantidade(1);
		casa3.getComodos().get(casa3Size).getMetal().setQuantidade(2);
		System.out.println("Casa 1 :" + casa1);
		System.out.println("Casa 2 :" + casa2);
		System.out.println("Casa 3 :" + casa3);
	}

}
