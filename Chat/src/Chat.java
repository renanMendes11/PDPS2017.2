
public class Chat {

	public static void main(String[] args) {
		ChatroomImpl mediator = new ChatroomImpl();
		
		//ConcreteColleagues
		HumanParticipant pessoa1 = new HumanParticipant(mediator, "João");
		HumanParticipant pessoa2 = new HumanParticipant(mediator, "Maria");
		RobotParticipant robo1 = new RobotParticipant(mediator, "walle1");
		RobotParticipant robo2 = new RobotParticipant(mediator, "walle2");
		
		mediator.addParticipant(pessoa1);
		mediator.addParticipant(pessoa2);
		mediator.addParticipant(robo1);
		mediator.addParticipant(robo2);
		
		pessoa1.enviarMensagem("Boa tarde, me chamo João");
		System.out.println("===================================================");
		pessoa2.enviarMensagem("Boa tarde, me chamo Maria");
		System.out.println("===================================================");
		robo1.enviarMensagem("Boa tarde, me chamo walle1");
		System.out.println("===================================================");
		robo2.enviarMensagem("Boa tarde, me chamo walle2");
	}

}
