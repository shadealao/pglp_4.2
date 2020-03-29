package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;

public class GetSizeListOperande implements Interpreteur{
	private final Action action; 
	
	public GetSizeListOperande(Action action) {
		this.action = action;
	}

	@Override
	public void execute() throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
	
	@Override 
    public String execute(String s) throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}

	@Override
	public void operandes(double d) throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
		//action.afficheoperandes();
	}
	
	@Override
	public void operation(char c) throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
	
	@Override
	public int getInt() throws EstPileVideException {
		return action.getSizeListeOperande();
	}

}
