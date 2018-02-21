import java.util.ArrayList;

public class ChatroomImpl implements Chatroom {
	private ArrayList<ParticipantColleague> users;
	
	public ChatroomImpl() {
		this.users = new ArrayList<ParticipantColleague>();
	}
	
	
	public void addParticipant(ParticipantColleague participant) {
		users.add(participant);
	}
	
	
	@Override
	public void enviar(String mensagem, ParticipantColleague participant) {
		for(ParticipantColleague u : users) {
			if(u != participant )
				u.receberMensagem(mensagem);
		}

	}

}
