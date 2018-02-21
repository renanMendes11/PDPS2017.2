
public abstract class ParticipantColleague {
	protected Chatroom mediator;
	protected String nome;
	
	public ParticipantColleague(Chatroom m, String nome) {
		this.mediator = m;
		this.nome = nome;
	}

	public void enviarMensagem(String mensagem) {
		this.mediator.enviar(mensagem, this);
	}

	public void receberMensagem(String mensagem) {
		System.out.println("\n"+this.nome +" recebeu a mensagem: " + mensagem);
	}
	
}
