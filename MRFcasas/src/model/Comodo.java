package model;

public class Comodo {
	private String nome;
	private Piso piso;
	private Parede parede;
	private Porta porta;
	private Metal metal;
	private Louca louca;
	private Tinta tinta;
	
	public Comodo(String nome) {
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	public Parede getParede() {
		return parede;
	}

	public void setParede(Parede parede) {
		this.parede = parede;
	}

	public Porta getPorta() {
		return porta;
	}

	public void setPorta(Porta porta) {
		this.porta = porta;
	}

	public Metal getMetal() {
		return metal;
	}

	public void setMetal(Metal metal) {
		this.metal = metal;
	}

	public Louca getLouca() {
		return louca;
	}

	public void setLouca(Louca louca) {
		this.louca = louca;
	}

	public Tinta getTinta() {
		return tinta;
	}

	public void setTinta(Tinta tinta) {
		this.tinta = tinta;
	}



}
