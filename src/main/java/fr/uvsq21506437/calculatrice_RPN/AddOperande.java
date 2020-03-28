package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;

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
	public <T> void operandes(T d) throws PilePleineException {
		action.addOp((double)d);
		
	}
	@Override
	public int getInt() throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}

}
