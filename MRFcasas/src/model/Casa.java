package model;
import java.util.ArrayList;

public class Casa {

	public String toString() {
		return "\nRua = " + rua + ", numero= " + numero + ", comodos: " + exibeComodos();
	}

	private String rua;
	private String numero;
	private ArrayList<Comodo> comodos;

	public Casa(String rua, String numero) {
		this.rua = rua;
		this.numero = numero;
		this.comodos = new ArrayList<Comodo>();
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public ArrayList<Comodo> getComodos() {
		return comodos;
	}

	public void setComodos(ArrayList<Comodo> comodos) {
		this.comodos = comodos;
	}
	
	public String exibeComodos() {
		String comodos = "";
		
		for (Comodo c : this.comodos) {
			comodos += "\n"+c.getNome()+":";
			comodos += "\nPiso: " + c.getPiso().getTipo() + " Quantidade: "+c.getPiso().getQuantidade();
			comodos += "\nParede: " + c.getParede().getTipo() + " Quantidade: "+c.getParede().getQuantidade();
			comodos += "\nPorta: " + c.getPorta().getTipo() + " Quantidade: "+c.getPorta().getQuantidade();
			comodos += "\nMetal: " + c.getMetal().getTipo() + " Quantidade: "+c.getMetal().getQuantidade();
			comodos += "\nTinta: " + c.getTinta().getTipo() + " Quantidade: "+c.getTinta().getQuantidade();
			comodos += "\nLouça: " + c.getLouca().getTipo() + " Quantidade: "+c.getLouca().getQuantidade()+"\n";
		}
		
		return comodos;
	}



}
