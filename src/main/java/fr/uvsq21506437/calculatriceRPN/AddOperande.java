package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;

public class AddOperande implements Interpreteur {
	private final Action action;
	
	public  AddOperande(Action action) {
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
	public void operandes(double d) throws PilePleineException {
		action.addOp(d);	
	}
	
	@Override
	public void operation(char c) throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
	
	@Override
	public int getInt() throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}

}
