package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;

public class OperationBinaire implements Interpreteur {
	private final Action action;
	
	public OperationBinaire(Action action) {
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
	}

	@Override
	public void operation(char c) throws DivisionZeroException, EstPileVideException, PilePleineException {
		action.appliquerOp(c);
	}
	
	@Override
	public int getInt() throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}

}
