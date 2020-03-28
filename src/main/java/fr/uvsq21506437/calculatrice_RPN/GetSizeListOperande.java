package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;

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
	public <T> void operandes(T d) throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
	
	@Override
	public int getInt() throws EstPileVideException {
		return action.getSizeListeOperande();
	}

}
