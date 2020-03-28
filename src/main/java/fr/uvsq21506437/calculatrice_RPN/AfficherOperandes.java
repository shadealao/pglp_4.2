package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;

public class AfficherOperandes implements Interpreteur{
	private final Action action;
	
	public AfficherOperandes(Action action) {
		this.action = action;
	}

	@Override
	public void execute() throws EstPileVideException {
		action.afficheoperandes();
		
	}
	
	@Override 
    public String execute(String s)throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	} 
	
	@Override
	public <T> void operandes(T d) throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
		//action.afficheoperandes();
	}
	
	@Override
	public int getInt()throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
	

}
