package fr.uvsq21506437.calculatrice_RPN;

import java.util.ArrayList;

public class AfficherOperandes implements Interpreteur{
	private final Action action;
	
	public AfficherOperandes(Action action) {
		this.action = action;
	}

	@Override
	public void execute() {
		action.afficheoperandes();
		
		
	}

	@Override
	public <T> void operandes(T d) {
		//action.afficheoperandes();
		//générer une exception
		
	}
	

}
